package org.modelexecution.xmof.vm.codegenerator.test;

import java.io.File;
import java.io.OutputStreamWriter;

import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.codegenerator.CodeGenerator;
import org.modelexecution.xmof.vm.codegenerator.XMOFBasedModelLoader;

public class CodeGeneratorTest {
	
	/**
	 * runs model iml1.xmi with the vm
	 * 
	 * NOTE: this test needs to be "run as JUnit Plug-in Test", else some schemas cannot be resolved:
	 *       (e.g.: http://www.modelexecution.org/xmof/syntax/classes/mykernel) 
	 */
	@Test
	public void testImpl() {
		URI xmofFile = URI.createFileURI((new File("resources/iml/impl.xmof")).getAbsolutePath());
		URI inputModelFile = URI.createFileURI((new File("resources/iml/iml1.xmi")).getAbsolutePath());

		XMOFBasedModelLoader loader = new XMOFBasedModelLoader();
		XMOFBasedModel xmofModel = loader.loadXMOFBasedModel(xmofFile, inputModelFile, null);
		Assert.assertNotNull(xmofModel);
		
		CodeGenerator codeGen = new CodeGenerator();
		codeGen.init(new XMOFVirtualMachine(xmofModel));
		codeGen.generate(new OutputStreamWriter(System.out));
		
	}

}
