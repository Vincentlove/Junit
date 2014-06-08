package cn.nsu.edu.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate1 {
	Calculate cal;

	// ִ�����з���ǰ��Ҫִ�и÷�����ʼ��
	@Before
	public void setUp() {
		cal = new Calculate();
	}

	// ��@Test�����־�Ķ������ǲ��Է���
	@Test
	public void testAdd() {
		int s1 = cal.add(23, 24);
		assertEquals("�ӷ��д�", s1, 47);
	}

	@Test
	public void testMinus() {
		int s1 = cal.minus(10, 5);
		assertEquals("����������", s1, 5);
	}

	@Test
	public void testDivision() {
		int s1 = cal.Division(10, 5);
		assertEquals("����������", s1, 2);
	}

	@Test
	public void testMul() {
		int s1 = cal.Mul(10, 5);
		assertEquals("�˷�������", s1, 50);
	}

	// ���ܲ��Ա�ʾ�������Ҫ��300�����������������
	@Test(timeout = 300)
	public void timeOut() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("abc");
	}

	// Ҫ�׳�����쳣
	@Test(expected = ArithmeticException.class)
	public void testExpected() {
		int s1 = cal.Division(10, 0);
	}
	// hamcrest������ǿjunit�Ĳ�������
}
