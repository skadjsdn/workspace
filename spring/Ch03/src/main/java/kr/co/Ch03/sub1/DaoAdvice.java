package kr.co.Ch03.sub1;

public class DaoAdvice {
	//Advice : 부가기능 모듈을 갖는 AOP 컴포넌트
	public void beforeAdvice1() {
		System.out.println("================");
		System.out.println("횡단관심--beforeAdvice1");
	}
	public void beforeAdvice2() {
		System.out.println("================");
		System.out.println("횡단관심--beforeAdvice2");}
	public void beforeAdvice3() {
		System.out.println("================");
		System.out.println("횡단관심--beforeAdvice3");}
	

	public void afterAdvice1() {
		System.out.println("================");
		System.out.println("횡단관심--afterAdvice1");}
	public void afterAdvice2() {
		System.out.println("================");
		System.out.println("횡단관심--afterAdvice2");}
	public void afterAdvice3() {
		System.out.println("================");
		System.out.println("횡단관심--afterAdvice3");}
	
}
