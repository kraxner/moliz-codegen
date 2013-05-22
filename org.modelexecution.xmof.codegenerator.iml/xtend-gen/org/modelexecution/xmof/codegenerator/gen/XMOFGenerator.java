package org.modelexecution.xmof.codegenerator.gen;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;

@SuppressWarnings("all")
public class XMOFGenerator implements IGenerator {
  public void doGenerate(final Resource resource, final IFileSystemAccess fsa) {
    fsa.generateFile("lala", "hello there!");
  }
}
