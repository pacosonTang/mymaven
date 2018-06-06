package com.atguigu.maven;

public class HelloFriend {
	public String sayHelloFriend(String name) {
		Hello hello = new Hello();
		String str = hello.sayHello(name) + ", i am Tang, your friend.";
		System.out.println(str);
		return str;
	}
}
