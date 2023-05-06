package com.sanskar.bagga.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanskar.bagga.Entity.Status;
import com.sanskar.bagga.Service.StatusService;


@CrossOrigin
@RestController
@RequestMapping("/status")
public class StatusController {

	@Autowired
	StatusService statusService;
	
	
	@PostMapping("/add")
	private Status submitStatus(@RequestBody Status status) {
		
		return statusService.submitDataIntoDB(status);
	}
	
	@GetMapping("")
	private ArrayList<Status> getAllStatus(){
		return statusService.retrieveStatus();
	}
}