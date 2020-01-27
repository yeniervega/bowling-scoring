package com.tenpinbowlingscoringapp.entity;

public class LinePrinter extends Printer{

	@Override
	public void print(Object object) {
		String line=(String) object;
		System.out.println(line);
	}

}
