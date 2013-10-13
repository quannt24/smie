package com.ict.ke.engine.user;

public class User {

	public static final int	ACTIVITY_FEW	= 0;
	public static final int	ACTIVITY_NORMAL	= 1;
	public static final int	ACTIVITY_MANY	= 2;

	private String			name;

	private int				year;
	private int				height;
	private int				weight;
	private int				activity;

	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getActivity() {
		return activity;
	}

	public void setActivity(int activity) {
		this.activity = activity;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
