package com.EmSoft.VBO.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmSoft.VBO.Business.IRegisterService;
import com.EmSoft.VBO.Entities.Users;


@RestController
@RequestMapping("/register")
@CrossOrigin(origins = "http://localhost:3000")
public class RegisterController {
	
	private IRegisterService registerService;

	 @Autowired
	public RegisterController(IRegisterService registerService) {
		super();
		this.registerService = registerService;
	}

	@PostMapping("/add")
    public void add(@RequestBody Users users ){
    	registerService.add(users);
    }
	
}
