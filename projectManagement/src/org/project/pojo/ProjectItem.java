package org.project.pojo;

import java.util.Date;

public class ProjectItem {
		//��Ŀ����Ϣʵ���ࡣ����������
	
	private int id; //��Ŀid
	private String projectName;//��Ŀ����
	private Date startDate;//��Ŀ��ʼʱ��
	private Date endDate;//��Ŀ����ʱ��
	private int status;//״̬
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
