package com.example.domain;

import java.util.Date;

public class TeamDetail {

	private String name;
	private String homeBase;
	private Date startTime;
	private String history;

	@Override
	public String toString() {
		return "TeamDetail [name=" + name + ", homeBase=" + homeBase + ", startTime=" + startTime + ", history="
				+ history + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHomeBase() {
		return homeBase;
	}

	public void setHomeBase(String homeBase) {
		this.homeBase = homeBase;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

}
