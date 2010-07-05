/*************************************************************************************
 * Copyright (c) 2004 Actuate Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Actuate Corporation - Initial implementation.
 ************************************************************************************/

package org.eclipse.birt.chart.integration.wtp.ui.internal.webapp;

/**
 * Bean defined for Servlet object in web.xml
 * 
 */
public class ServletBean
{

	/**
	 * servlet name
	 */
	private String name;

	/**
	 * servlet class name
	 */
	private String className;

	/**
	 * description for servlet
	 */
	private String description;

	/**
	 * default constructor
	 */
	public ServletBean( )
	{
	}

	/**
	 * constructor with name and class name
	 * 
	 * @param name
	 * @param className
	 */
	public ServletBean( String name, String className )
	{
		this.name = name;
		this.className = className;
	}
	
	/**
	 * @return the name
	 */
	public String getName( )
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName( String name )
	{
		this.name = name;
	}

	/**
	 * @return the className
	 */
	public String getClassName( )
	{
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName( String className )
	{
		this.className = className;
	}

	/**
	 * @return the description
	 */
	public String getDescription( )
	{
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription( String description )
	{
		this.description = description;
	}	
}