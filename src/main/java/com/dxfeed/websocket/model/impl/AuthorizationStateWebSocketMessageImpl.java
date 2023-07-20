package com.dxfeed.websocket.model.impl;

public class AuthorizationStateWebSocketMessageImpl extends AbstractDxFeedWebSocketMessage {

	private static final String MESSAGE_TYPE = "AUTH_STATE";
	
	/** Auth State. **/
	private String state;

	
	/**
	 * Default Public Constructor.
	 */
	public AuthorizationStateWebSocketMessageImpl() {
		this.setType(MESSAGE_TYPE);
	}
	
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
