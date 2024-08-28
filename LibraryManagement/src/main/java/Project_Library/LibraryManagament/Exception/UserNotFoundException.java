package Project_Library.LibraryManagament.Exception;

public class UserNotFoundException extends RuntimeException
{
	 public UserNotFoundException(String message)
	    {
	        super("user not found this id");
	    }

}
