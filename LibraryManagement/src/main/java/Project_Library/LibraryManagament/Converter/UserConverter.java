package Project_Library.LibraryManagament.Converter;

import Project_Library.LibraryManagament.Entity.User;
import Project_Library.LibraryManagament.Request.UserRequest;

public class UserConverter 
{
	public static User userDtoTouser(UserRequest userrequest)
	{
		User user=new User();
		user.setUserid(userrequest.getUserid());
		user.setName(userrequest.getName());
		user.setEmail(userrequest.getEmail());
		return user;
	}

}
