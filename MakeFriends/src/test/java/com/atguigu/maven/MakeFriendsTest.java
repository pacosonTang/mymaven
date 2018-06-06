package com.atguigu.maven;

import org.junit.Test;
import static junit.framework.Assert.*;

public class MakeFriendsTest {
	
	@Test
	public void testMakeFriends() {
		MakeFriends mf = new MakeFriends();
		String str = mf.makeFriends("zhangsan");
		System.out.println("str = " + str);
		assertEquals("hello zhangsan, i am Tang, your friend. make friend.", str);
	}
}
