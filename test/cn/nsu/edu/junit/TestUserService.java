package cn.nsu.edu.junit;

import static org.junit.Assert.fail;

import org.junit.Test;

public class TestUserService {

	@Test
	public void tsetLogin() {
//		fail("�����¼�Ĳ��Է���");
		
		String username = "admin";
		String password = "123";
		String captcha = "abc";
		System.out.println(username);
		if(username.equals(UserLogin.class)&&password.equals(UserLogin.class)&&captcha.equals(UserLogin.class))

			System.out.println("��¼�ɹ���");
		
	}

	@Test
	public void testUsernameError() {
		fail("����û�������Ĳ��Դ���");
	}

	@Test
	public void testNotfoundUsername() {
		fail("����û��������ڵĲ��Դ���");
	}

	@Test
	public void testPasswordError() {
		fail("����û��������Ĳ��Դ���");
	}

	@Test
	public void testCaptchaError() {
		fail("�����֤�����Ĳ��Դ���");
	}
}
