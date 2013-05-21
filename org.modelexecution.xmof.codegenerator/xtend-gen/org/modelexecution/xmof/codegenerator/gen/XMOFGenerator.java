package org.modelexecution.xmof.codegenerator.gen;

import javax.lang.model.element.Element;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class XMOFGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    EList<EObject> _contents = resource.getContents();
    for (final EObject o : _contents) {
      this.compile(o, fsa);
    }
  }
  
  public Object compile(final Element e, final IFileSystemAccess fsa) {
    return null;
  }
  
  protected void _compile(final EObject m, final IFileSystemAccess fsa) {
  }
  
  public void compile(final EObject m, final IFileSystemAccess fsa) {
    {
      _compile(m, fsa);
      return;
    }
  }
}
