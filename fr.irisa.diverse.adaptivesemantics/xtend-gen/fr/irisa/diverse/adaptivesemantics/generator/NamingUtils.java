package fr.irisa.diverse.adaptivesemantics.generator;

import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class NamingUtils {
  public static String operationNameFor(final String conceptName) {
    return (conceptName + "Op");
  }
  
  public static String interfaceNameFor(final String conceptName) {
    return (conceptName + "Interface");
  }
  
  public static String operationPathFor(final String modelName, final String conceptName) {
    String _operationNameFor = NamingUtils.operationNameFor(conceptName);
    String _plus = ((modelName + "/operations/") + _operationNameFor);
    return (_plus + ".java");
  }
  
  public static String interfacePathFor(final String modelName, final String conceptName) {
    String _interfaceNameFor = NamingUtils.interfaceNameFor(conceptName);
    String _plus = ((modelName + "/interfaces/") + _interfaceNameFor);
    return (_plus + ".java");
  }
  
  public static String nameOf(final Model model) {
    String _importURI = model.getImportURI();
    int _lastIndexOf = model.getImportURI().lastIndexOf("/");
    int _plus = (_lastIndexOf + 1);
    return _importURI.substring(_plus, model.getImportURI().lastIndexOf("."));
  }
  
  public static String computedNameFor(final SymbolRef symbol) {
    String _name = symbol.getDef().getName();
    return ("computed_" + _name);
  }
  
  public static Map<SymbolDef, String> getPathForSymbols(final DefConfiguration conf) {
    final EClass concept = conf.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    final EList<TermDef> childs = conf.getChilds();
    final int len = childs.size();
    final HashMap<SymbolDef, String> out = new HashMap<SymbolDef, String>();
    for (int i = 0; (i < len); i++) {
      {
        final TermDef child = childs.get(i);
        String _firstUpper = StringExtensions.toFirstUpper(features.get(i).getName());
        String _plus = (".get" + _firstUpper);
        final String featureGetter = (_plus + "()");
        if ((child instanceof SymbolDef)) {
          out.put(((SymbolDef)child), featureGetter);
        } else {
          if ((child instanceof DefConfiguration)) {
            boolean _equals = ((DefConfiguration)child).getConcept().getEPackage().equals(AdaptSemGenerator.getSemanticDomain());
            boolean _not = (!_equals);
            if (_not) {
              final Map<SymbolDef, String> map = NamingUtils.getPathForSymbols(((DefConfiguration)child));
              Set<SymbolDef> _keySet = map.keySet();
              for (final SymbolDef symbol : _keySet) {
                {
                  final String s = map.get(symbol);
                  map.put(symbol, (featureGetter + s));
                }
              }
              out.putAll(map);
            } else {
              final Map<SymbolDef, String> map_1 = NamingUtils.getPathForSymbols(((DefConfiguration)child));
              Set<SymbolDef> _keySet_1 = map_1.keySet();
              for (final SymbolDef symbol_1 : _keySet_1) {
                {
                  final String s = map_1.get(symbol_1);
                  String _name = features.get(i).getName();
                  String _plus_1 = ("computed_" + _name);
                  String _plus_2 = (_plus_1 + s);
                  map_1.put(symbol_1, _plus_2);
                }
              }
              out.putAll(map_1);
            }
          } else {
            if ((child instanceof ListDef)) {
              final SingleTermDef head = ((ListDef)child).getHead();
              final SymbolDef tail = ((ListDef)child).getTail();
              String _name = features.get(i).getName();
              String _plus_1 = (".get(" + _name);
              final String headGetter = (_plus_1 + "_index)");
              final String tailGetter = ".stream().skip(1).collect(Collectors.toCollection(BasicEList::new))";
              out.put(tail, (featureGetter + tailGetter));
              if ((head instanceof SymbolDef)) {
                out.put(((SymbolDef)head), (featureGetter + headGetter));
              } else {
                if ((head instanceof DefConfiguration)) {
                  final Map<SymbolDef, String> map_2 = NamingUtils.getPathForSymbols(((DefConfiguration)head));
                  Set<SymbolDef> _keySet_2 = map_2.keySet();
                  for (final SymbolDef symbol_2 : _keySet_2) {
                    {
                      final String s = map_2.get(symbol_2);
                      map_2.put(symbol_2, ((featureGetter + headGetter) + s));
                    }
                  }
                  out.putAll(map_2);
                }
              }
            }
          }
        }
      }
    }
    return out;
  }
}
