package org.modelexecution.xmof.codegenerator.gen;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.mwe.core.WorkflowInterruptedException;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;

import com.google.common.collect.Lists;


public class NullValidator extends org.eclipse.xtext.mwe.Validator {
	@Override
	public void validate(ResourceSet resourceSet, Registry registry, Issues issues) {
		List<Resource> resources = Lists.newArrayList(resourceSet.getResources());
		for (Resource resource : resources) {
			try {
				resource.load(null);
			} catch (IOException e) {
				throw new WorkflowInterruptedException("Couldn't load resource (" + resource.getURI() + ")", e);
			}
		}
	}
}
