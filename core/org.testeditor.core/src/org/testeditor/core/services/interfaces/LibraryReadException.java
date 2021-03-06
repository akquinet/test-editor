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
package org.testeditor.core.services.interfaces;

import org.testeditor.core.exceptions.SystemException;

/**
 * 
 * own exception class. used by the implementors of the LibraryReaderService
 * 
 * @author llipinski
 */
public class LibraryReadException extends SystemException {

	/**
	 * constructor.
	 * 
	 * @param exception
	 *            the exception
	 */
	public LibraryReadException(Exception exception) {
		super(exception.getMessage(), exception);
	}

}
