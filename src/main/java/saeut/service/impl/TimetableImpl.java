package saeut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import saeut.dao.TimetableDao;
import saeut.domain.Timetable;
import saeut.service.facade.TimetableFacade;

@Repository
@Service("timeTableImpl")
@Transactional
public class TimetableImpl implements TimetableFacade{

	@Autowired
	private TimetableDao timetableDao;
	
	@Override
	public List<Timetable> getTimeListById(String id) {
		return timetableDao.getTimeListById(id);
	}

	@Override
	public void insertTimetable(Timetable timetable) {
		timetableDao.insertTimetable(timetable);
	}

	@Override
	public void modTimetable(Timetable timetable) {
		timetableDao.modTimetable(timetable);
	}

	@Override
	public void removeTimetableById(String id) {
		timetableDao.removeTimetableById(id);
	}

}
