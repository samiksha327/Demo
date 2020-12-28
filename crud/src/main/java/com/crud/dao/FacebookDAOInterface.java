package com.crud.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.crud.entity.FacebookUser;

@Repository
public interface FacebookDAOInterface extends JpaRepository<FacebookUser, Long> {
	
	
	
	@Query("from com.crud.entity.FacebookUser fu where fu.name=:uname")
	public List<FacebookUser> findByName(String uname);
	
	
	
	
	

}
