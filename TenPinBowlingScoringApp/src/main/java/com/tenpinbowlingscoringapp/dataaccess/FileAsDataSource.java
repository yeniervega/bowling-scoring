package com.tenpinbowlingscoringapp.dataaccess;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileAsDataSource implements DataSource<List<String>> {

	private String path;

	public FileAsDataSource(String path) {
		super();
		this.path = path;
	}

	public List<String> getData() {
		List<String> streamResponse = null;
		Path path = Paths.get(this.path);
		try (Stream<String> stream = Files.lines(path)) {
			streamResponse=  stream.collect(Collectors.toList());
			return streamResponse;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return streamResponse;
	}
}
