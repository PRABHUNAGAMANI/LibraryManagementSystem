package Project_Library.LibraryManagament.Exception;

public class UserExistException extends RuntimeException
{
	public UserExistException()
    {
        super("User already Exists");
    }

}
