package fr.irisa.diverse.adaptivesemantics.generator.visitors;

import fr.irisa.diverse.adaptivesemantics.generator.NamingUtils;
import fr.irisa.diverse.adaptivesemantics.generator.RuleUtils;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.And;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignable;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Assignee;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Binding;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.BoolConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Conclusion;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.CondExpr;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Condition;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Div;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.DoubleConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Equal;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Expr;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Input;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.IntConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Is;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Less;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.LessEq;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Minus;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Mult;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Not;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.NotEqual;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Or;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Output;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Plus;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Premise;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.RefConfiguration;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Rule;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.Self;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SemanticDomainAccess;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SingleTermRef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.StringConstant;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolDef;
import fr.irisa.diverse.adaptivesemantics.model.adaptivesemantics.SymbolRef;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class RuleCompiler {
  private final Map<SymbolDef, SymbolPath> ruleTable;
  
  private String currentCore = "";
  
  private final EPackage semanticdomain;
  
  public RuleCompiler(final Map<SymbolDef, SymbolPath> table, final EPackage semanticdomain) {
    this.ruleTable = table;
    this.semanticdomain = semanticdomain;
  }
  
  protected String _compile(final Rule node) {
    final String effect = this.compileEffect(node);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(config.before_");
    String _name = node.getName();
    _builder.append(_name);
    _builder.append("() != null){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("config.before_");
    String _name_1 = node.getName();
    _builder.append(_name_1, "\t");
    _builder.append("().adapt(vis, node, execCtx, config);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if(config.specialize_");
    String _name_2 = node.getName();
    _builder.append(_name_2);
    _builder.append("() != null){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("config.specialize_");
    String _name_3 = node.getName();
    _builder.append(_name_3, "\t");
    _builder.append("().adapt(vis, node, execCtx, config);");
    _builder.newLineIfNotEmpty();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(effect, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if(config.after_");
    String _name_4 = node.getName();
    _builder.append(_name_4);
    _builder.append("() != null){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("config.after_");
    String _name_5 = node.getName();
    _builder.append(_name_5, "\t");
    _builder.append("().adapt(vis, node, execCtx, config);");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("if(result != null){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("if(! ((EObject) result).eClass().getEPackage().equals(");
    String _name_6 = this.semanticdomain.getName();
    _builder.append(_name_6, "\t");
    _builder.append("Package.eINSTANCE)){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("return ((Node) result).accept(vis, execCtx);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return result;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("} else {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("continue;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    final String core = _builder.toString();
    final String out = this.compileGuards(node, core);
    return out;
  }
  
  public String compileEffect(final Rule node) {
    String out = "";
    out = this.append(out, node.getInputs());
    out = this.append(out, node.getBindings());
    out = this.append(out, node.getConclusion());
    out = this.append(out, node.getOutputs());
    return out;
  }
  
  public String compileGuards(final Rule node, final String effect) {
    this.currentCore = effect;
    List<Premise> _reverse = ListExtensions.<Premise>reverse(node.getPremises());
    for (final Premise resolve : _reverse) {
      this.currentCore = this.compile(resolve);
    }
    List<Condition> _reverse_1 = ListExtensions.<Condition>reverse(node.getConditions());
    for (final Condition cond : _reverse_1) {
      this.currentCore = this.compile(cond);
    }
    final PatternCheckerCompiler patternCompiler = new PatternCheckerCompiler();
    StringConcatenation _builder = new StringConcatenation();
    String _generateInputCheck = patternCompiler.generateInputCheck(node.getConclusion().getFrom());
    _builder.append(_generateInputCheck);
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(this.currentCore, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    final String out = _builder.toString();
    this.currentCore = "";
    return out;
  }
  
  protected String _compile(final Premise node) {
    final PatternCheckerCompiler patternBuilder = new PatternCheckerCompiler();
    String expectedPattern = "";
    SingleTermDef _to = node.getTo();
    if ((_to instanceof DefConfiguration)) {
      SingleTermDef _to_1 = node.getTo();
      final DefConfiguration pattern = ((DefConfiguration) _to_1);
      StringConcatenation _builder = new StringConcatenation();
      {
        boolean _isTermination = node.isTermination();
        if (_isTermination) {
          _builder.append("((Termination)");
        }
      }
      String _localNameFor = NamingUtils.localNameFor(this.ruleTable.get(node.getFrom().getDef()).getValueForm());
      _builder.append(_localNameFor);
      {
        boolean _isTermination_1 = node.isTermination();
        if (_isTermination_1) {
          _builder.append(").unbox()");
        }
      }
      final String toCheck = _builder.toString();
      expectedPattern = patternBuilder.generatePremiseCheck(pattern, toCheck);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("if(");
      String _valueForm = this.ruleTable.get(node.getFrom().getDef()).getValueForm();
      _builder_1.append(_valueForm);
      _builder_1.append(" == null){");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("Object ");
      String _localNameFor_1 = NamingUtils.localNameFor(this.ruleTable.get(node.getFrom().getDef()).getValueForm());
      _builder_1.append(_localNameFor_1, "\t");
      _builder_1.append(" = ((Node) ");
      String _termForm = this.ruleTable.get(node.getFrom().getDef()).getTermForm();
      _builder_1.append(_termForm, "\t");
      _builder_1.append(").accept(vis, execCtx);");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t");
      _builder_1.append("if(");
      {
        boolean _isTermination_2 = node.isTermination();
        boolean _not = (!_isTermination_2);
        if (_not) {
          _builder_1.append("!");
        }
      }
      _builder_1.append("(");
      String _localNameFor_2 = NamingUtils.localNameFor(this.ruleTable.get(node.getFrom().getDef()).getValueForm());
      _builder_1.append(_localNameFor_2, "\t");
      _builder_1.append(" instanceof Termination)){");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append(expectedPattern, "\t\t");
      _builder_1.append("{");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t\t");
      _builder_1.append(this.currentCore, "\t\t\t");
      _builder_1.newLineIfNotEmpty();
      _builder_1.append("\t\t");
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("}");
      _builder_1.newLine();
      {
        boolean _isTermination_3 = node.isTermination();
        boolean _not_1 = (!_isTermination_3);
        if (_not_1) {
          _builder_1.append("\t");
          _builder_1.append("else {");
          _builder_1.newLine();
          _builder_1.append("\t");
          _builder_1.append("\t");
          _builder_1.append("termination = ");
          String _localNameFor_3 = NamingUtils.localNameFor(this.ruleTable.get(node.getFrom().getDef()).getValueForm());
          _builder_1.append(_localNameFor_3, "\t\t");
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t");
          _builder_1.append("}");
          _builder_1.newLine();
        }
      }
      _builder_1.append("}");
      _builder_1.newLine();
      return _builder_1.toString();
    } else {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("if(");
      String _valueForm_1 = this.ruleTable.get(node.getFrom().getDef()).getValueForm();
      _builder_2.append(_valueForm_1);
      _builder_2.append(" == null){");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("Object ");
      String _localNameFor_4 = NamingUtils.localNameFor(this.ruleTable.get(node.getFrom().getDef()).getValueForm());
      _builder_2.append(_localNameFor_4, "\t");
      _builder_2.append(" = ((Node) ");
      String _termForm_1 = this.ruleTable.get(node.getFrom().getDef()).getTermForm();
      _builder_2.append(_termForm_1, "\t");
      _builder_2.append(").accept(vis, execCtx);");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("if(");
      {
        boolean _isTermination_4 = node.isTermination();
        boolean _not_2 = (!_isTermination_4);
        if (_not_2) {
          _builder_2.append("!");
        }
      }
      _builder_2.append("(");
      String _localNameFor_5 = NamingUtils.localNameFor(this.ruleTable.get(node.getFrom().getDef()).getValueForm());
      _builder_2.append(_localNameFor_5, "\t");
      _builder_2.append(" instanceof Termination)){");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t\t");
      _builder_2.append(this.currentCore, "\t\t");
      _builder_2.newLineIfNotEmpty();
      _builder_2.append("\t");
      _builder_2.append("}");
      _builder_2.newLine();
      {
        boolean _isTermination_5 = node.isTermination();
        boolean _not_3 = (!_isTermination_5);
        if (_not_3) {
          _builder_2.append("\t");
          _builder_2.append("else {");
          _builder_2.newLine();
          _builder_2.append("\t");
          _builder_2.append("\t");
          _builder_2.append("termination = ");
          String _localNameFor_6 = NamingUtils.localNameFor(this.ruleTable.get(node.getFrom().getDef()).getValueForm());
          _builder_2.append(_localNameFor_6, "\t\t");
          _builder_2.append(";");
          _builder_2.newLineIfNotEmpty();
          _builder_2.append("\t");
          _builder_2.append("}");
          _builder_2.newLine();
        }
      }
      _builder_2.append("}");
      _builder_2.newLine();
      return _builder_2.toString();
    }
  }
  
  protected String _compile(final Conclusion node) {
    SingleTermRef _to = node.getTo();
    if ((_to instanceof RefConfiguration)) {
      SingleTermRef _to_1 = node.getTo();
      final RefConfiguration conf = ((RefConfiguration) _to_1);
      boolean _equals = conf.getConcept().equals(node.getFrom().getConcept());
      if (_equals) {
        final ConfigurationComparator cp = new ConfigurationComparator(this.ruleTable);
        return cp.updateNode(node.getFrom(), conf);
      } else {
        StringConcatenation _builder = new StringConcatenation();
        String _generateInstanceOf = RuleUtils.generateInstanceOf(conf, "out", this.ruleTable);
        _builder.append(_generateInstanceOf);
        _builder.newLineIfNotEmpty();
        {
          boolean _isTermination = node.isTermination();
          if (_isTermination) {
            _builder.append("result = new Termination(out);");
            _builder.newLine();
          } else {
            _builder.append("result = out;");
            _builder.newLine();
          }
        }
        return _builder.toString();
      }
    }
    SingleTermRef _to_2 = node.getTo();
    if ((_to_2 instanceof SymbolRef)) {
      SingleTermRef _to_3 = node.getTo();
      final SymbolRef symbol = ((SymbolRef) _to_3);
      boolean _isTermination_1 = node.isTermination();
      if (_isTermination_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("result = new Termination(");
        String _compile = this.compile(symbol);
        _builder_1.append(_compile);
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      } else {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("result = ");
        String _compile_1 = this.compile(symbol);
        _builder_2.append(_compile_1);
        _builder_2.append(";");
        _builder_2.newLineIfNotEmpty();
        return _builder_2.toString();
      }
    }
    return null;
  }
  
  protected String _compile(final Condition node) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if(");
    CondExpr _cond = node.getCond();
    String _compile = this.compile(((Expr) _cond));
    _builder.append(_compile);
    _builder.append("){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(this.currentCore, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _compile(final Binding node) {
    final Assignee assignee = node.getAssignee();
    final Assignable assignable = node.getExpr();
    if ((assignable instanceof RefConfiguration)) {
      if ((assignee instanceof SymbolDef)) {
        StringConcatenation _builder = new StringConcatenation();
        String _firstUpper = StringExtensions.toFirstUpper(((SymbolDef)assignee).getName());
        String _plus = ("to" + _firstUpper);
        String _generateInstanceOf = RuleUtils.generateInstanceOf(((RefConfiguration)assignable), _plus, this.ruleTable);
        _builder.append(_generateInstanceOf);
        _builder.newLineIfNotEmpty();
        _builder.append("Object ");
        String _name = ((SymbolDef)assignee).getName();
        _builder.append(_name);
        _builder.append(" = to");
        String _firstUpper_1 = StringExtensions.toFirstUpper(((SymbolDef)assignee).getName());
        _builder.append(_firstUpper_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
        return _builder.toString();
      }
      if ((assignee instanceof SemanticDomainAccess)) {
        StringConcatenation _builder_1 = new StringConcatenation();
        String _firstUpper_2 = StringExtensions.toFirstUpper(((SemanticDomainAccess)assignee).getField());
        String _plus_1 = ("to" + _firstUpper_2);
        String _generateInstanceOf_1 = RuleUtils.generateInstanceOf(((RefConfiguration)assignable), _plus_1, this.ruleTable);
        _builder_1.append(_generateInstanceOf_1);
        _builder_1.newLineIfNotEmpty();
        String _pathFor = NamingUtils.pathFor(((SemanticDomainAccess)assignee).getReciever(), this.ruleTable);
        _builder_1.append(_pathFor);
        _builder_1.append(".set");
        String _firstUpper_3 = StringExtensions.toFirstUpper(((SemanticDomainAccess)assignee).getField());
        _builder_1.append(_firstUpper_3);
        _builder_1.append("(to");
        String _firstUpper_4 = StringExtensions.toFirstUpper(((SemanticDomainAccess)assignee).getField());
        _builder_1.append(_firstUpper_4);
        _builder_1.append(");");
        _builder_1.newLineIfNotEmpty();
        return _builder_1.toString();
      }
    } else {
      if ((assignee instanceof SymbolDef)) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("Object ");
        String _name_1 = ((SymbolDef)assignee).getName();
        _builder_2.append(_name_1);
        _builder_2.append(" = ");
        String _compile = this.compile(assignable);
        _builder_2.append(_compile);
        _builder_2.append(";");
        _builder_2.newLineIfNotEmpty();
        return _builder_2.toString();
      }
      if ((assignee instanceof SemanticDomainAccess)) {
        StringConcatenation _builder_3 = new StringConcatenation();
        String _pathFor_1 = NamingUtils.pathFor(((SemanticDomainAccess)assignee).getReciever(), this.ruleTable);
        _builder_3.append(_pathFor_1);
        _builder_3.append(".set");
        String _firstUpper_5 = StringExtensions.toFirstUpper(((SemanticDomainAccess)assignee).getField());
        _builder_3.append(_firstUpper_5);
        _builder_3.append("(");
        String _compile_1 = this.compile(assignable);
        _builder_3.append(_compile_1);
        _builder_3.append(");");
        _builder_3.newLineIfNotEmpty();
        return _builder_3.toString();
      }
    }
    return null;
  }
  
  protected String _compile(final Input node) {
    final Assignee assignee = node.getAssignee();
    if ((assignee instanceof SymbolDef)) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Object ");
      String _name = ((SymbolDef)assignee).getName();
      _builder.append(_name);
      _builder.append(" = node.");
      String _name_1 = node.getOperation().getName();
      _builder.append(_name_1);
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    }
    if ((assignee instanceof SemanticDomainAccess)) {
      StringConcatenation _builder_1 = new StringConcatenation();
      String _pathFor = NamingUtils.pathFor(((SemanticDomainAccess)assignee).getReciever(), this.ruleTable);
      _builder_1.append(_pathFor);
      _builder_1.append(".set");
      String _firstUpper = StringExtensions.toFirstUpper(((SemanticDomainAccess)assignee).getField());
      _builder_1.append(_firstUpper);
      _builder_1.append("(node.");
      String _name_2 = node.getOperation().getName();
      _builder_1.append(_name_2);
      _builder_1.append("());");
      _builder_1.newLineIfNotEmpty();
      return _builder_1.toString();
    }
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("Object ");
    _builder_2.append(assignee);
    _builder_2.append(" = node.");
    String _name_3 = node.getOperation().getName();
    _builder_2.append(_name_3);
    _builder_2.append("();");
    _builder_2.newLineIfNotEmpty();
    return _builder_2.toString();
  }
  
  protected String _compile(final Output node) {
    throw new Error("Unresolved compilation problems:"
      + "\nInvalid number of arguments. The constructor RefConfigurationCompiler(Map<SymbolDef, SymbolPath>, String, EPackage) is not applicable for the arguments (Map<SymbolDef, SymbolPath>)");
  }
  
  protected String _compile(final Plus node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " + ") + rhs) + ")");
  }
  
  protected String _compile(final Minus node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " - ") + rhs) + ")");
  }
  
  protected String _compile(final Div node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " / ") + rhs) + ")");
  }
  
  protected String _compile(final Mult node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " * ") + rhs) + ")");
  }
  
  protected String _compile(final Or node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " || ") + rhs) + ")");
  }
  
  protected String _compile(final And node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " && ") + rhs) + ")");
  }
  
  protected String _compile(final Not node) {
    final String expr = this.compile(node.getExpr());
    return (("(!" + expr) + ")");
  }
  
  protected String _compile(final Less node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " < ") + rhs) + ")");
  }
  
  protected String _compile(final LessEq node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + " <= ") + rhs) + ")");
  }
  
  protected String _compile(final Equal node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(" + lhs) + ".equals(") + rhs) + "))");
  }
  
  protected String _compile(final NotEqual node) {
    final String lhs = this.compile(node.getLhs());
    final String rhs = this.compile(node.getRhs());
    return (((("(!" + lhs) + ".equals(") + rhs) + "))");
  }
  
  protected String _compile(final Is node) {
    final String expr = this.compile(node.getExpr());
    final PatternCheckerCompiler patternChecker = new PatternCheckerCompiler();
    return patternChecker.generateConditionCheck(node.getPattern(), expr);
  }
  
  protected String _compile(final IntConstant node) {
    return Integer.valueOf(node.getValue()).toString();
  }
  
  protected String _compile(final BoolConstant node) {
    return Boolean.valueOf(node.isValue()).toString();
  }
  
  protected String _compile(final StringConstant node) {
    return node.getValue().toString();
  }
  
  protected String _compile(final DoubleConstant node) {
    return Double.valueOf(node.getValue()).toString();
  }
  
  protected String _compile(final SemanticDomainAccess node) {
    String _compile = this.compile(node.getReciever());
    String _plus = (_compile + ".get");
    String _firstUpper = StringExtensions.toFirstUpper(node.getField());
    String _plus_1 = (_plus + _firstUpper);
    return (_plus_1 + "()");
  }
  
  protected String _compile(final Self node) {
    return "node";
  }
  
  protected String _compile(final SymbolRef node) {
    String _name = node.getDef().getName();
    String _name_1 = node.getDef().getName();
    String _name_2 = node.getDef().getName();
    final SymbolPath sp = new SymbolPath(_name, _name_1, _name_2);
    return this.ruleTable.getOrDefault(node.getDef(), sp).getUnknownForm();
  }
  
  public String append(final String text, final EList l) {
    String out = text;
    for (final Object elem : l) {
      out = this.append(out, ((EObject) elem));
    }
    return out;
  }
  
  public String append(final String text, final EObject o) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(text);
    _builder.newLineIfNotEmpty();
    String _compile = this.compile(o);
    _builder.append(_compile);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String compile(final EObject node) {
    if (node instanceof And) {
      return _compile((And)node);
    } else if (node instanceof BoolConstant) {
      return _compile((BoolConstant)node);
    } else if (node instanceof Div) {
      return _compile((Div)node);
    } else if (node instanceof DoubleConstant) {
      return _compile((DoubleConstant)node);
    } else if (node instanceof Equal) {
      return _compile((Equal)node);
    } else if (node instanceof IntConstant) {
      return _compile((IntConstant)node);
    } else if (node instanceof Less) {
      return _compile((Less)node);
    } else if (node instanceof LessEq) {
      return _compile((LessEq)node);
    } else if (node instanceof Minus) {
      return _compile((Minus)node);
    } else if (node instanceof Mult) {
      return _compile((Mult)node);
    } else if (node instanceof NotEqual) {
      return _compile((NotEqual)node);
    } else if (node instanceof Or) {
      return _compile((Or)node);
    } else if (node instanceof Plus) {
      return _compile((Plus)node);
    } else if (node instanceof Self) {
      return _compile((Self)node);
    } else if (node instanceof SemanticDomainAccess) {
      return _compile((SemanticDomainAccess)node);
    } else if (node instanceof StringConstant) {
      return _compile((StringConstant)node);
    } else if (node instanceof SymbolRef) {
      return _compile((SymbolRef)node);
    } else if (node instanceof Is) {
      return _compile((Is)node);
    } else if (node instanceof Not) {
      return _compile((Not)node);
    } else if (node instanceof Binding) {
      return _compile((Binding)node);
    } else if (node instanceof Conclusion) {
      return _compile((Conclusion)node);
    } else if (node instanceof Condition) {
      return _compile((Condition)node);
    } else if (node instanceof Input) {
      return _compile((Input)node);
    } else if (node instanceof Output) {
      return _compile((Output)node);
    } else if (node instanceof Premise) {
      return _compile((Premise)node);
    } else if (node instanceof Rule) {
      return _compile((Rule)node);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(node).toString());
    }
  }
}
