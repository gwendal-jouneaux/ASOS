package fr.irisa.diverse.adaptivesemantics.generator;

import fr.irisa.diverse.adaptivesemantics.generator.visitors.SymbolPath;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DomainAccessExpression;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Model;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess;
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
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class NamingUtils {
  public static String operationNameFor(final String conceptName) {
    return (conceptName + "Op");
  }
  
  public static String interfaceNameFor(final String conceptName) {
    return (conceptName + "Interface");
  }
  
  public static String moduleNameFor(final String conceptName) {
    return (conceptName + "Module");
  }
  
  public static String adaptationNameFor(final String conceptName) {
    return (conceptName + "AdaptationRule");
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
  
  public static String modulePathFor(final String modelName, final String conceptName) {
    String _moduleNameFor = NamingUtils.moduleNameFor(conceptName);
    String _plus = ((modelName + "/adaptations/modules/") + _moduleNameFor);
    return (_plus + ".java");
  }
  
  public static String adaptationPathFor(final String modelName, final String conceptName) {
    String _adaptationNameFor = NamingUtils.adaptationNameFor(conceptName);
    String _plus = ((modelName + "/adaptations/rules/") + _adaptationNameFor);
    return (_plus + ".java");
  }
  
  public static String indexNameFor(final String feature) {
    return ("index_" + feature);
  }
  
  public static String nameOf(final Model model) {
    String _importURI = model.getImportURI();
    int _lastIndexOf = model.getImportURI().lastIndexOf("/");
    int _plus = (_lastIndexOf + 1);
    return _importURI.substring(_plus, model.getImportURI().lastIndexOf("."));
  }
  
  public static String computedNameFor(final SymbolRef symbol) {
    return NamingUtils.computedNameFor(symbol.getDef().getName());
  }
  
  public static String computedNameFor(final String name) {
    return ("computed_" + name);
  }
  
  public static String localNameFor(final String name) {
    return ("local_" + name);
  }
  
  public static String pathFor(final DomainAccessExpression fqn, final Map<SymbolDef, SymbolPath> ruleTable) {
    if ((fqn instanceof SymbolDef)) {
      return ruleTable.get(fqn).getUnknownForm();
    }
    if ((fqn instanceof SemanticDomainAccess)) {
      String _pathFor = NamingUtils.pathFor(((SemanticDomainAccess)fqn).getReciever(), ruleTable);
      String _plus = (_pathFor + ".get");
      String _firstUpper = StringExtensions.toFirstUpper(((SemanticDomainAccess)fqn).getField());
      String _plus_1 = (_plus + _firstUpper);
      return (_plus_1 + "()");
    }
    if ((fqn instanceof Self)) {
      return "node";
    }
    return null;
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
        String _plus = ("node.get" + _firstUpper);
        final String featureGetter = (_plus + "()");
        final String computedVar = NamingUtils.computedNameFor(features.get(i).getName());
        if ((child instanceof SymbolDef)) {
          final String conditionalAccess = (((((("(" + computedVar) + " == null ? ") + featureGetter) + " : ") + computedVar) + ")");
          out.put(((SymbolDef)child), conditionalAccess);
        } else {
          if ((child instanceof DefConfiguration)) {
            boolean _isValue = RuleUtils.isValue(((DefConfiguration)child).getConcept());
            boolean _not = (!_isValue);
            if (_not) {
              final Map<SymbolDef, String> map = NamingUtils.getPathForSymbolsRec(((DefConfiguration)child));
              Set<SymbolDef> _keySet = map.keySet();
              for (final SymbolDef symbol : _keySet) {
                {
                  final String s = map.get(symbol);
                  map.put(symbol, (featureGetter + s));
                }
              }
              out.putAll(map);
            } else {
              final String type = ((DefConfiguration)child).getConcept().getName();
              StringConcatenation _builder = new StringConcatenation();
              _builder.append("((");
              _builder.append(type);
              _builder.append(") ");
              _builder.append(computedVar);
              _builder.append(")");
              final String castedComputedVar = _builder.toString();
              final Map<SymbolDef, String> map_1 = NamingUtils.getPathForSymbolsRec(((DefConfiguration)child));
              Set<SymbolDef> _keySet_1 = map_1.keySet();
              for (final SymbolDef symbol_1 : _keySet_1) {
                {
                  final String s = map_1.get(symbol_1);
                  map_1.put(symbol_1, (castedComputedVar + s));
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
              final String tailGetter = "";
              out.put(tail, (featureGetter + tailGetter));
              if ((head instanceof SymbolDef)) {
                out.put(((SymbolDef)head), (featureGetter + headGetter));
              } else {
                if ((head instanceof DefConfiguration)) {
                  final Map<SymbolDef, String> map_2 = NamingUtils.getPathForSymbolsRec(((DefConfiguration)head));
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
  
  public static Map<SymbolDef, String> getPathForSymbolsRec(final DefConfiguration conf) {
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
            if ((child instanceof ListDef)) {
              final SingleTermDef head = ((ListDef)child).getHead();
              final SymbolDef tail = ((ListDef)child).getTail();
              String _name = features.get(i).getName();
              String _plus_1 = (".get(" + _name);
              final String headGetter = (_plus_1 + "_index)");
              final String tailGetter = "";
              out.put(tail, (featureGetter + tailGetter));
              if ((head instanceof SymbolDef)) {
                out.put(((SymbolDef)head), (featureGetter + headGetter));
              } else {
                if ((head instanceof DefConfiguration)) {
                  final Map<SymbolDef, String> map_1 = NamingUtils.getPathForSymbols(((DefConfiguration)head));
                  Set<SymbolDef> _keySet_1 = map_1.keySet();
                  for (final SymbolDef symbol_1 : _keySet_1) {
                    {
                      final String s = map_1.get(symbol_1);
                      map_1.put(symbol_1, ((featureGetter + headGetter) + s));
                    }
                  }
                  out.putAll(map_1);
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
