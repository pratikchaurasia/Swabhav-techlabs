package isp.voilation;

public class Robot implements IWorker{

	@Override
	public void startWork() {
		System.out.println("Robot is working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot has stopped working");
	}

	@Override
	public void startEat() {
		throw new RuntimeException("Robot dosent Eat");
	}

	@Override
	public void stopEat() {
		throw new RuntimeException("Robot dosent Eat");
	}
	
}
