package com.EmSoft.VBO.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.EmSoft.VBO.DataAccess.IUsersDal;
import com.EmSoft.VBO.Entities.Users;

@Service
public class UsersManager implements IUsersService {

	private IUsersDal usersDal;
	
	@Autowired
	public UsersManager(IUsersDal usersDal) {
		super();
		this.usersDal = usersDal;
	}

	@Override
	@Transactional
	public List<Users> getAll() {
		
		return usersDal.getAll();
	}

	@Override
	@Transactional
	public void add(Users users) {
		this.usersDal.add(users);
		
	}

	@Override
	public void update(Users users) {
		this.usersDal.update(users);
		
	}

	@Override
	public void delete(Users users) {
		this.usersDal.delete(users);
		
	}

	@Override
	public Users getById(int id) {
		return usersDal.getById(id);
	}

}
