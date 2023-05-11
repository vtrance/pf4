package com.test;

import jakarta.inject.Named;

@Named("myTest")
public class TestBean {
	private String text = "Hello World";
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}	
}
