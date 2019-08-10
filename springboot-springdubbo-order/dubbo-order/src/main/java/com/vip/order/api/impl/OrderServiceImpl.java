package com.vip.order.api.impl;

import org.springframework.stereotype.Service;

import com.vip.order.api.DoOrderRequest;
import com.vip.order.api.DoOrderResponse;
import com.vip.order.api.IOrderService;

@Service("orderService")
public class OrderServiceImpl implements IOrderService{

	@Override
	public DoOrderResponse doOrder(DoOrderRequest reuest) {
		System.out.println("输入的request是： "+reuest);
		DoOrderResponse doOrderResponse = new DoOrderResponse();
		doOrderResponse.setCode("orderService111111");
		doOrderResponse.setMemo("处理成功");
		return doOrderResponse;
	}

}
