/**
 * 
 */
package cn.nsu.edu.junit;

/**
 * @author Vincent
 * 
 */
public class UserLogin {

	

	private String username;
	private String password;
	private String captcha;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username ="admin";
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = "123";
	}

	public String getCaptcha() {
		return captcha;
	}

	public void setCaptcha(String captcha) {
		this.captcha = "abc";
	}

	public UserLogin() {
		super();
	}

	public UserLogin(String username, String password, String captcha) {
		super();
		this.username = "admin";
		this.password = "123";
		this.captcha = "abc";
	}

	
}
