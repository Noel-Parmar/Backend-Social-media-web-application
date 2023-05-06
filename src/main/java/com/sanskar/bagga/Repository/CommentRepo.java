package com.sanskar.bagga.Repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.sanskar.bagga.Entity.Comments;



public interface CommentRepo extends CrudRepository<Comments, Integer> {
	
	Comments save(Comments comment);
	ArrayList<Comments> findAllByPostId(String postId);


}
