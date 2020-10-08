package Cpu;

public class CPU {
	
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public CPU(int speed) {
		super();
		this.speed = speed;
	}

	public CPU() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "CPU [speed=" + speed + "]";
	}
	
}
