package com.atguigu.maven;

import junit.framework.Assert;
import org.junit.Test;
import static junit.framework.Assert.*;

public class HelloTest {
	
	@Test
	public void testHello() {
		Hello hello = new Hello();
		String results = hello.sayHello("zhangsan");
		Assert.assertEquals("hello zhangsan", results);
	}
}
