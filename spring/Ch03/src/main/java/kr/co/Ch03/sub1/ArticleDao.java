package kr.co.Ch03.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class ArticleDao {
	
	@Inject
	private DaoAdvice advice;
	
	public void insertArticle() {
		System.out.println("�ٽɰ��� -- insertArticle");
	}
	public void selectArticle() {
		System.out.println("�ٽɰ��� -- selectArticle");
	}
	public void updateArticle() {
		System.out.println("�ٽɰ��� -- updateArticle");
	}
	public void deleteArticle() {
		System.out.println("�ٽɰ��� -- deleteArticle");
	}
	

}
