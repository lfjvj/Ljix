package org.ssh02.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.ssh02.dao.EmpDao;
import org.ssh02.pojo.Emp;

@Repository
public class EmpDaoImpl implements EmpDao {

	@Resource
	private SessionFactory sf;

	@Override
	public List<Emp> selectAll() {
		Session session = sf.getCurrentSession();
		SQLQuery sqlQuery = session.createSQLQuery("select * from emp").addEntity(Emp.class);
		List el = sqlQuery.list();
		return el;
	}

}
