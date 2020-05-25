package edu.study.lambdaexpr.frameworksample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterFramework {

	public static <T> List<T> filter(List<T> items, Predicate<T> p) {
		List<T> resultList = new ArrayList<T>();
		for (T t : items) {// <-------------- This can be re-written 
			if (p.test(t)) {// <------------- to implement stream instead of Iterating
				resultList.add(t);
			}
		}
		return resultList;
	}
}
