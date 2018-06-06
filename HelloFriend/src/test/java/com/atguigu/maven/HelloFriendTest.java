package com.atguigu.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

public class HelloFriendTest {
	@Test
	public void sayHelloFriend() {
		HelloFriend helloFriend = new HelloFriend();
		String result = helloFriend.sayHelloFriend("zhangsan");
		assertEquals("hello zhangsan, i am Tang, your friend.", result);
	}
} 