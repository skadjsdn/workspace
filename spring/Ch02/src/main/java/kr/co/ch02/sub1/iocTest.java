package kr.co.ch02.sub1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


/*
 * ��¥ : 2021/10/11
 * �̸� : �����
 * ���� : ������ Ioc �ǽ��ϱ�
 * 
 * IoC(������ ����)
 *  - �ڹ� ��ü�� �����ϰ� ��ü�� ������ �������踦 ������ �����̳ʷ� ó���ϴ� ����
 *  - ������ IoC�� �̿��ؼ� ��ü������ ���յ��� ��ȭ ȿ��
 *  - IoC�� �����ϴ� ����� DI
 *  - DI����� ������̼� ����� ���� ���� ���
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
	
		// ������ �����̳��� ��ü�� ������ �����ϴ� ���
		ApplicationContext ctx = new GenericXmlApplicationContext("root-context.xml");
		
		Tv lgTv =  (Tv) ctx.getBean("lgTv");
		Tv samsungTv =  (Tv) ctx.getBean("samsungTv");
		
		lgTv.PowerOff();
		lgTv.ChDown();
		lgTv.ChUp();
		lgTv.soundDown();
		
		// DI ������̼� ����� Ȱ���� ��ü ����

		
	}

}
