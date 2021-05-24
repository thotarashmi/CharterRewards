package com.charter.model;

public class Response {

	private int rewards;
	private boolean isErrorFound;
	private String errorMessage;

	public int getRewards() {
		return rewards;
	}

	public void setRewards(int rewards) {
		this.rewards = rewards;
	}

	public boolean isErrorFound() {
		return isErrorFound;
	}

	public void setErrorFound(boolean isErrorFound) {
		this.isErrorFound = isErrorFound;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
