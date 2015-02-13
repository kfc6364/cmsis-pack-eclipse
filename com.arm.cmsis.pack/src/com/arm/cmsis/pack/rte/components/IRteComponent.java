/*******************************************************************************
* Copyright (c) 2014 ARM Ltd.
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*******************************************************************************/

package com.arm.cmsis.pack.rte.components;

/**
 * Class that represents component entity that can be selected 
 */
public interface IRteComponent extends IRteComponentItem {

	/**
	 * Sets/resets component selection  
	 * @param count number of instances to select, 0 to reset the component selection 
	 * @return true is selection state has changed 
	 */
	boolean setSelected(int count); 
	
	/**
	 * Returns number of selected instances  
	 * @return number of selected instances
	 */
	int getSelectedCount();
	
	/**
	 * Returns maximum number of instances that can be selected for the component, default is 1
	 * @return maximum number of component instances  
	 */
	int getMaxInstanceCount();

	/**
	 * Checks if component belongs to bundle
	 * @return true if the component belongs to a bundle
	 */
	boolean hasBundle();
	

	/**
	 * Returns number of used (instantiated) instances  
	 * @return number of used instances
	 */
	int getUseCount();
	
	
}
