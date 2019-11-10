package coli.express.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import coli.express.entities.Users;
import coli.express.repository.UsersRepository;
@RestController
public class UsersRestService {
	@Autowired
	private UsersRepository usersRepository;
	@RequestMapping(value="/Users/view",method=RequestMethod.GET)
	public List<Users>getUsers()
	{
		return usersRepository.findAll();
	}
	@RequestMapping(value="Users/add",method=RequestMethod.POST)
		public Users save(Users users)
			{return usersRepository.save(users);}

	@RequestMapping(value="/Users/delete/{id}",method=RequestMethod.DELETE)
	public List<Users> delete(@PathVariable Long id)
	{
		usersRepository.delete(id);
		return usersRepository.findAll();
	}
	@RequestMapping(value="/Users/viewById/{id}",method=RequestMethod.GET)
	public Users  getUsers(@PathVariable Long id)
	{
		return usersRepository.findOne(id);
	}
	@RequestMapping(value="/Users/edit/{id}",method=RequestMethod.POST)
	public List<Users> save(@PathVariable Long id,  Users users)
	{
		users.setId(id);
		 usersRepository.save(users);
		 return usersRepository.findAll();
	}
}
