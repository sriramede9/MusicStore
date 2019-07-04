package com.musicstore.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.musicstore.dao.ProductDaoImpl;
import com.musicstore.model.Product;

@Controller
public class HomeController {

	private Path path;

	@Autowired
	ProductDaoImpl productDaoImpl;

//	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("configtest.xml");
//
//	ProductDaoImpl productDaoImpl = context.getBean("productdao", ProductDaoImpl.class);

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

	@RequestMapping(value = "/admin/productinventory/formresponse", method = RequestMethod.POST)
	public String formrequesthandler(@ModelAttribute Product product, HttpServletRequest request) {

		// System.out.println("submitted value of product" + product);

//		MultipartFile productImage = product.getProductImage();
//		String rootdir = request.getSession().getServletContext().getRealPath("/");
//		path = Paths.get(rootdir + "\\WEB-INF\\resources\\images\\" + product.getId() + ".png");
//
//		if (productImage != null && !productImage.isEmpty()) {
//			try {
//				productImage.transferTo(new File(path.toString()));
//			} catch (IllegalStateException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}

		// System.out.println("product" + product);

		productDaoImpl.addProduct(product);

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
