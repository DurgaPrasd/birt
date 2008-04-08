/*******************************************************************************
 * Copyright (c) 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.model.simpleapi;

import org.eclipse.birt.report.model.api.GridHandle;
import org.eclipse.birt.report.model.api.activity.SemanticException;
import org.eclipse.birt.report.model.api.simpleapi.IGrid;

public class Grid extends ReportItem implements IGrid
{

	public Grid( GridHandle grid )
	{
		super( grid );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.engine.api.script.element.IGrid#getColumnCount()
	 */

	public int getColumnCount( )
	{
		return ( (GridHandle) handle ).getColumnCount( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.api.simpleapi.IGrid#getSummary()
	 */
	public String getSummary( )
	{
		return ( (GridHandle) handle ).getSummary( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.api.simpleapi.IGrid#setSummary(java.lang.String)
	 */
	public void setSummary( String summary ) throws SemanticException
	{
		( (GridHandle) handle ).setSummary( summary );

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.api.simpleapi.IGrid#getCaption()
	 */
	public String getCaption( )
	{
		return ( (GridHandle) handle ).getCaption( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.api.simpleapi.IGrid#setCaption(java.lang.String)
	 */
	public void setCaption( String caption ) throws SemanticException
	{
		( (GridHandle) handle ).setCaption( caption );

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.api.simpleapi.IGrid#getCaptionKey()
	 */
	public String getCaptionKey( )
	{
		return ( (GridHandle) handle ).getCaptionKey( );
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.birt.report.model.api.simpleapi.IGrid#setCaptionKey(java.lang.String)
	 */
	public void setCaptionKey( String captionKey ) throws SemanticException
	{
		( (GridHandle) handle ).setCaptionKey( captionKey );

	}

}
