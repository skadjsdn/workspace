package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/*
 * 날짜 : 2021/10/11
 * 이름 : 남언우
 * 내용 : 스프링 Ioc 실습하기
 * 
 * IoC(제어의 역행)
 *  - 자바 객체를 생성하고 객체들 사이의 의존관계를 스프링 컨테이너로 처리하는 개념
 *  - 스프링 IoC를 이용해서 객체ㄱㄴ의 결합도를 완화 효과
 *  - IoC를 구현하는 기술이 DI
 *  - DI기법중 어노테이션 기법을 가장 많이 사용
 *  
 */

public class iocTest {

	
	public static void main(String[] args) {
		
		Tv tv1 = new LgTv();
		Tv tv2 = new SamsungTv();
		
		tv1.ChDown();
		tv1.ChUp();
		tv1.PowerOff();
		tv1.PowerOn();
	
		// 스프링 컴테이너의 객체를 가져와 실행하는 방식
		ApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
		
		Tv lgTv =  (Tv) ctx.getBean("lgTv");
		Tv samsungTv =  (Tv) ctx.getBean("samsungTv");
		
		lgTv.PowerOff();
		lgTv.ChDown();
		lgTv.ChUp();
		lgTv.soundDown();
		
		// DI 어노테이션 기법을 활용한 객체 주입

		
	}

}
