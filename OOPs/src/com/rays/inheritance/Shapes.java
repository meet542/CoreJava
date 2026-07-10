package com.rays.inheritance;

public class Shapes {

	protected String color;
	protected int borderWidth;
	protected int numberOfVertices;

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public int getBorderWidth() {
		return this.borderWidth;
	}

	public void setNumberOfVertices(int numberOfVertices) {
		this.numberOfVertices = numberOfVertices;
	}
	
	public int getNumberOfVertices() {
		return this.numberOfVertices;
	}
}
