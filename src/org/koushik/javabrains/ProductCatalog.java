package org.koushik.javabrains;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.koushik.javabrains.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface ProductCatalog {

	@WebMethod(action = "fetch_categories", operationName = "fetchCategories")
	List<String> getProductCatalogs();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	@WebResult(name = "Product")
	List<Product> getProductsv2(String category);

	@WebMethod
	boolean deleteProduct(String category, String product);

}