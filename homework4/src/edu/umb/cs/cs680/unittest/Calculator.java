package edu.umb.cs.cs680.unittest;

public class Calculator {
	public float multiply(float x, float y){
		return x*y;
		}
	public float divide (float x, float y){
		if(y == 0) {throw
			new IllegalArgumentException("divison by zero");}
		return x/y;
		}
}
