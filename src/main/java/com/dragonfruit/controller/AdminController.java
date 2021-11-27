package com.dragonfruit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragonfruit.bean.ReminderBean;
import com.dragonfruit.service.ReminderService;

@RestController
@RequestMapping(path="AdminReminder/v1",produces = "application/json",consumes = "application/json")
public class AdminController {

	@Autowired
	private ReminderService reminderService;
	
	@PostMapping("/save")
	public void doPost(@RequestBody ReminderBean reminderBean) {
		reminderService.save(reminderBean);
	}
}
