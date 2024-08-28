package Project_Library.LibraryManagament.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Project_Library.LibraryManagament.Entity.Service.UserService;
import Project_Library.LibraryManagament.Request.UserRequest;
import Project_Library.LibraryManagament.Request.UserSaveRequest;
import Project_Library.LibraryManagament.Request.UserUpdateRequest;

@RestController
@RequestMapping("api/v1/user")
public class UserController 
{
	
	@Autowired
	private UserService userservice;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody UserSaveRequest usersaverequest) {
		String username = userservice.addUser(usersaverequest);
		return "user Added Successfully...";
	}
	
	
	@GetMapping("/getAllUser")
	public List<UserRequest> getAllUser() 
	{
		List<UserRequest> allUsers = userservice.getAllUser();
		return allUsers;
	}
	
	@PutMapping("/update")
	public String updateUser(@RequestBody UserUpdateRequest userupdaterequest) 
	{
		String username = userservice.updateUser(userupdaterequest);
		return username;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable(value = "id") int id) 
	{
		String username = userservice.deleteUser(id);
		return "user deleted successfully..";
	}
}
