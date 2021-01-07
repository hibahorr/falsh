package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Service;

import tn.esprit.spring.entity.Product;

@Service 
public class ProductService {

	public List<Product> getAllProducts() {
		
		List<Product> listOfProducts = new ArrayList<>();
		listOfProducts.add(new Product("123", "IPHONE ", "Smatphone de qualité ", 4000f, "Apple Inc"));
		listOfProducts.add(new Product("124", "Samsung ", "Smartphone de qualité ", 3050f, "Samsung Inc"));
		listOfProducts.add(new Product("125", "LG ", "Smartphone de qualité ", 2000f, "LG Inc"));
		listOfProducts.add(new Product("126", "Alcatel ", "Smartphone de qualité ", 2600f, "Alcatel Inc"));
		listOfProducts.add(new Product("127", "NOKIA ", "Smartphone de qualité ", 2550f, "NOKIA Inc"));
		listOfProducts.add(new Product("128", "Huawei", "Smatphone de qualité ", 4400f, "Huawei Inc"));
		return listOfProducts;
	}

	public Product getProductById(String id) {

		Predicate<Product> byId = p -> p.getId().equals(id);
		return filterProducts(byId);
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}
}
