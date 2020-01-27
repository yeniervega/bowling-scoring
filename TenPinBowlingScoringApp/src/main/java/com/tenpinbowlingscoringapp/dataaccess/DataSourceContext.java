package com.tenpinbowlingscoringapp.dataaccess;

public class DataSourceContext<R> {
	
	private DataSource<R> dataSource;

	public DataSourceContext(DataSource<R> dataSource) {
		super();
		this.dataSource = dataSource;
	}
	
	public R getData() throws Exception {
		return dataSource.getData();
	}

}
