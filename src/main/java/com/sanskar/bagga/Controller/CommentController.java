package com.sanskar.bagga.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanskar.bagga.Entity.Comments;
import com.sanskar.bagga.Service.CommentService;


@CrossOrigin
@RestController
@RequestMapping("/comments")
public class CommentController {
	
	@Autowired
	CommentService commentService;

	@PostMapping("")
	private Comments submitComment(@RequestBody Comments comment) {
		return commentService.submitCommentToDB(comment);
	}
	
	
	@GetMapping("/{postId}")
	private ArrayList<Comments> getCommentsForPost(@PathVariable("postId") String postId){
		
	   return commentService.getAllCommentsForDB(postId);
	}

}
