package com.java.finkart.response;

import java.util.List;

public abstract class ServiceResponse implements Response{
	
	private String responseCode;
	private String responseMessage;
	private List<String> responseDiscription;

	
	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}
	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	/**
	 * @return the responseMessage
	 */
	public String getResponseMessage() {
		return responseMessage;
	}
	/**
	 * @param responseMessage the responseMessage to set
	 */
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	/**
	 * @return the responseDiscription
	 */
	public List<String> getResponseDiscription() {
		return responseDiscription;
	}
	/**
	 * @param responseDiscription the responseDiscription to set
	 */
	public void setResponseDiscription(List<String> responseDiscription) {
		this.responseDiscription = responseDiscription;
	}

}
