package org.koushik.javabrains.business;

import java.util.List;

import javax.jws.WebService;

import org.koushik.javabrains.ProductCatalog;
import org.koushik.javabrains.ProductService;
import org.koushik.javabrains.model.Product;

@WebService(endpointInterface = "org.koushik.javabrains.ProductCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalogImpl implements ProductCatalog {

	ProductService productService = new ProductServiceImpl();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.koushik.javabrains.ProductCatalogInterface#getProductCatalogs()
	 */
	@Override
	public List<String> getProductCatalogs() {
		return productService.getProductCatalogs();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.koushik.javabrains.ProductCatalogInterface#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.koushik.javabrains.ProductCatalogInterface#addProduct(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.koushik.javabrains.ProductCatalogInterface#getProductsv2(java.lang.
	 * String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}

	@Override
	public boolean deleteProduct(String category, String product) {
		return productService.deleteProduct(category, product);
	}
}
