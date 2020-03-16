package service;

import member.Member;

public class JoinServiceImpl implements JoinService {
	private JoinDao joinDao;
	
	public JoinServiceImpl() {

	}
	
	public void setJoinDao(JoinDao joinDao) {
		this.joinDao = joinDao;
	}
	
	@Override
	public int Check(String data) {
		Member member = joinDao.emailCheck(data);
		
		if(member.getEmail() != null) {
			return 0;
		}else {
			return 1;
		}
	}

}
