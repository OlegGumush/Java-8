package com.Chapter_01_Default_And_Static_Method_In_Interface.Lesson_01;

import java.util.Collections;
import java.util.List;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public Integer getMaxNum(List<Integer> list) {
		return Collections.max(list);
	}
}
