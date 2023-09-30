package com.EmSoft.VBO.DataAccess;

import java.util.List;

import com.EmSoft.VBO.Entities.Users;


public interface IUsersDal {
	List<Users> getAll();
    void add(Users users);
    void update(Users users);
    void delete(Users users);
    Users getById(int id);

}
