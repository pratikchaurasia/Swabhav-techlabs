package isp.refactor.test;

import isp.refactor.IEatable;
import isp.refactor.IWorkable;
import isp.refactor.Manager;
import isp.refactor.Robot;



public class TestWorker {
	public static void main(String args[]){
		Manager manager= new Manager();
		Robot robot=new Robot();
		
		atTheWorkstation(manager);
		atTheCafferia(manager);
		
		atTheWorkstation(robot);
	}
	public static void atTheWorkstation(IWorkable object){
		System.out.println("At the workstation");
		object.startWork();
		object.stopWork();
	}
	public static void atTheCafferia(IEatable object){
		System.out.println("At the Cafferia");
		object.startEat();
		object.stopEat();
	}
}
