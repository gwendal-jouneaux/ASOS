package fr.irisa.diverse.adaptivesemantics.generator.visitors;

import com.google.common.base.Objects;
import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.ListRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.TermRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.VoidList;
import java.util.Arrays;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class ConfigurationComparator {
  private final Map<SymbolDef, SymbolPath> ruleTable;
  
  public ConfigurationComparator(final Map<SymbolDef, SymbolPath> table) {
    this.ruleTable = table;
  }
  
  public String updateNode(final DefConfiguration deff, final RefConfiguration ref) {
    String out = "";
    final EList<TermDef> defChilds = deff.getChilds();
    final EList<TermRef> refChilds = ref.getChilds();
    final int len = defChilds.size();
    final EClass concept = ref.getConcept();
    final EList<EStructuralFeature> features = concept.getEAllStructuralFeatures();
    for (int i = 0; (i < len); i++) {
      boolean _equals = this.equals(defChilds.get(i), refChilds.get(i));
      boolean _not = (!_equals);
      if (_not) {
        final EStructuralFeature feature = features.get(i);
        final TermRef child = refChilds.get(i);
        final RefConfigurationCompiler refconfCompiler = new RefConfigurationCompiler(this.ruleTable);
        boolean _matched = false;
        if (child instanceof RefConfiguration) {
          _matched=true;
          final String create = refconfCompiler.compile(child);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(out);
          _builder.newLineIfNotEmpty();
          _builder.append(create);
          _builder.newLineIfNotEmpty();
          String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
          _builder.append(_computedNameFor);
          _builder.append(" = ");
          String _lastRefConfig = refconfCompiler.getLastRefConfig();
          _builder.append(_lastRefConfig);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          out = _builder.toString();
        }
        if (!_matched) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append(out);
          _builder.newLineIfNotEmpty();
          String _computedNameFor = NamingUtils.computedNameFor(feature.getName());
          _builder.append(_computedNameFor);
          _builder.append(" = ");
          String _compile = refconfCompiler.compile(child);
          _builder.append(_compile);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
          out = _builder.toString();
        }
        return out;
      }
    }
    return out;
  }
  
  protected boolean _equals(final DefConfiguration deff, final TermRef ref) {
    return false;
  }
  
  protected boolean _equals(final DefConfiguration deff, final RefConfiguration ref) {
    final EList<TermDef> defChilds = deff.getChilds();
    final EList<TermRef> refChilds = ref.getChilds();
    final int len = defChilds.size();
    if ((deff.getConcept().equals(ref.getConcept()) && (len != refChilds.size()))) {
      return false;
    }
    for (int i = 0; (i < len); i++) {
      boolean _equals = this.equals(defChilds.get(i), refChilds.get(i));
      boolean _not = (!_equals);
      if (_not) {
        return false;
      }
    }
    return true;
  }
  
  protected boolean _equals(final VoidList deff, final TermRef ref) {
    return false;
  }
  
  protected boolean _equals(final VoidList deff, final VoidList ref) {
    return true;
  }
  
  protected boolean _equals(final ListDef deff, final TermRef ref) {
    return false;
  }
  
  protected boolean _equals(final ListDef deff, final ListRef ref) {
    return (this.equals(deff.getHead(), ref.getHead()) && this.equals(deff.getTail(), ref.getTail()));
  }
  
  protected boolean _equals(final SymbolDef deff, final TermRef ref) {
    return false;
  }
  
  protected boolean _equals(final SymbolDef deff, final SymbolRef ref) {
    SymbolDef _def = ref.getDef();
    return Objects.equal(deff, _def);
  }
  
  public boolean equals(final TermDef deff, final TermRef ref) {
    if (deff instanceof SymbolDef
         && ref instanceof SymbolRef) {
      return _equals((SymbolDef)deff, (SymbolRef)ref);
    } else if (deff instanceof DefConfiguration
         && ref instanceof RefConfiguration) {
      return _equals((DefConfiguration)deff, (RefConfiguration)ref);
    } else if (deff instanceof DefConfiguration
         && ref != null) {
      return _equals((DefConfiguration)deff, ref);
    } else if (deff instanceof SymbolDef
         && ref != null) {
      return _equals((SymbolDef)deff, ref);
    } else if (deff instanceof ListDef
         && ref instanceof ListRef) {
      return _equals((ListDef)deff, (ListRef)ref);
    } else if (deff instanceof VoidList
         && ref instanceof VoidList) {
      return _equals((VoidList)deff, (VoidList)ref);
    } else if (deff instanceof ListDef
         && ref != null) {
      return _equals((ListDef)deff, ref);
    } else if (deff instanceof VoidList
         && ref != null) {
      return _equals((VoidList)deff, ref);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(deff, ref).toString());
    }
  }
}
