package isp.voilation.test;

import isp.voilation.IWorker;
import isp.voilation.Manager;
import isp.voilation.Robot;

public class TestWorkstation {
	public static void main(String args[]){
		Manager manager= new Manager();
		Robot robot=new Robot();
		
		atTheWorkstation(manager);
		atTheCafferia(manager);
		
		atTheWorkstation(robot);
		atTheCafferia(robot);
	}
	public static void atTheWorkstation(IWorker object){
		System.out.println("At the workstation");
		object.startWork();
		object.stopWork();
	}
	public static void atTheCafferia(IWorker object){
		System.out.println("At the Cafferia");
		object.startEat();
		object.stopEat();
	}
}
