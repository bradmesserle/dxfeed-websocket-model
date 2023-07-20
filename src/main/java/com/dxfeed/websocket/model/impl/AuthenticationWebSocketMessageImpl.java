package com.dxfeed.websocket.model.impl;

public class AuthenticationWebSocketMessageImpl extends AbstractDxFeedWebSocketMessage {

	private static final String MESSAGE_TYPE = "AUTH";
	
	/** Authentication Token. **/
	private String token;

	/**
	 * Default Public Constructor. 
	 */
	public AuthenticationWebSocketMessageImpl() {
		this.setType(MESSAGE_TYPE);
	}
	
	/**
	 * @return the token
	 */
	public final String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public final void setToken(String token) {
		this.token = token;
	}
	
	
}
