package service;

import org.mybatis.spring.SqlSessionTemplate;

import member.Member;

public class JoinDao {
	private SqlSessionTemplate sqlSessionTemplate;

	public JoinDao() {
	
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	//email중복 check
	public Member emailCheck(String data) {
		return sqlSessionTemplate.selectOne("select", data);
	}

}
