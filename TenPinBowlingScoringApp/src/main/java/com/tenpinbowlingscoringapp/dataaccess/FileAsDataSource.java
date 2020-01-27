package com.tenpinbowlingscoringapp.dataaccess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileAsDataSource implements DataSource<Optional<Stream<String>>> {

	private String path;

	public FileAsDataSource(String path) {
		super();
		this.path = path;
	}

	public Optional<Stream<String>> getData() {
		Stream<String> streamResponse = null;
		Path path = Paths.get(this.path);
		try (Stream<String> stream = Files.lines(path)) {
			streamResponse = stream;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return Optional.of(streamResponse);
	}
}
