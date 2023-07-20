package com.dxfeed.websocket.model.impl;

public class AuthenticationWebSocketMessageImpl extends AbstractDxFeedWebSocketMessage {

	/** Authentication Token. **/
	private String token;

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
