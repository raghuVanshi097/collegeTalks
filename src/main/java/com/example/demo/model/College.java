package com.example.demo.model;

public enum College {
	GL_BAJAJ("GL Bajaj"), GALGOTIA("Galgotia");

	private final String collegeName;

	private College(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollege() {
		return collegeName;
	}
}
