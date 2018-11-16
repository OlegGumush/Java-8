package com.Chapter_07_TypeInference.Lesson_01;

import java.util.Comparator;

@FunctionalInterface
public interface MyComparator
{
	public abstract boolean compare(int n1,int n2);
}
