package com.javalec.robotex;

import com.javalec.interfaceex.IFly;
import com.javalec.interfaceex.IKnife;
import com.javalec.interfaceex.IMain;

public class Robot {
	
	IFly fly;
	IKnife knife;
	IMain misail;
	
	public void shape() {
		System.out.println("¸Ó¸® ¸öÅë ÆÈ ´Ù¸®");
	}
	
	public void setFly(IFly fly) {
		this.fly = fly;
	}

	public void setKnife(IKnife knife) {
		this.knife = knife;
	}
	
	public void setMisail(IMain misail) {
		this.misail = misail;
	}
	
	public void actionfly() {
		this.fly.fly();
	}
	
	public void actionknife() {
		this.knife.knife();
	}
	
	public void actionmisail() {
		this.misail.misail();
	}

}
