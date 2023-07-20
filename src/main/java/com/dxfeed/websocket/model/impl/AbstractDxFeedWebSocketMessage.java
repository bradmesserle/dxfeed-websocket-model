package com.dxfeed.websocket.model.impl;

public abstract class AbstractDxFeedWebSocketMessage {

	private String type;
	
	private Integer channel;

	/**
	 * @return the type
	 */
	public final String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public final void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the channel
	 */
	public final Integer getChannel() {
		return channel;
	}

	/**
	 * @param channel the channel to set
	 */
	public final void setChannel(Integer channel) {
		this.channel = channel;
	}

	
	
	
	
	
}
