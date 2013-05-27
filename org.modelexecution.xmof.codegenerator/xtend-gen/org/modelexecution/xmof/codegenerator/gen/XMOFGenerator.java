package org.modelexecution.xmof.codegenerator.gen;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.modelexecution.xmof.Syntax.Activities.IntermediateActivities.Activity;
import org.modelexecution.xmof.Syntax.Classes.Kernel.MainEClass;
import org.modelexecution.xmof.Syntax.CommonBehaviors.BasicBehaviors.Behavior;

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
      {
        boolean _matched = false;
        if (!_matched) {
          if (o instanceof MainEClass) {
            final MainEClass _mainEClass = (MainEClass)o;
            _matched=true;
            fsa.generateFile("Eclass", "asdf");
          }
        }
        MainEClass main = ((MainEClass) o);
        Behavior behavior = main.getClassifierBehavior();
        Activity activity = ((Activity) behavior);
        String name = activity.getName();
      }
    }
  }
}
