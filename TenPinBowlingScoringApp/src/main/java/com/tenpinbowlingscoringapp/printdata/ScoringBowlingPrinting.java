package com.tenpinbowlingscoringapp.printdata;

import com.tenpinbowlingscoringapp.entity.Printer;
import com.tenpinbowlingscoringapp.factory.PrinterFactory;

public class ScoringBowlingPrinting implements DataPrinting {

	private Printer printer;

	public ScoringBowlingPrinting(PrinterFactory factory) {
		this.printer = factory.createPrinter();
	}

	@Override
	public void print(Object object) {
		printer.print(object);		
	}
}
