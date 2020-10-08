package HardDisk;

public class HardDisk {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public HardDisk(int amount) {
		super();
		this.amount = amount;
	}

	public HardDisk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "HardDisk [amount=" + amount + "]";
	}
}
