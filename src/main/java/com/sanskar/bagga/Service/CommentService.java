package com.sanskar.bagga.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanskar.bagga.Entity.Comments;
import com.sanskar.bagga.Entity.Users;
import com.sanskar.bagga.Repository.CommentRepo;


@Service
public class CommentService {
	
	@Autowired
	CommentRepo commentRepo;
	
	@Autowired
	UserService userService;
	public Comments submitCommentToDB(Comments comment) {
		Users user;
		user = userService.displayUserMetaData(comment.getUserId());
		 String str = user.getUserName();
		 comment.setUserName(str);
		 return commentRepo.save(comment);
	}
	
	public ArrayList<Comments> getAllCommentsForDB(String postId){
		ArrayList<Comments> commentList = commentRepo.findAllByPostId(postId);
		for(int i=0;i<commentList.size();i++) {
			
			Comments commentItem=commentList.get(i);
			commentItem.setUserName(userService.displayUserMetaData(commentItem.getUserId()).getUserName());
		}
		
		return commentList;
		
	}

}
