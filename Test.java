package Test;
import Cpu.CPU;
import HardDisk.HardDisk;
import Pc.PC;

public class Test {
	public static void main(String[] args) {
		//实例化cpu,HardDisk
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
		//为cpu,hd赋值
		cpu.setSpeed(2200);
		HD.setAmount(200);
		//实例化pc
		PC pc = new PC();
		//为pc赋值
		pc.setCpu(cpu);
		pc.setHD(HD);
		pc.show();
	} 
}
