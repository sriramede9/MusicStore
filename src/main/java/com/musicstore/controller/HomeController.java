package com.musicstore.controller;

import java.io.File;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.musicstore.dao.ProductDaoImpl;
import com.musicstore.model.Product;

@MultipartConfig
@Controller
public class HomeController {

	private Path path;

	@Autowired
	ProductDaoImpl productDaoImpl;

	@RequestMapping("/home")
	public String homepage() {
		return "welcome-home";
	}

	@RequestMapping("/list")
	@Transactional
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

	@PostMapping(value = "/admin/productinventory/formresponse")
	public String formrequesthandler(@ModelAttribute Product product, HttpServletRequest request,@RequestParam("file") MultipartFile file) {

		System.out.println("product" + product + "\t" + file);

		// productDaoImpl.addProduct(product);

		return "redirect:/list";
	}

	@RequestMapping("/admin/productinventory/delete/{id}")
	public String DeleteProduct(@PathVariable Integer id) {

//		Product productById = productDaoImpl.getProductById(id);
//		productDaoImpl.deleteProduct(productById);
		productDaoImpl.deleteProduct(id);

		return "redirect:/list";
	}

}
