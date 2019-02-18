package com.niit.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDAO;
import com.niit.model.User;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired

	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;

	}

	public List<User> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByUserId(int userid) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByUserName(String userame) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByEmailId(String emailid) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAllReadyRegister(String email, boolean b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public void saveOrUpdate(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	public void delete(int UserId) {
		// TODO Auto-generated method stub

	}

}
