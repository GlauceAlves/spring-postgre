package com.widesys.spring_postgre_test.entities.enuns;

public enum OrderStatusEnum {
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(1),
	CANCELED(5);
	
	private int code;
	
	private OrderStatusEnum (int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static OrderStatusEnum valueOf(int code) {
		for (OrderStatusEnum value : OrderStatusEnum.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid Order Status code.");
	}
}

