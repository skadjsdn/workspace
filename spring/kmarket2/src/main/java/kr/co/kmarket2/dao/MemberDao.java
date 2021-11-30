package kr.co.kmarket2.dao;

import org.springframework.stereotype.Repository;

import kr.co.kmarket2.vo.MemberTermsVo;
import kr.co.kmarket2.vo.MemberVo;

@Repository
public interface MemberDao {
	
	public void selcetMember();
	public void insertMember(MemberVo vo);
	public void selectMembers();
	public void updateMember();
	public void deleteMember();
	public MemberTermsVo selectTerms();

}


