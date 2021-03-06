/*******************************************************************************
 * Copyright (c) 2012 - 2015 Signal Iduna Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Signal Iduna Corporation - initial API and implementation
 * akquinet AG
 *******************************************************************************/
package org.testeditor.ui.wizardpages.nameinspector;

/**
 * Name inspector for Test Project.
 * 
 * @author fokoh
 * 
 */
public class TestProjectNameInspector extends NameInspector implements INameInspector {
	@Override
	public boolean isNameValid(String name) {
		return true;

	}

	@Override
	public String nameInvalideMessage() {
		return null;
	}

}
