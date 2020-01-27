package com.tenpinbowlingscoringapp.factory;

import com.tenpinbowlingscoringapp.entity.PinfallPrinter;
import com.tenpinbowlingscoringapp.entity.Printer;

public class PinfallPrinterFactory extends PrinterFactory {

	@Override
	public Printer createPrinter() {
		return new PinfallPrinter();
	}

}
