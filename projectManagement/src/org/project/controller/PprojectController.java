package org.project.controller;

import java.util.List;

import javax.annotation.Resource;

import org.project.pojo.ProjectItem;
import org.project.server.ProjectServer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PprojectController {

	@Resource
	ProjectServer   impl;
	
	@RequestMapping("list")
     public String selectinfo(Model model){
					List<ProjectItem> list=impl.selectallitem();
					model.addAttribute("list",list);
					
		return "info";
	}	
	
	@RequestMapping("alter")
	public String alterproject(@RequestParam(value="id")int id,Model model){
					ProjectItem user=null;
					user=impl.selectitem(id);
				model.addAttribute("iteminfo",user);
		return "alterProject";
	}
	
	
	@RequestMapping("alteritem")
	public String alteritem(@RequestParam(value="id")int id,@RequestParam(value="status")int status){
		ProjectItem user=new ProjectItem();
		user.setId(id);
		user.setStatus(status);
		int num=impl.update(user);
		
		if(num>0){
			
			return "redirect:list";
		}else {
			
			return "redirect:alter";
		}
		
	}
	
}
