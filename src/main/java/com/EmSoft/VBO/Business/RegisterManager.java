package com.EmSoft.VBO.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.EmSoft.VBO.DataAccess.IRegisterDal;
import com.EmSoft.VBO.Entities.Users;


@Service
public class RegisterManager implements IRegisterService {

	private IRegisterDal registerDal;

	@Autowired
	public RegisterManager(IRegisterDal registerDal) {
		this.registerDal = registerDal;
	}

	@Override
	@Transactional
	public void add(Users users) {
		registerDal.add(users);
		
	}

	

	
	
}
