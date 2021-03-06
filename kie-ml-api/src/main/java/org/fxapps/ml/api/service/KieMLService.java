package org.fxapps.ml.api.service;

import org.fxapps.ml.api.model.Input;
import org.fxapps.ml.api.model.Result;
import org.fxapps.ml.api.runtime.KieMLContainer;

/**
 * Interface to call the underlying model
 * @author wsiqueir
 *
 */
public interface KieMLService {
	
	public Result predict(String modelId, Input data);
	
	public static KieMLService get(KieMLContainer kc) {
		return new KieMLServiceImpl(kc);
	}

}