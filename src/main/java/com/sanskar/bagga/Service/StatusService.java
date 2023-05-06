package com.sanskar.bagga.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanskar.bagga.Entity.Status;
import com.sanskar.bagga.Entity.Users;
import com.sanskar.bagga.Repository.StatusRepo;



@Service
public class StatusService {
	@Autowired
	StatusRepo statusRepo;
	
	@Autowired
	UserService userService;
	
	public Status submitDataIntoDB(Status status) {
		Users user;
	user = userService.displayUserMetaData(status.getUserId());
	     String str = user.getUserName();
	     status.setUserName(str);
		return statusRepo.save(status);
	}
	
	public ArrayList<Status> retrieveStatus(){
		
		ArrayList<Status> statusList = statusRepo.findAll();
		for(int i=0;i<statusList.size();i++) {
			
			Status statusItem=statusList.get(i);
			statusItem.setUserName(userService.displayUserMetaData(statusItem.getUserId()).getUserName());
		}
		
		return statusList;
    }

	
}
