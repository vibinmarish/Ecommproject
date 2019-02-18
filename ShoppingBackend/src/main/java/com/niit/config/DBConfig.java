package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.dao.CartDAO;
import com.niit.dao.CategoryDAO;
import com.niit.dao.ProductDAO;
import com.niit.dao.ShippingaddressDAO;
import com.niit.dao.SupplierDAO;
import com.niit.dao.UserDAO;
import com.niit.daoimpl.CartDAOImpl;
import com.niit.daoimpl.CategoryDAOImpl;
import com.niit.daoimpl.ProductDAOImpl;
import com.niit.daoimpl.ShippingaddressDAOImpl;
import com.niit.daoimpl.SupplierDAOImpl;
import com.niit.daoimpl.UserDAOImpl;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.Shippingaddress;
import com.niit.model.Supplier;
import com.niit.model.User;

@Configuration

@ComponentScan("com.niit.*")

@EnableTransactionManagement
public class DBConfig {

	@Bean(name = "dataSource")

	public DataSource getH2DataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setUrl("jdbc:h2:tcp://localhost/~/ShoppingKart");

		dataSource.setDriverClassName("org.h2.Driver");

		dataSource.setUsername("sa");

		dataSource.setPassword("");

		return dataSource;

	}

	private Properties getHibernateProperties() {

		Properties properties = new Properties();

		properties.put("hibernate.show_sql", "true");

		properties.put("hibernate.hbm2ddl.auto", "update");

		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		properties.put("hibernate.format_sql", "true");

		return properties;

	}

	@Autowired

	@Bean(name = "sessionFactory")

	public SessionFactory getSessionFactory(DataSource dataSource) {

		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);

		sessionBuilder.addProperties(getHibernateProperties());

		sessionBuilder.addAnnotatedClass(User.class);
		sessionBuilder.addAnnotatedClass(Category.class);
		sessionBuilder.addAnnotatedClass(Product.class);
		sessionBuilder.addAnnotatedClass(Role.class);
		sessionBuilder.addAnnotatedClass(Shippingaddress.class);
		sessionBuilder.addAnnotatedClass(Supplier.class);
		sessionBuilder.addAnnotatedClass(Cart.class);
		return sessionBuilder.buildSessionFactory();

	}

	@Autowired

	@Bean(name = "transactionManager")

	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {

		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

		return transactionManager;
	}

	@Autowired(required = true)

	@Bean(name = "UserDAO")

	public UserDAO getUserDAO(SessionFactory sessionFactory) {

		return new UserDAOImpl(sessionFactory);
	}

	@Autowired(required = true)

	@Bean(name = "CategoryDAO")

	public CategoryDAO getCategoryDAO(SessionFactory sessionFactory) {

		return new CategoryDAOImpl(sessionFactory);
	}

	@Autowired(required = true)

	@Bean(name = "ProductDAO")

	public ProductDAO getProductDAO(SessionFactory sessionFactory) {

		return new ProductDAOImpl(sessionFactory);

	}

	/*
	 * @Autowired(required = true)
	 * 
	 * @Bean(name = "RoleDAO")
	 * 
	 * public RoleDAO getRoleDAO(SessionFactory sessionFactory) {
	 * 
	 * return new RoleDAOImpl(sessionFactory);
	 * 
	 * }
	 */

	@Autowired(required = true)

	@Bean(name = "ShippingaddressDAO")

	public ShippingaddressDAO getShippingaddressDAO(SessionFactory sessionFactory) {

		return new ShippingaddressDAOImpl(sessionFactory);

	}

	@Autowired(required = true)

	@Bean(name = "SupplierDAO")

	public SupplierDAO getSupplierDAO(SessionFactory sessionFactory) {

		return new SupplierDAOImpl(sessionFactory);

	}

	@Autowired(required = true)

	@Bean(name = "CartDAO")

	public CartDAO getCartDAO(SessionFactory sessionFactory) {

		return new CartDAOImpl(sessionFactory);

	}
}
