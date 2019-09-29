package com.koushik.javabrains.deploy;

import javax.xml.ws.Endpoint;

import org.koushik.javabrains.business.ProductCatalogImpl;

public class TestMartPublisher {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/productCatalog", new ProductCatalogImpl());
	}

}
