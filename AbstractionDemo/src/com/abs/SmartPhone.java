package com.abs;

public class SmartPhone extends CellPhone implements Gps, Camera, MediaPlayer {

	@Override
	public void mediaPlayer() {
		System.out.println("Media Player is on..");
	}

	@Override
	public void camera() {
		System.out.println("Camera On..");
	}

	@Override
	public void gps() {
		System.out.println("Gps On..");
	}

	@Override
	void incoming() {
		System.out.println("Incoming Call..");
	}

	@Override
	void outgoing() {
		System.out.println("Otgoing Call");
	}

}
