package com.codingKnowledge.entity;

import org.springframework.stereotype.Component;

public class Engine {
	String engineType;

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public String getEngineType() {
		return engineType;
	}

	public String printEngine() {
		return engineType;
	}

}
