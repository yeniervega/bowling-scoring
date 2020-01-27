package com.tenpinbowlingscoringapp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
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
			// get DataSource
			DataSource<String> internalProperties = new InternalPropertiesAsDataSource("/settings.properties",
					"filePath");
			DataSourceContext<String> dataSourceContext = new DataSourceContext<String>(internalProperties);
			String sourceUrl = (String) dataSourceContext.getData();
			DataSource<Optional<Stream<String>>> fileData = new FileAsDataSource(sourceUrl);
			DataSourceContext<Optional<Stream<String>>> dataSourceContext1 = new DataSourceContext<Optional<Stream<String>>>(
					fileData);
			Optional<Stream<String>> scoring = (Optional<Stream<String>>) dataSourceContext1.getData();

			// Data Transformation
			TransformData<Optional<Stream<String>>, Optional<List<Player>>> bowlingTransformData = new BowlingTransformData();
			TransformDataContext<Optional<Stream<String>>, Optional<List<Player>>> transformDataContext = new TransformDataContext<Optional<Stream<String>>, Optional<List<Player>>>(
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
					dataPrinting.print("Pinfalls");
					List<Frame> frames = player.getFrames();
					for (Frame frame : frames) {
						pinfallDataPrinting.print(frame);
					}
					dataPrinting.print(lineBreak);
					dataPrinting.print("Score");
					for (Frame frame : frames) {
						scoreDataPrinting.print(frame);
					}
					dataPrinting.print(lineBreak);
				}
			} else {
				System.out.println("Invalid scoring!!!!");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
