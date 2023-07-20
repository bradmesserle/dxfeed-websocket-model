package com.dxfeed.websocket.model.impl;

public class KeepAliveWebSocketMessageImpl extends AbstractDxFeedWebSocketMessage{

	private static final String MESSAGE_TYPE = "KEEPALIVE";
	
	/** Default Public Constructor. **/
	public KeepAliveWebSocketMessageImpl() {
		this.setType(MESSAGE_TYPE);
	}
	
}
