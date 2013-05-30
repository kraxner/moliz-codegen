package org.modelexecution.xmof.vm.codegenerator.test;

import java.io.File;
import java.io.StringWriter;
import java.util.logging.Logger;

import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.modelexecution.xmof.vm.XMOFBasedModel;
import org.modelexecution.xmof.vm.XMOFVirtualMachine;
import org.modelexecution.xmof.vm.codegenerator.CodeGenerator;
import org.modelexecution.xmof.vm.codegenerator.XMOFBasedModelLoader;

public class CodeGeneratorTest {
	private static final Logger LOG = Logger.getLogger(CodeGeneratorTest.class
			.getName());

	@Ignore
	@Test
	public void testSeries() {
		URI xmofFile = URI.createURI("platform:/plugin/org.modelexecution.xmof.examples.series/model/Series.xmof");
		URI inputModelFile = URI.createURI("platform:/plugin/org.modelexecution.xmof.examples.series/model/env1.xmi");
		XMOFBasedModelLoader loader = new XMOFBasedModelLoader();
		XMOFBasedModel xmofModel = loader.loadXMOFBasedModel(xmofFile,
				inputModelFile, null);
		Assert.assertNotNull(xmofModel);

		CodeGenerator codeGen = new CodeGenerator();
		codeGen.init(new XMOFVirtualMachine(xmofModel));
		StringWriter out = new StringWriter();
		codeGen.generate(out);

		LOG.info("generated code:");
		LOG.info(out.toString());
	}
	
	/**
	 * runs model iml1.xmi with the vm
	 * 
	 * NOTE: this test needs to be "run as JUnit Plug-in Test", else some
	 * schemas cannot be resolved: (e.g.:
	 * http://www.modelexecution.org/xmof/syntax/classes/mykernel)
	 */
//	@Ignore
	@Test
	public void testImpl() {
		URI xmofFile = URI.createFileURI((new File("resources/iml/impl.xmof"))
				.getAbsolutePath());
		URI inputModelFile = URI.createFileURI((new File(
				"resources/iml/iml1.xmi")).getAbsolutePath());

		XMOFBasedModelLoader loader = new XMOFBasedModelLoader();
		XMOFBasedModel xmofModel = loader.loadXMOFBasedModel(xmofFile,
				inputModelFile, null);
		Assert.assertNotNull(xmofModel);

		CodeGenerator codeGen = new CodeGenerator();
		codeGen.init(new XMOFVirtualMachine(xmofModel));
		StringWriter out = new StringWriter();
		codeGen.generate(out);

		LOG.info("generated code:");
		LOG.info(out.toString());
	}

}
