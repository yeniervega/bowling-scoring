package com.tenpinbowlingscoringapp.transformdata;

public class TransformDataContext<T, R> {
	
	private TransformData<T, R> TransformData;

	public TransformDataContext(com.tenpinbowlingscoringapp.transformdata.TransformData<T, R> transformData) {
		super();
		TransformData = transformData;
	}
	
	public R getTransformatedData(T t) throws Exception {
		return TransformData.transformData(t);
	}
}
