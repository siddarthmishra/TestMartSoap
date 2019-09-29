package org.koushik.javabrains.business;

import java.util.ArrayList;
import java.util.List;

import org.koushik.javabrains.ProductService;
import org.koushik.javabrains.model.Product;

public class ProductServiceImpl implements ProductService {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();

	public ProductServiceImpl() {
		bookList.add("Book 1");
		bookList.add("Book 2");
		bookList.add("Book 3");

		musicList.add("Music 1");
		musicList.add("Music 2");
		musicList.add("Music 3");

		movieList.add("Movie 1");
		movieList.add("Movie 2");
		movieList.add("Movie 3");
	}

	/* (non-Javadoc)
	 * @see org.koushik.javabrains.business.ProductService#getProductCatalogs()
	 */
	@Override
	public List<String> getProductCatalogs() {
		List<String> catagories = new ArrayList<>();
		catagories.add("Books");
		catagories.add("Music");
		catagories.add("Movies");
		return catagories;
	}

	/* (non-Javadoc)
	 * @see org.koushik.javabrains.business.ProductService#getProducts(java.lang.String)
	 */
	@Override
	public List<String> getProducts(String category) {
		switch (category.toLowerCase()) {
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies":
			return movieList;
		}
		return null;
	}

	/* (non-Javadoc)
	 * @see org.koushik.javabrains.business.ProductService#addProduct(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addProduct(String category, String product) {
		switch (category.toLowerCase()) {
		case "books":
			bookList.add(product);
			return true;
		case "music":
			musicList.add(product);
			return true;
		case "movies":
			movieList.add(product);
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.koushik.javabrains.business.ProductService#getProductsv2(java.lang.String)
	 */
	@Override
	public List<Product> getProductsv2(String category) {
		List<Product> productList = new ArrayList<>();
		switch (category.toLowerCase()) {
		case "books":
			productList.add(new Product("Java Brains Book", "1234", 9999));
			productList.add(new Product("Another Book", "ABC", 250));
			return productList;
		case "music":
			break;
		case "movies":
			break;
		}
		return productList;

	}

}
