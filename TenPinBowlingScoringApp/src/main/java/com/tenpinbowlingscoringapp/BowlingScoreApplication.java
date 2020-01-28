package com.tenpinbowlingscoringapp;

import java.util.List;
import java.util.Optional;

import com.tenpinbowlingscoringapp.dataaccess.DataSource;
import com.tenpinbowlingscoringapp.dataaccess.DataSourceContext;
import com.tenpinbowlingscoringapp.dataaccess.FileAsDataSource;
import com.tenpinbowlingscoringapp.dataaccess.InternalPropertiesAsDataSource;
import com.tenpinbowlingscoringapp.entity.Frame;
import com.tenpinbowlingscoringapp.entity.Player;
import com.tenpinbowlingscoringapp.factory.LinePrinterFactory;
import com.tenpinbowlingscoringapp.factory.PinfallPrinterFactory;
import com.tenpinbowlingscoringapp.factory.PrinterFactory;
import com.tenpinbowlingscoringapp.factory.ScorePrinterFactory;
import com.tenpinbowlingscoringapp.printdata.DataPrinting;
import com.tenpinbowlingscoringapp.printdata.ScoringBowlingPrinting;
import com.tenpinbowlingscoringapp.transformdata.BowlingTransformData;
import com.tenpinbowlingscoringapp.transformdata.TransformData;
import com.tenpinbowlingscoringapp.transformdata.TransformDataContext;

/**
 * Hello world!
 *
 */
public class BowlingScoreApplication {
	public static void main(String[] args) {

		try {
			String Key=args[0];
			// get DataSource
			DataSource<String> internalProperties = new InternalPropertiesAsDataSource("/settings.properties",
					Key);
			DataSourceContext<String> dataSourceContext = new DataSourceContext<String>(internalProperties);
			String sourceUrl = (String) dataSourceContext.getData();
			DataSource <List<String>> fileData = new FileAsDataSource(sourceUrl);
			DataSourceContext<List<String>> dataSourceContext1 = new DataSourceContext<List<String>>(
					fileData);
			List<String> scoring =dataSourceContext1.getData();		
			
			if(scoring!=null && scoring.size()>0)
			{
				// Data Transformation
				TransformData<List<String>, Optional<List<Player>>> bowlingTransformData = new BowlingTransformData();
				TransformDataContext<List<String>, Optional<List<Player>>> transformDataContext = new TransformDataContext<List<String>, Optional<List<Player>>>(
						bowlingTransformData);
				Optional<List<Player>> bowlingPlayers = transformDataContext.getTransformatedData(scoring);

				// Impresión
				if (bowlingPlayers.isPresent()) {
					List<Player> players = bowlingPlayers.get();
					PrinterFactory factory = new LinePrinterFactory();
					DataPrinting dataPrinting = new ScoringBowlingPrinting(factory);
					String header = "Frame\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6\t\t7\t\t8\t\t9\t\t10\n";
					dataPrinting.print(header);
					String lineBreak = "\n";
					PrinterFactory pinfallPrinterFactory = new PinfallPrinterFactory();
					DataPrinting pinfallDataPrinting = new ScoringBowlingPrinting(pinfallPrinterFactory);
					PrinterFactory scorePrinterFactory = new ScorePrinterFactory();
					DataPrinting scoreDataPrinting = new ScoringBowlingPrinting(scorePrinterFactory);
					for (Player player : players) {
						dataPrinting.print(lineBreak);
						List<Frame> frames = player.getFrames();
						pinfallDataPrinting.print(frames);
						dataPrinting.print(lineBreak);
						scoreDataPrinting.print(frames);
						dataPrinting.print(lineBreak);
					}
				} else {
					System.out.println("Invalid scoring!!!!");
				}
			}
			else {
				System.out.println("Could not get data to process");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
