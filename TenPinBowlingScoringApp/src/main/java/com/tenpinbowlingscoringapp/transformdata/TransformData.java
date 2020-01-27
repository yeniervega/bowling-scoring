package com.tenpinbowlingscoringapp.transformdata;

public interface TransformData<T,R> {
	
	R transformData(T t) throws Exception;
}
