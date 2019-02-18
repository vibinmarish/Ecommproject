package com.niit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.CartDAO;
import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.ShippingaddressDAO;
import com.niit.dao.SupplierDAO;
import com.niit.dao.UserDAO;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Shippingaddress;
import com.niit.model.Supplier;
import com.niit.model.User;

public class UserTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.niit.*");

		context.refresh();
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		/* RoleDAO roleDAO = (RoleDAO) context.getBean("RoleDAO"); */
		ShippingaddressDAO shippingaddressDAO = (ShippingaddressDAO) context.getBean("ShippingaddressDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		CartDAO cartDAO = (CartDAO) context.getBean("CartDAO");
	

		User user = (User) context.getBean("user");
		Category category = (Category) context.getBean("category");
		Product product = (Product) context.getBean("product");
		/* Role role = (Role) context.getBean("role"); */
		Shippingaddress shippingaddress = (Shippingaddress) context.getBean("shippingaddress");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Cart cart = (Cart) context.getBean("cart");
		
		user.setUserName("skfr");

		user.setEmailId("jhvd@gmail.com");

		user.setPassword("jfkd");

		category.setCategoryName("Watches");
		category.setCategoryDescription("watchs");

		product.setProductName("fdknmfg");
		product.setCategory("book");
		shippingaddress.setAddress("fdgfs");

		shippingaddress.setUserName("jkfgjd");

		/*
		 * role.setUserName("kjgdffd");
		 * 
		 * role.setEmailId("hgfshdghj");
		 */

		/*
		 * role.setContactNumber(6567); role.setUser(user);
		 */

		supplier.setSupplierName("hddsjk");

		supplier.setContactNumber(87968764);
		supplier.setSupplierAddress("india");
		
		cart.setProductName("dfhjj");

		cartDAO.saveOrUpdate(cart);

		

		
		categoryDAO.saveOrUpdate(category);
		userDAO.saveOrUpdate(user);
		productDAO.saveOrUpdate(product);
		/* roleDAO.saveOrUpdate(role); */
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		supplierDAO.saveOrUpdate(supplier);
		

	}

}
