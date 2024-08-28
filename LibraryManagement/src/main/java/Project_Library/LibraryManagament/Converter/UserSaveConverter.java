package Project_Library.LibraryManagament.Converter;

import Project_Library.LibraryManagament.Entity.User;
import Project_Library.LibraryManagament.Request.UserSaveRequest;

public class UserSaveConverter 
{
	public static User usersavedtoTouser(UserSaveRequest usersaverequest)
	{
		User user=new User();
		user.setName(usersaverequest.getName());
		user.setEmail(usersaverequest.getEmail());
		return user;
	}

}
