package org.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.project.pojo.ProjectItem;

public interface ProjectDao {
		//��Ŀdao�ӿ�
	
	
	//��ѯ������Ϣ
	public List<ProjectItem> selectall();
	
	//��ѯ������Ŀ��Ϣ
	public ProjectItem selectitem(@Param(value="id")int id);
	
	//��˱�����
	public int updete(@Param(value="item")ProjectItem item);
}
