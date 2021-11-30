package kr.co.ch05.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.UserVO;

@Repository
public class UserDao {
	
	@Inject
	private SqlSessionTemplate mybatis;

	public void insertUser(UserVO vo) {
		mybatis.insert("mapper.user.insertUser",vo);
	}
	public void selectUser() {}
	public List<UserVO> selectUsers() {
		return mybatis.selectList("mapper.user.selectUsers");
	}
	public void updateUser() {}
	public void deleteUser() {}
	
}
