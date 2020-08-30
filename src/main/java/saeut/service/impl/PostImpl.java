package saeut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import saeut.dao.CheckListDao;
import saeut.dao.PostDao;
import saeut.domain.CheckList;
import saeut.domain.Post;
import saeut.service.facade.PostFacade;

@Repository
@Service("postImpl")
@Transactional
public class PostImpl implements PostFacade {

	@Autowired
	private PostDao postDao;
	
	private CheckListDao checkListDao;
	
	@Autowired
	public void setCheckListDao(CheckListDao checkListDao) {
		this.checkListDao = checkListDao;
	}

	/* Post  */
	@Override
	public List<Post> getAllPost() {
		return postDao.getAllPost();
	}

	@Override
	public List<Post> getPostByUserId(String userId) {
		return postDao.getPostByUserId(userId);
	}

	@Override
	public void insertPost(Post Post) {
		postDao.insertPost(Post);
	}

	@Override
	public void modPost(Post Post) {
		postDao.modPost(Post);
	}

	@Override
	public void removePost(int post_id) {
		postDao.removePost(post_id);
	}
	
	/* CheckList  */
	@Override
	public List<CheckList> getAllCheckList() {
		return checkListDao.getAllCheckList();
	}

	@Override
	public List<CheckList> getTop6CheckList() {
		return checkListDao.getTop6CheckList();
	}

}