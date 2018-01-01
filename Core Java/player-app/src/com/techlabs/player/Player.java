package com.techlabs.player;

public class Player {
	private int id;
	private String name;
	private int age;

	public Player(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Player(int id, String name) {
		this(id, name, 18);

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		age = age;
	}

	public Player whoIsElder(Player player) {
		if (this.getAge() > player.getAge())
			return this;
		else
			return player;
	}

	@Override
	public String toString() {
		return ("Id :" + id + "\nName : " + name + "\nAge : " + age);
	}

}
