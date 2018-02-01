package org.project.server;

import java.util.List;

import javax.annotation.Resource;

import org.project.dao.ProjectDao;
import org.project.pojo.ProjectItem;
import org.springframework.stereotype.Service;
@Service
public class ProjectServerImpl implements ProjectServer{

	@Resource
	ProjectDao impl;
	
	
	@Override
	public List<ProjectItem> selectallitem() {
		List<ProjectItem> list=null;
		try {
			 list=impl.selectall();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		
		return list;
	}


	@Override
	public ProjectItem selectitem(int id) {
		// TODO Auto-generated method stub
		ProjectItem user=null;
		
		try {
			user=impl.selectitem(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return user;
	}


	@Override
	public int update(ProjectItem item) {
		// TODO Auto-generated method stub
		int num=0;
		try {
			num=impl.updete(item);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return num;
	}

}
