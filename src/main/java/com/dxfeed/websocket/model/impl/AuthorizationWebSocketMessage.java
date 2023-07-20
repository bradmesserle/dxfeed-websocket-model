package com.dxfeed.websocket.model.impl;

public class AuthorizationWebSocketMessage extends AbstractDxFeedWebSocketMessage {

	/** Auth State. **/
	private String state;

	/**
	 * @return the state
	 */
	public final String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public final void setState(String state) {
		this.state = state;
	}
	
	
	
}
