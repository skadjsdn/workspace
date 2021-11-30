package kr.co.ch05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.ch05.dao.UserDao;
import kr.co.ch05.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public void insertUser(UserVO vo) {
		dao.insertUser(vo);
	}
	public void selectUser() {
		dao.selectUser();
	}
	public List<UserVO> selectUsers() {
		return  dao.selectUsers();
		
	}
	public void updateUser() {
		dao.updateUser();
	}
	public void deleteUser() {
		dao.deleteUser();
	}

}
