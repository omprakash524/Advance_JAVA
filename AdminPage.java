package GUI;

public class AdminPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	private String username, password;  
	private boolean isLoggedIn = false; 
	
	public AdminPage() {}
	
	public AdminPage(String userName, String passWord) {
		username = userName;
		password = passWord;
	}
	
	public void setUserName(String userName) {
		username = userName;
	}
	
	public String getUserName() {
		return username;
	}
	
	public void setPassword(String passWord) {
		password = passWord;
	}
	
	public String getPassword() {
		return password;
	}
	
	public boolean checkLogin() {
		if (isLoggedIn == true) return true;
		else {
		System.out.println("Please log in first.");
		return false;
		}
	}
	
	public void doLogin() {
		String uName = getUserName();
		String pWord = getPassword();
		
		if ((uName != null && !uName.equals("")) && (pWord != null && !pWord.equals(""))) {
			isLoggedIn = true;
			System.out.println("User " + uName + " logged in successfully.");
		} else System.out.println("Invalid Username or Password");
	}
	
	public void doLogout() {
		isLoggedIn = false;
		System.out.println("User logged out successfully.");
	}

    public void showpage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showpage'");
    }

}
