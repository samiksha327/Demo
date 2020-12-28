package com.crud.service;

import java.util.List;

import com.crud.entity.FacebookUser;

public interface FacebookServiceInterface {

	
	public FacebookUser createProfileService(FacebookUser fu);

	public FacebookUser deleteProfileService(Long uid);

	public FacebookUser editProfilefacebookService(FacebookUser fu, String uid);

	public FacebookUser viewProfileService(Long uid);

	public List<FacebookUser> searchProfileFacebookService(String name);

	public List<FacebookUser> viewAllProfilefacebookService();
	
	

}
