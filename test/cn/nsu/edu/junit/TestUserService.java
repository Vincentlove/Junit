package cn.nsu.edu.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestUserService {

	@Test
	public void tsetLogin() {
//		fail("加入登录的测试方法");
		
		String username = "admin";
		String password = "123";
		String captcha = "abc";
		System.out.println(username);
		if(username.equals(UserLogin.class)&&password.equals(UserLogin.class)&&captcha.equals(UserLogin.class))

			System.out.println("登录成功！");
		
	}

	@Test
	public void testUsernameError() {
		fail("添加用户名错误的测试代码");
	}

	@Test
	public void testNotfoundUsername() {
		fail("添加用户名不存在的测试代码");
	}

	@Test
	public void testPasswordError() {
		fail("添加用户密码错误的测试代码");
	}

	@Test
	public void testCaptchaError() {
		fail("添加验证码错误的测试代码");
	}
}
