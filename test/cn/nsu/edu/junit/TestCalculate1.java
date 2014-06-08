package cn.nsu.edu.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestCalculate1 {
	Calculate cal;

	// 执行所有方法前都要执行该方法初始化
	@Before
	public void setUp() {
		cal = new Calculate();
	}

	// 有@Test这个标志的都代表是测试方法
	@Test
	public void testAdd() {
		int s1 = cal.add(23, 24);
		assertEquals("加法有错", s1, 47);
	}

	@Test
	public void testMinus() {
		int s1 = cal.minus(10, 5);
		assertEquals("减法有问题", s1, 5);
	}

	@Test
	public void testDivision() {
		int s1 = cal.Division(10, 5);
		assertEquals("除法有问题", s1, 2);
	}

	@Test
	public void testMul() {
		int s1 = cal.Mul(10, 5);
		assertEquals("乘法有问题", s1, 50);
	}

	// 性能测试表示这个方法要在300毫秒结束才是正常的
	@Test(timeout = 300)
	public void timeOut() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("abc");
	}

	// 要抛出这个异常
	@Test(expected = ArithmeticException.class)
	public void testExpected() {
		int s1 = cal.Division(10, 0);
	}
	// hamcrest可以增强junit的测试能力
}
