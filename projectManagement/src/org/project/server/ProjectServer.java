package org.project.server;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.project.pojo.ProjectItem;

public interface ProjectServer {
		//逻辑层接口
	
	//查询所有信息方法
	public List<ProjectItem> selectallitem();
	
	//查询单个对象
	public ProjectItem selectitem(int id);
	
	//审核报销单
	public int update(ProjectItem item);
	
}
