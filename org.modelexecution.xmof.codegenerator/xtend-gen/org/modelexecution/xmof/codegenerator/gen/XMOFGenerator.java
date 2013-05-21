package org.modelexecution.xmof.codegenerator.gen;

import fsa.FSA;
import fsa.State;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class XMOFGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject obj : _contents) {
      boolean _matched = false;
      if (!_matched) {
        if (obj instanceof FSA) {
          final FSA _fSA = (FSA)obj;
          _matched=true;
          this.generate(_fSA, fsa);
        }
      }
    }
  }
  
  public void generate(final FSA m, final IFileSystemAccess fsa) {
    EList<State> _states = m.getStates();
    for (final State s : _states) {
      fsa.generateFile("asfd", "asdf");
    }
  }
}
