package org.project.server;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.project.pojo.ProjectItem;

public interface ProjectServer {
		//�߼���ӿ�
	
	//��ѯ������Ϣ����
	public List<ProjectItem> selectallitem();
	
	//��ѯ��������
	public ProjectItem selectitem(int id);
	
	//��˱�����
	public int update(ProjectItem item);
	
}
