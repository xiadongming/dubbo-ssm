package com.vip.order.api;

import java.io.Serializable;

public class DoOrderResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8772765220969600892L;
	private String data;
	private String code;
	private String memo;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "DoOrderResponse [data=" + data + ", code=" + code + ", memo=" + memo + "]";
	}
	
	

}
