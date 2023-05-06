package com.sanskar.bagga.Entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name="Post")
public class Post {
	
    
	@Id
	@GeneratedValue
	private int id;
	
	private String postId;
	private String userId;
	private String userName;
	private String postPath;
	private Timestamp timeStamp;
	private int likeCount;
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(int id, String postId, String userId, String postPath, Timestamp timeStamp, int likeCount) {
		super();
		this.id = id;
		this.postId = postId;
		this.userId = userId;
		this.postPath = postPath;
		this.timeStamp = timeStamp;
		this.likeCount = likeCount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPostPath() {
		return postPath;
	}
	public void setPostPath(String postPath) {
		this.postPath = postPath;
	}
	public Timestamp getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getLikeCount() {
		return likeCount;
	}
	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}
	

}