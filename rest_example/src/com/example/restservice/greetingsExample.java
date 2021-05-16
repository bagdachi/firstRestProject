package com.example.restservice;

public class greetingsExample {
	
	
	
	private final long id;
	private final String content;
	
	public greetingsExample(long id, String content) {
		this.id=id;
		this.content=content;
	}
	
	public long getid(){
		return this.id;
	}
	
	public String getcontent() {
		return content;
	}

}
