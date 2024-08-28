package Project_Library.LibraryManagament.Converter;

import Project_Library.LibraryManagament.Entity.User;
import Project_Library.LibraryManagament.Request.UserUpdateRequest;

public class UserUpdateConverter 
{
	public static User userUpdateDtoTouser(UserUpdateRequest userupdaterequest)
	{
		User user=new User();
		user.setUserid(userupdaterequest.getUserid());
		user.setName(userupdaterequest.getName());
		user.setEmail(userupdaterequest.getEmail());
		return user;
	}

}
