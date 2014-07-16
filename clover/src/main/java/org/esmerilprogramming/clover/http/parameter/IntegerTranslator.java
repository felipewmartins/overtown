package org.esmerilprogramming.clover.http.parameter;

import org.esmerilprogramming.clover.http.CloverRequest;

/**
 * 
 * @author efraimgentil (efraim.gentil@gmail.com)
 */
public class IntegerTranslator implements ParameterTranslator {

	@SuppressWarnings("unchecked")
	@Override
	public <T> T translate(Class<T> clazz, String parameterName,
			CloverRequest cloverRequest) {
		Object attribute = cloverRequest.getAttribute(parameterName);
		if(attribute != null){
			String strVal = String.valueOf(attribute);
			
			try{
				Integer i = Integer.parseInt(strVal);
				return (T) i; 
			}catch(NumberFormatException nfe){
				nfe.printStackTrace();
			}
		}
		return null;
	}

}