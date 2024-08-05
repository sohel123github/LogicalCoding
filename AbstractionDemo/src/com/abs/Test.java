package com.abs;

public class Test {

	public static void main(String[] args) {

		SmartPhone sm = new SmartPhone();
		sm.incoming();
		sm.outgoing();
		sm.gps();
		sm.camera();
		sm.mediaPlayer();

//		--------------------------------------

		CellPhone cp = new SmartPhone();

		cp.incoming();
		cp.outgoing();

//		--------------------------------------

		Gps g = new SmartPhone();

		g.gps();

//		--------------------------------------

		Camera c = new SmartPhone();

		c.camera();

//		--------------------------------------

		MediaPlayer mp = new SmartPhone();

		mp.mediaPlayer();

//		--------------------------------------
	}
}
