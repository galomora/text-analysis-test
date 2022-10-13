package com.gm.text.analysis.model;

public class TopChar {
	private String character;
	private TopCharInfo info;
	
	public TopChar () {
		this.info = new TopCharInfo();
	}
	public TopChar (String character) {
		this ();
		this.character = character;
	}
	public String getCharacter() {
		return character;
	}
	public void setCharacter(String character) {
		this.character = character;
	}
	public TopCharInfo getInfo() {
		return info;
	}
	public void setInfo(TopCharInfo info) {
		this.info = info;
	}
	
	
}
