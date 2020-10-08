# Java-
Java课程作业项目仓库

# 阅读程序

## 实验目的
最终运行java程序在控制台显示cpu速度，硬盘容量

## 实验过程 
首先创建3个实体类(cpu,HardDisk,PC)创建其get，set方法，和无参构造、有参构造、tostring方法、实体类属性为私有的。
其次创建PC实体类，类中有一个show方法调用cpu.getSpeed()，和HD.getAmount()方法。
再然后创建测试类Test,先后实例化cpu,HardDisk,PC三个实体类给cpu实体类赋值cpu.setSpeed(2200)，再给HardDisk其中属性赋值HD.setAmount(200) 调用实体类pc将相应的值赋给pc的属性调用show（）方法。

## 核心方法
1.CPU cpu = new CPU(); 实例化cpu
2.HardDisk HD = new HardDisk(); 实例化HardDisk
3.PC pc = new PC();实例化pc
4.cpu.setSpeed(2200); 给cpu speed属性赋值 
5.HD.setAmount(200); 给HardDisk Amount属性赋值 
6.pc.show(); 控制台显示打印结果

## 实验结果
控制台打印：
CPU的速度为：2200
硬盘容量为：200

## 实验感想
对于get set方法使用的更加明白，实例化运用的更好了，理解了private私有属性的意义，实体类的相互调用更加熟练。
