package com.EmSoft.VBO.DataAccess;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.EmSoft.VBO.Entities.Users;
@Repository
public class HibernateRegisterDal implements IRegisterDal {

	private IUsersDal usersDal;

	@Autowired
	public HibernateRegisterDal(IUsersDal usersDal) {
		super();
		this.usersDal = usersDal;
	}

	@Override
	public void add(Users users) {
		this.usersDal.add(users);
		
	}


	
	
}
