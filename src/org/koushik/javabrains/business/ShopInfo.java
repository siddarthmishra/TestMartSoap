package org.koushik.javabrains.business;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.koushik.javabrains.exception.InvalidInputException;

@WebService
//@SOAPBinding(style = Style.RPC)
@SOAPBinding(style = Style.DOCUMENT)
public class ShopInfo {

	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException {
		String response = "Invalid Input";
		if ("shopName".equals(property))
			response = "Test Mart";
		else if ("since".equals(property))
			response = "2012";
		else {
			throw new InvalidInputException(response, property + " is not a valid input");
		}
		return response;
	}

}
