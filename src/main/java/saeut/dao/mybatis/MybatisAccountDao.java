package saeut.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import saeut.dao.AccountDao;
import saeut.dao.mybatis.mapper.AccountMapper;
import saeut.domain.Account;
import saeut.domain.LoginInfo;

@Repository
public class MybatisAccountDao implements AccountDao {

	@Autowired
	private AccountMapper accountMapper;
	
	@Override
	public Account getAccountByUserId(String id) throws DataAccessException {
		return accountMapper.getAccountByUserId(id);
	}
	
//	@Override
//	public Account getAccountByUserIdAndPassword(Account account) {
//		return accountMapper.getAccountByUserIdAndPassword(account);
//	};
	
	@Override
	public int isDuplicated(LoginInfo loginInfo) {
		// TODO Auto-generated method stub
		return accountMapper.isDuplicated(loginInfo);
	}
	
	@Override
	public Account getAccountByUserIdAndPassword(LoginInfo loginInfo) {
		return accountMapper.getAccountByUserIdAndPassword(loginInfo);
	};
	
	@Override
	public List<Account> getAllAccount() throws DataAccessException{
		return accountMapper.getAllAccount();
	};
	
	@Override
	public void insertAccount(Account account) {
		accountMapper.insertAccount(account);
	};
		
    @Override
	public void modAccount(Account account) {
    	accountMapper.modAccount(account);
    };
		
	@Override
	public void removeAccount(String userId) {
		accountMapper.removeAccount(userId);
	}

	@Override
	public String getNicknameByUserID(String userId) throws DataAccessException {
		// TODO Auto-generated method stub
		return accountMapper.getNicknameByUserID(userId);
	}

	
	
}
