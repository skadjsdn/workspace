package kr.co.Ch03.sub1;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

@Component
public class ArticleDao {
	
	@Inject
	private DaoAdvice advice;
	
	public void insertArticle() {
		System.out.println("ÇÙ½É°ü½É -- insertArticle");
	}
	public void selectArticle() {
		System.out.println("ÇÙ½É°ü½É -- selectArticle");
	}
	public void updateArticle() {
		System.out.println("ÇÙ½É°ü½É -- updateArticle");
	}
	public void deleteArticle() {
		System.out.println("ÇÙ½É°ü½É -- deleteArticle");
	}
	

}
