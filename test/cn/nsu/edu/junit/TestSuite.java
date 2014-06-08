package cn.nsu.edu.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestA.class, TestB.class, TestCalculate1.class })
public class TestSuite {

}
