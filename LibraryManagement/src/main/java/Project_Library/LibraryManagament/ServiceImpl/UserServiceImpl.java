package Project_Library.LibraryManagament.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Project_Library.LibraryManagament.Converter.UserSaveConverter;
import Project_Library.LibraryManagament.Entity.User;
import Project_Library.LibraryManagament.Entity.Service.UserService;
import Project_Library.LibraryManagament.Exception.UserExistException;
import Project_Library.LibraryManagament.Exception.UserNotFoundException;
import Project_Library.LibraryManagament.Repository.UserRepository;
import Project_Library.LibraryManagament.Request.UserRequest;
import Project_Library.LibraryManagament.Request.UserSaveRequest;
import Project_Library.LibraryManagament.Request.UserUpdateRequest;

@Service
public class UserServiceImpl implements UserService
{
	
	@Autowired
	private UserRepository userrepository;
	
	public String addUser(UserSaveRequest usersaverequest) 
	{
		
		Optional<User> saveuser=userrepository.findByEmail(usersaverequest.getEmail());
		if(saveuser.isPresent())
		{
			throw new UserExistException();
		}
		User user=UserSaveConverter.usersavedtoTouser(usersaverequest);
		userrepository.save(user);
		return "User Saved SuccessFully";
	}

	public List<UserRequest> getAllUser() 
	{
		List<User> getUsers = userrepository.findAll();
		List<UserRequest> listofusers = new ArrayList<>();

		for (User user : getUsers) 
		{
			UserRequest userDTO = new UserRequest(user.getUserid(), 
					user.getName(), user.getEmail());
			listofusers.add(userDTO);

		}
		return listofusers;
	}


	public String updateUser(UserUpdateRequest userupdaterequest) 
	{
		Optional<User> userOptional = userrepository.findById(userupdaterequest.getUserid());
	    if (userOptional.isPresent()) 
	    {
	        User user = userOptional.get();
	        user.setName(userupdaterequest.getName());
	        user.setEmail(userupdaterequest.getEmail());
	        userrepository.save(user);
	        return "user updated successfully..";
	    }
	    else 
	    {
	        throw new UserNotFoundException("User not found with ID: " + userupdaterequest.getUserid());
	    }
	}
	
	
	public String deleteUser(int id) 
	{
		if (userrepository.existsById(id)) 
		{
			userrepository.deleteById(id);
		} 
		else 
		{
			System.out.println("ID Not Found");
		}

		return null;
	}

}
