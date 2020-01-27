package com.tenpinbowlingscoringapp.factory;

import com.tenpinbowlingscoringapp.entity.LinePrinter;
import com.tenpinbowlingscoringapp.entity.Printer;

public class LinePrinterFactory extends PrinterFactory{

	@Override
	public Printer createPrinter() {
		return new LinePrinter();
	}

}
