package com.wolken.Movie.DI;

public class Info {

	private String actor;
	private String type;
	private int duration;
	public void setActor(String actor) {
		this.actor = actor;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Info [actor=" + actor + ", type=" + type + ", duration=" + duration + "]";
	}
	
	
}
