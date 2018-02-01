package org.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.project.pojo.ProjectItem;

public interface ProjectDao {
		//项目dao接口
	
	
	//查询所有信息
	public List<ProjectItem> selectall();
	
	//查询单个项目信息
	public ProjectItem selectitem(@Param(value="id")int id);
	
	//审核报销单
	public int updete(@Param(value="item")ProjectItem item);
}
