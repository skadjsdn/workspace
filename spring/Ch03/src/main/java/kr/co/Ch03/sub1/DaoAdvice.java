package kr.co.Ch03.sub1;

public class DaoAdvice {
	//Advice : �ΰ���� ����� ���� AOP ������Ʈ
	public void beforeAdvice1() {
		System.out.println("================");
		System.out.println("Ⱦ�ܰ���--beforeAdvice1");
	}
	public void beforeAdvice2() {
		System.out.println("================");
		System.out.println("Ⱦ�ܰ���--beforeAdvice2");}
	public void beforeAdvice3() {
		System.out.println("================");
		System.out.println("Ⱦ�ܰ���--beforeAdvice3");}
	

	public void afterAdvice1() {
		System.out.println("================");
		System.out.println("Ⱦ�ܰ���--afterAdvice1");}
	public void afterAdvice2() {
		System.out.println("================");
		System.out.println("Ⱦ�ܰ���--afterAdvice2");}
	public void afterAdvice3() {
		System.out.println("================");
		System.out.println("Ⱦ�ܰ���--afterAdvice3");}
	
}
