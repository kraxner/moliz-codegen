package org.modelexecution.xmof.codegenerator.gen;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.BehavioredEOperation;
import org.modelexecution.xmof.Syntax.Classes.Kernel.DirectedParameter;
import org.modelexecution.xmof.Syntax.Classes.Kernel.MainEClass;
import org.modelexecution.xmof.Syntax.Classes.Kernel.ParameterDirectionKind;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.OpaqueBehavior;

@SuppressWarnings("all")
public class XMOFGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject obj : _contents) {
      boolean _matched = false;
      if (!_matched) {
        if (obj instanceof EPackage) {
          final EPackage _ePackage = (EPackage)obj;
          _matched=true;
          this.generate(_ePackage, fsa);
        }
      }
    }
  }
  
  public void generate(final EPackage m, final IFileSystemAccess fsa) {
    EList<EObject> _eContents = m.eContents();
    for (final EObject o : _eContents) {
      boolean _matched = false;
      if (!_matched) {
        if (o instanceof MainEClass) {
          final MainEClass _mainEClass = (MainEClass)o;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          String _name = _mainEClass.getName();
          _builder.append(_name, "");
          String _plus = ("org/modelexecution/xmof/codegenerator/iml/" + _builder.toString());
          String _plus_1 = (_plus + "Xmof.java");
          CharSequence _generateMainEClass = this.generateMainEClass(_mainEClass);
          fsa.generateFile(_plus_1, _generateMainEClass);
        }
      }
      if (!_matched) {
        if (o instanceof OpaqueBehavior) {
          final OpaqueBehavior _opaqueBehavior = (OpaqueBehavior)o;
          _matched=true;
          this.doNothing(_opaqueBehavior);
        }
      }
      if (!_matched) {
        if (o instanceof BehavioredEClass) {
          final BehavioredEClass _behavioredEClass = (BehavioredEClass)o;
          _matched=true;
          StringConcatenation _builder = new StringConcatenation();
          String _name = _behavioredEClass.getName();
          _builder.append(_name, "");
          String _plus = ("org/modelexecution/xmof/codegenerator/iml/" + _builder.toString());
          String _plus_1 = (_plus + "Xmof.java");
          CharSequence _generateBehavioredEClass = this.generateBehavioredEClass(_behavioredEClass);
          fsa.generateFile(_plus_1, _generateBehavioredEClass);
        }
      }
    }
  }
  
  public void doNothing(final EObject obj) {
  }
  
  public CharSequence generateMainEClass(final MainEClass obj) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.modelexecution.xmof.codegenerator.iml;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import impModLangConfiguration.impl.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = obj.getName();
    _builder.append(_name, "");
    _builder.append("Xmof extends ");
    String _name_1 = obj.getName();
    _builder.append(_name_1, "");
    _builder.append("Impl {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    Behavior _classifierBehavior = obj.getClassifierBehavior();
    Activity activity = ((Activity) _classifierBehavior);
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generateMethodForActivity = this.generateMethodForActivity(activity);
    _builder.append(_generateMethodForActivity, "	");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMethodForActivity(final Activity activity) {
    CharSequence _xifexpression = null;
    boolean _notEquals = (!Objects.equal(activity, null));
    if (_notEquals) {
      CharSequence _xblockexpression = null;
      {
        String activityReturnType = "void";
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("public ");
        _builder.append(activityReturnType, "");
        _builder.append(" ");
        String _name = activity.getName();
        _builder.append(_name, "");
        _builder.append("Activity () {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
        _xblockexpression = (_builder);
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public CharSequence generateBehavioredEClass(final BehavioredEClass obj) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package org.modelexecution.xmof.codegenerator.iml;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import impModLangConfiguration.impl.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = obj.getName();
    _builder.append(_name, "");
    _builder.append("Xmof extends ");
    String _name_1 = obj.getName();
    _builder.append(_name_1, "");
    _builder.append("Impl {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Behavior> _ownedBehavior = obj.getOwnedBehavior();
      for(final Behavior child : _ownedBehavior) {
        {
          if ((child instanceof Activity)) {
            _builder.append("\t");
            CharSequence _generateMethodForActivity = this.generateMethodForActivity(((Activity) child));
            _builder.append(_generateMethodForActivity, "	");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.newLine();
    {
      EList<EOperation> _eAllOperations = obj.getEAllOperations();
      for(final EOperation operation : _eAllOperations) {
        {
          if ((operation instanceof BehavioredEOperation)) {
            _builder.append("\t");
            String returnType = this.getReturnType(((BehavioredEOperation) operation));
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("public ");
            _builder.append(returnType, "	");
            _builder.append(" ");
            String _name_2 = operation.getName();
            _builder.append(_name_2, "	");
            _builder.append(" (");
            String _operationParameterList = this.getOperationParameterList(((BehavioredEOperation) operation));
            _builder.append(_operationParameterList, "	");
            _builder.append(") {");
            _builder.newLineIfNotEmpty();
            {
              boolean _notEquals = (!Objects.equal(returnType, "void"));
              if (_notEquals) {
                _builder.append("\t");
                _builder.append("\t");
                _builder.append("return ");
                String _name_3 = operation.getName();
                _builder.append(_name_3, "		");
                _builder.append("Activity();");
                _builder.newLineIfNotEmpty();
              } else {
                _builder.append("\t");
                _builder.append("\t");
                String _name_4 = operation.getName();
                _builder.append(_name_4, "		");
                _builder.append("Activity();");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t");
            _builder.append("\t");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String getReturnType(final BehavioredEOperation op) {
    EList<EParameter> _eParameters = op.getEParameters();
    for (final EParameter typeParam : _eParameters) {
      {
        DirectedParameter dparam = ((DirectedParameter) typeParam);
        ParameterDirectionKind _direction = dparam.getDirection();
        boolean _equals = Objects.equal(_direction, ParameterDirectionKind.OUT);
        if (_equals) {
          EClassifier _eType = dparam.getEType();
          return this.ecoreTypeToJavaType(_eType);
        }
      }
    }
    return "void";
  }
  
  public String getOperationParameterList(final BehavioredEOperation op) {
    String paramList = "";
    boolean first = true;
    EList<EParameter> _eParameters = op.getEParameters();
    for (final EParameter typeParam : _eParameters) {
      {
        boolean _not = (!first);
        if (_not) {
          String _concat = paramList.concat(",");
          paramList = _concat;
        }
        DirectedParameter dparam = ((DirectedParameter) typeParam);
        ParameterDirectionKind _direction = dparam.getDirection();
        boolean _equals = Objects.equal(_direction, ParameterDirectionKind.IN);
        if (_equals) {
          EClassifier _eType = dparam.getEType();
          String _ecoreTypeToJavaType = this.ecoreTypeToJavaType(_eType);
          String _plus = (_ecoreTypeToJavaType + " ");
          String _name = dparam.getName();
          String _plus_1 = (_plus + _name);
          String _concat_1 = paramList.concat(_plus_1);
          paramList = _concat_1;
          first = false;
        }
      }
    }
    return paramList;
  }
  
  public String ecoreTypeToJavaType(final EClassifier cl) {
    boolean _equals = Objects.equal(cl, null);
    if (_equals) {
      return "void";
    } else {
      String _name = cl.getName();
      final String _switchValue = _name;
      boolean _matched = false;
      if (!_matched) {
        if (Objects.equal(_switchValue,"EBoolean")) {
          _matched=true;
          return "boolean";
        }
      }
      if (!_matched) {
        if (Objects.equal(_switchValue,"EInt")) {
          _matched=true;
          return "int";
        }
      }
    }
    return "void";
  }
}
