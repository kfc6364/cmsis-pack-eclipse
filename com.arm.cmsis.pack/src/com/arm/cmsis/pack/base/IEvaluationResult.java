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

package com.arm.cmsis.pack.base;

import com.arm.cmsis.pack.enums.EEvaluationResult;

/**
 * Interface for items that can hold EEvaluationResult value
 * @see com.arm.cmsis.pack.enums.EEvaluationResult 
 */
public interface IEvaluationResult {
	/**
	 * Returns evaluation result for this object
	 * @return evaluation result
	 */
	EEvaluationResult getEvaluationResult();
	
	
	/**
	 * Sets evaluation result.   
	 * @param result to set
	 */
	void setEvaluationResult(EEvaluationResult result);

}
