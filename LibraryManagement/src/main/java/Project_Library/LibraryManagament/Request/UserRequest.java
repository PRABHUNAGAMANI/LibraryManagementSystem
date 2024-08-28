package Project_Library.LibraryManagament.Request;

public class UserRequest 
{
	private int userid;
	private String name;
	private String email;
	
	public UserRequest() 
	{
		
	}

	public UserRequest(int userid, String name, String email) 
	{
		this.userid = userid;
		this.name = name;
		this.email = email;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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
