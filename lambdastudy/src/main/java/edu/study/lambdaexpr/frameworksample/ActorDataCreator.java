package edu.study.lambdaexpr.frameworksample;

import java.util.ArrayList;
import java.util.List;

import study.schema.beans.Actor;

public class ActorDataCreator {

	public ActorDataCreator() {		
	}
	
	public static List<Actor> getactorList() {
		List<Actor> actorList= new ArrayList<Actor>();
		
		Actor actor = new Actor();
		actor.setActorId(10001);
		actor.setName("Tom Hanks");
		actor.setSalary(10000);
		actor.setGender("M");
		actorList.add(actor);
		
		actor = new Actor();
		actor.setActorId(10002);
		actor.setName("Bruce Willis");
		actor.setSalary(20000);
		actor.setGender("M");
		actorList.add(actor);

		actor = new Actor();
		actor.setActorId(10003);
		actor.setName("Liam Neeson");
		actor.setSalary(18000);
		actor.setGender("M");
		actorList.add(actor);
		
		actor = new Actor();
		actor.setActorId(10004);
		actor.setName("Dwayne Johnson");
		actor.setSalary(14000);
		actor.setGender("M");
		actorList.add(actor);
		
		actor = new Actor();
		actor.setActorId(10005);
		actor.setName("Angelina");
		actor.setSalary(12000);
		actor.setGender("F");
		actorList.add(actor);

		actor = new Actor();
		actor.setActorId(10006);
		actor.setName("Camaroon Diaz");
		actor.setSalary(13000);
		actor.setGender("F");
		actorList.add(actor);
		
		actor = new Actor();
		actor.setActorId(10007);
		actor.setName("Julia Roberts");
		actor.setSalary(15000);
		actor.setGender("F");
		actorList.add(actor);
		
		actor = new Actor();
		actor.setActorId(10008);
		actor.setName("Lianardo");
		actor.setSalary(10000);
		actor.setGender("M");
		actorList.add(actor);

		actor = new Actor();
		actor.setActorId(10009);
		actor.setName("Morgan");
		actor.setSalary(14000);
		actor.setGender("M");
		actorList.add(actor);
		
		actor = new Actor();
		actor.setActorId(10010);
		actor.setName("Tom Cruise");
		actor.setSalary(20000);
		actor.setGender("M");
		actorList.add(actor);		
		
		return actorList;
	}
	

}
