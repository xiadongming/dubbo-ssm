package com.vip.order.api;

import java.io.Serializable;

public class DoOrderRequest implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6054202686481004402L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DoOrderRequest [name=" + name + "]";
	}
	
	
}
