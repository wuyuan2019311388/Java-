package Test;
import Cpu.CPU;
import HardDisk.HardDisk;
import Pc.PC;

public class Test {
	public static void main(String[] args) {
		//ʵ����cpu,HardDisk
		CPU cpu = new CPU();
		HardDisk HD = new HardDisk();
		//Ϊcpu,hd��ֵ
		cpu.setSpeed(2200);
		HD.setAmount(200);
		//ʵ����pc
		PC pc = new PC();
		//Ϊpc��ֵ
		pc.setCpu(cpu);
		pc.setHD(HD);
		pc.show();
	} 
}
