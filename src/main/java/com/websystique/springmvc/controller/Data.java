package com.websystique.springmvc.controller;

public class Data {

	String id;
	String text;
	String start_time;
	String end_time;
	String status;
	String word_freq;
	String vowel_freq;
	String sentiment;
	String completed_task;
	
	
	
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getEnd_time() {
		return end_time;
	}
	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getWord_freq() {
		return word_freq;
	}
	public void setWord_freq(String word_freq) {
		this.word_freq = word_freq;
	}
	public String getVowel_freq() {
		return vowel_freq;
	}
	public void setVowel_freq(String vowel_freq) {
		this.vowel_freq = vowel_freq;
	}
	public String getSentiment() {
		return sentiment;
	}
	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}
	public String getCompleted_task() {
		return completed_task;
	}
	public void setCompleted_task(String completed_task) {
		this.completed_task = completed_task;
	}
	
	
	
}
