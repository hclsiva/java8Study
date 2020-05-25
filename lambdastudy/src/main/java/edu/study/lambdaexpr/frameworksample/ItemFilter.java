package edu.study.lambdaexpr.frameworksample;

import java.util.List;

import study.schema.beans.Actor;
import study.schema.beans.Mobile;

public class ItemFilter {

	public ItemFilter() {		
	}

	public static List<Mobile> filterMobiles(List<Mobile> mobileList){
		List<Mobile> resultList = FilterFramework.filter(mobileList,m->m.getPrice()>15000 );
		return resultList;
	}
	
	public static List<Actor> filterActors(List<Actor> actorsList){
		List<Actor> resultList = FilterFramework.filter(actorsList, a -> a.getSalary()>15000);
		return resultList;
	}
	
	public static <T> void print(List<T> items) {
		items.stream().forEach(x->System.out.println(x));
	}
	public static void main(String[] args) {
		print(filterMobiles(MobileDataCreator.getMobileList()));
		System.out.println();
		print(filterActors(ActorDataCreator.getactorList()));
		
	}
}
