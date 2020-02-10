package com.dsu.integrationassignment;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.dsu.integrationassignment.entities.Product;

@Consumes("application/json")
@Produces("application/json")
@Path("/productservice")
public interface ProductService {
	
	List<Product> getProducts();
	
	Product getProduct(int id);
	
	Response createProduct(Product product);
	
	Response updateProduct(Product product);

	
	
}
