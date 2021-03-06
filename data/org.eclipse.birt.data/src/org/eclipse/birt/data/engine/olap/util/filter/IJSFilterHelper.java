/*******************************************************************************
 * Copyright (c) 2004, 2005 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.data.engine.olap.util.filter;

import org.eclipse.birt.data.engine.olap.api.query.ICubeFilterDefinition;
import org.eclipse.birt.data.engine.olap.data.api.DimLevel;

/**
 * 
 */
public interface IJSFilterHelper
{

	/**
	 * get aggregation all levels.
	 * @return
	 */
	public abstract DimLevel[] getAggrLevels( );

	/**
	 * get the dimension name.
	 * @return
	 */
	public abstract String getDimensionName( );

	/**
	 * 
	 * @return
	 */
	public abstract ICubeFilterDefinition getCubeFilterDefinition( );

	/**
	 * 
	 * @return
	 */
	public abstract boolean isAggregationFilter( );

	/**
	 * This method should be called before we finish the usage of this class so
	 * that to deregister the "dimension" script object from the scope and deregister
	 * the current scope from its parent.
	 */
	public abstract void close( );

}