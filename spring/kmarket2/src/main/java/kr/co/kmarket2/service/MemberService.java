package kr.co.kmarket2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.kmarket2.dao.MemberDao;
import kr.co.kmarket2.vo.MemberTermsVo;
import kr.co.kmarket2.vo.MemberVo;

@Service 
public class MemberService {
	
	@Autowired
	MemberDao dao;

	
	public void selcetMember() {};
	public void insertMember(MemberVo vo) {
		
 
		dao.insertMember(vo);
	};
	public void selectMembers() {};
	public void updateMember() {};
	
	public MemberTermsVo selectTerms() {
		return dao.selectTerms();
	}	
	public void deleteMember() {};

}

