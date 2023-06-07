package Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomlyGeneratedText {

	private int passwordLength=10;
	private int mailLength=8;
	private int domainLength=5;
	
	public String password() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String pwd = RandomStringUtils.random(passwordLength, characters);
		return pwd;
	}
	
	public String mail() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$%&";
		String mail = RandomStringUtils.random(mailLength, characters);
		return mail;
	}
	
	public String domain() {
		String characters = "abcdefghijklmnopqrstuvwxyz";
		String domain = RandomStringUtils.random(domainLength, characters);
		return domain;
	}
}
