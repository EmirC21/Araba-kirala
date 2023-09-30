package com.EmSoft.VBO.Business;

import java.util.List;

import com.EmSoft.VBO.Entities.Users;

public interface IUsersService {

	List<Users> getAll();
    void add(Users users);
    void update(Users users);
    void delete(Users users);
    Users getById(int id);
}
