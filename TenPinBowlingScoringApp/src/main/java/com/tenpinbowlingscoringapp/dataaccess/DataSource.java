package com.tenpinbowlingscoringapp.dataaccess;

public interface DataSource<R> {
	R getData()throws Exception;
}
