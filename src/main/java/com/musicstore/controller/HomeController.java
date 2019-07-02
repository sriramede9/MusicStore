package com.musicstore.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.musicstore.dao.ProductDaoImpl;
import com.musicstore.model.Product;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String homepage() {
		return "welcome-home";
	}

	@RequestMapping("/list")
	public String getProducts(Model model) {

		ProductDaoImpl pimpl = new ProductDaoImpl();

		List<Product> allProducts = pimpl.getAllProducts();

		model.addAttribute("productlist", allProducts);

		return "products-list";

	}

	@RequestMapping("/list/viewproduct/{id}")
	public String viewProduct(@PathVariable String id, Model model) throws IOException {

		model.addAttribute("product", new ProductDaoImpl().getProductbyId(id));

		return "view-product";
	}

}
