package com.tenpinbowlingscoringapp.factory;

import com.tenpinbowlingscoringapp.entity.Printer;
import com.tenpinbowlingscoringapp.entity.ScorePrinter;

public class ScorePrinterFactory extends PrinterFactory{

	@Override
	public Printer createPrinter() {
		return new ScorePrinter();
	}

}
