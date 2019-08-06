package com.example.domain;

/**
 * 野球チームのドメイン.
 * 
 * @author atsushi
 *
 */
public class Team {

	/** チーム名 */
	private String name;

	@Override
	public String toString() {
		return "Team [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
