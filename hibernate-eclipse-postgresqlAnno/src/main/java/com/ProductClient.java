package com;

import com.cms.deloitte.dao.ProductDAO;
import com.cms.deloitte.dao.impl.ProductDAOImpl;
import com.cms.deloitte.model.Product;

public class ProductClient {
	public static void main(String[] args) {
		Product product = new Product(199, "Monitor", 120000, 2);
		
		//code
		ProductDAOImpl impl = new ProductDAOImpl();
		impl.addProduct(product);
		System.out.println("Done");
}
}