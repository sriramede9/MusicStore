package com.musicstore.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.musicstore.dao.ProductDaoImpl;
import com.musicstore.model.Product;

@Controller
public class HomeController {

	@Autowired
	ProductDaoImpl productDaoImpl;

	@RequestMapping("/home")
	public String homepage() {
		return "welcome-home";
	}

	@RequestMapping("/list")
	public String getProducts(Model model) {

		// ProductDaoImpl pimpl = new ProductDaoImpl();

		List<Product> allProducts = productDaoImpl.getAllProducts();

		model.addAttribute("productlist", allProducts);

		return "products-list";

	}

	@RequestMapping("/list/viewproduct/{id}")
	public String viewProduct(@PathVariable Integer id, Model model) throws IOException {

		model.addAttribute("product", productDaoImpl.getProductById(id));

		return "view-product";
	}

	@RequestMapping("/admin")
	public String adminPage() {
		return "admin";
	}

	@RequestMapping("/admin/productinventory")
	public String productInventory(Model model) {

		List<Product> allProducts = productDaoImpl.getAllProducts();

		model.addAttribute("productlist", allProducts);

		return "productInventory";
	}

	@RequestMapping("/admin/productinventory/addproduct")
	public String adminaddProduct(Model model) {

		model.addAttribute("productobj", new Product());

		return "add-product";
	}

	@RequestMapping(value="/admin/productinventory/formresponse", method = RequestMethod.POST)
	public String formrequesthandler(@ModelAttribute Product product) {

		//System.out.println("submitted value of product" + product);

		productDaoImpl.addProduct(product);

		return "redirect:/list";
	}

}
