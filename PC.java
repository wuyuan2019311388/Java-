package Pc;

import Cpu.CPU;
import HardDisk.HardDisk;

public class PC {
	private CPU cpu;
	private HardDisk HD;
	
	public PC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PC(CPU cpu, HardDisk hD) {
		super();
		this.cpu = cpu;
		HD = hD;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public HardDisk getHD() {
		return HD;
	}

	public void setHD(HardDisk hD) {
		HD = hD;
	}

	@Override
	public String toString() {
		return "PC [cpu=" + cpu + ", HD=" + HD + "]";
	}		
	
	public void show() {
		System.out.println("CPU的速度为："+cpu.getSpeed());
		System.out.println("硬盘容量为："+HD.getAmount());
	}
}
