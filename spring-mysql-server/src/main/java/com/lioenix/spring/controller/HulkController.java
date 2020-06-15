package com.lioenix.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lioenix.spring.model.HulkUser;
import com.lioenix.spring.repo.HulkUserRepository;

@RestController
public class HulkController {
	
	@Autowired
	private HulkUserRepository hulkUserRepository;
	
	@RequestMapping(value = "", method=RequestMethod.GET)
	public String test() {
		return "Heeyyyy";		
	} 
	
	@RequestMapping(value = "/getUserById",  method=RequestMethod.GET)
    public HulkUser getUserById(int id){
        HulkUser user = hulkUserRepository.findById(id);
        return user;
    }

}
