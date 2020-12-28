package com.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.dao.FacebookDAOInterface;
import com.crud.entity.FacebookUser;




@Service
public class FacebookService implements FacebookServiceInterface {

	
	
	
	@Autowired
	private FacebookDAOInterface fd;
	public FacebookUser createProfileService(FacebookUser fu) {
		return fd.save(fu);
	}
	
	
	
	public FacebookUser deleteProfileService(Long uid) {
		fd.deleteById(uid);
		return null;
	}
	
	
	public FacebookUser editProfilefacebookService(FacebookUser fu, String uid) {
		return fd.save(fu);
	}
	
	
	public FacebookUser viewProfileService(Long uid) {
	return fd.findById(uid).get();
	
	}
	
	
	public List<FacebookUser> searchProfileFacebookService(String name) {
	List<FacebookUser> list=new ArrayList<>();
	list=fd.findByName(name);
	return list;
	}
	
	
	public List<FacebookUser> viewAllProfilefacebookService() {
	List<FacebookUser> list=new ArrayList<>();
	fd.findAll().forEach(list1->list.add(list1));
	return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
