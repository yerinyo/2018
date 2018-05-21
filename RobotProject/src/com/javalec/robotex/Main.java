package com.javalec.robotex;
import com.javalec.interfaceex.*;

public class Main {
	
	public static void main(String[] args) {
		
		Robot superrobot = new Robot();
		Robot lowrobot = new Robot();
		
		superrobot.shape();
		superrobot.setFly(new FlyYes());
		superrobot.setKnife(new KnifeLaser());
		superrobot.setMisail(new MainMisail());
		superrobot.actionfly();
		superrobot.actionknife();
		superrobot.actionmisail();
	
		lowrobot.shape();
		lowrobot.setFly(new FlyYes());
		lowrobot.actionfly();
	}
}
