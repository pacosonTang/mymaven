package com.atguigu.maven;

public class MakeFriends {
	public String makeFriends(String name) {
		HelloFriend hf = new HelloFriend();
		String str = hf.sayHelloFriend(name);
		String result = str + " make friend.";
		System.out.println(result);
		return result;
	}
	
}
