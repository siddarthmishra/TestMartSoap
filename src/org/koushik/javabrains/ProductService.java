package org.koushik.javabrains;

import java.util.List;

import org.koushik.javabrains.model.Product;

public interface ProductService {

	List<String> getProductCatalogs();

	List<String> getProducts(String category);

	boolean addProduct(String category, String product);

	List<Product> getProductsv2(String category);

}