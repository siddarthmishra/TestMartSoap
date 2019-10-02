
package com.journaldev.jaxws.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.koushik.javabrains.ProductCatalog;

//Here is a client program where we are invoking our JAX-WS example web service.
public class SOAPPublisherClient {

	public static void main(String[] args) throws MalformedURLException {
		URL wsdlURL = new URL("http://localhost:1234/productCatalog?wsdl");
		// check above URL in browser, you should see WSDL file

		// creating QName using targetNamespace and name
		QName qname = new QName("http://business.javabrains.koushik.org/", "TestMartCatalogService");

		Service service = Service.create(wsdlURL, qname);

		// We need to pass interface and model beans to client
		ProductCatalog ps = service.getPort(ProductCatalog.class);

		List<String> books = ps.getProducts("books");
		displayProducts(books);

		ps.addProduct("books", "Rich Dad Poor Dad");
		ps.addProduct("books", "Book 4");

		books = ps.getProducts("books");
		displayProducts(books);

		ps.deleteProduct("books", "Rich Dad Poor Dad");
		books = ps.getProducts("books");
		displayProducts(books);

	}

	public static void displayProducts(List<String> products) {
		for (String product : products) {
			System.out.print(product + " ");
		}
		System.out.println();
	}

}
