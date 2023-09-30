package com.EmSoft.VBO.restApi;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.EmSoft.VBO.Entities.Users;
import com.EmSoft.VBO.Business.IUsersService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://localhost:3000")
public class UsersController {
	private IUsersService usersService;

	@Autowired
	public UsersController(IUsersService usersService) {
		super();
		this.usersService = usersService;
	}

	@GetMapping("/getUsers")
	public List<Users> get() {
		return usersService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody Users users) {
		this.usersService.add(users);
	}

	@PostMapping("/delete")
	public void delete(@RequestBody Users users) {
		this.usersService.delete(users);
	}

	@PostMapping("/update")
	public void update(@RequestBody Users users) {
		this.usersService.update(users);
	}

	@GetMapping("Users/{id}")
	public Users getById(@PathVariable int id) {
		return usersService.getById(id);
	}

}
