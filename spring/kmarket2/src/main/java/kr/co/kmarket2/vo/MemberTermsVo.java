package kr.co.kmarket2.vo;

import lombok.Data;

@Data
public class MemberTermsVo {
	private String terms;
	private String privacy;
	private String location;
	private String finance;
	private String tax;
	
	private int seq;
}
