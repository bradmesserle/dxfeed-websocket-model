package com.dxfeed.websocket.model.impl;

/**
 * DXFEED Setup Message.
 */
public class SetupWebSocketMessageImpl extends AbstractDxFeedWebSocketMessage{

	private static final String MESSAGE_TYPE = "SETUP";
	
	private Integer keepaliveTimeout;
	
	private Integer acceptKeepaliveTimeout;
	
	private String version;
	
	/**
	 * Default Public Constructor.
	 */
	public SetupWebSocketMessageImpl() {
		this.setType(MESSAGE_TYPE);
	}
	
	

	/**
	 * @return the keepaliveTimeout
	 */
	public final Integer getKeepaliveTimeout() {
		return keepaliveTimeout;
	}

	/**
	 * @param keepaliveTimeout the keepaliveTimeout to set
	 */
	public final void setKeepaliveTimeout(Integer keepaliveTimeout) {
		this.keepaliveTimeout = keepaliveTimeout;
	}

	/**
	 * @return the acceptKeepaliveTimeout
	 */
	public final Integer getAcceptKeepaliveTimeout() {
		return acceptKeepaliveTimeout;
	}

	/**
	 * @param acceptKeepaliveTimeout the acceptKeepaliveTimeout to set
	 */
	public final void setAcceptKeepaliveTimeout(Integer acceptKeepaliveTimeout) {
		this.acceptKeepaliveTimeout = acceptKeepaliveTimeout;
	}

	/**
	 * @return the version
	 */
	public final String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public final void setVersion(String version) {
		this.version = version;
	}
	
	
	
	
	
}
