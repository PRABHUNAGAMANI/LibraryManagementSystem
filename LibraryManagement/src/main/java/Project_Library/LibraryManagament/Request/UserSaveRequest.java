package Project_Library.LibraryManagament.Request;

public class UserSaveRequest 
{
	private String name;
	private String email;
	
	public UserSaveRequest() 
	{
		
	}

	public UserSaveRequest(String name, String email) 
	{
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
