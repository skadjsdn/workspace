package kr.co.ch02.sub1;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;

public class LgTv implements Tv {
	
	@Inject
	private Speaker speaker;
	
	@Override
	public void PowerOff() {
		System.out.println("Stv Poweroff");
		
	}@Override
	public void PowerOn() {
		System.out.println("Stv Poweron");
		
	}@Override
	public void ChDown() {
		System.out.println("Stv chdown");

		
	}@Override
	public void ChUp() {
		System.out.println("Stv chUp");

		
	}
	@Override
	public void soundUp() {
		speaker.soundUp();
		
	}
	@Override
	public void soundDown() {
		speaker.soundDown();
		
	}

}
