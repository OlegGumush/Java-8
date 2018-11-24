package com.Chapter_04_IterateCollectionUsingForeach;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student>{

	@Override
	public void accept(Student t) {
		System.out.println(t);
	}
}
