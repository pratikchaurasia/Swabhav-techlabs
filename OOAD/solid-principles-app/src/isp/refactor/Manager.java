package isp.refactor;


public class Manager implements IEatableWorkable{

	@Override
	public void startWork() {
		System.out.println("Manager is working");		
	}

	@Override
	public void stopWork() {
		System.out.println("Manager has stopped working");
	}

	@Override
	public void startEat() {
		System.out.println("Manager is Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager has stopped Eating");
	}
	

}
