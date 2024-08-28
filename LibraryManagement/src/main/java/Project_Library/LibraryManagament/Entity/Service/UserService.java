package Project_Library.LibraryManagament.Entity.Service;

import java.util.List;

import Project_Library.LibraryManagament.Request.UserRequest;
import Project_Library.LibraryManagament.Request.UserSaveRequest;
import Project_Library.LibraryManagament.Request.UserUpdateRequest;

public interface UserService 
{
	String addUser(UserSaveRequest usersaverequest);

	List<UserRequest> getAllUser();

	String updateUser(UserUpdateRequest userupdaterequest);

	String deleteUser(int id);

}
