package com.itchina.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vip.order.api.DoOrderRequest;
import com.vip.order.api.DoOrderResponse;
import com.vip.order.api.IOrderService;

@Controller
@RequestMapping(method = RequestMethod.GET, value = "/dubbo")
public class DubboController {

	@Autowired
	public IOrderService orderServiceConsumer;
	@Autowired
	public IOrderService orderService;

	@RequestMapping("/web")
	public void getTest() {
		DoOrderRequest request = new DoOrderRequest();
		request.setName("夏东明");
		DoOrderResponse response = orderServiceConsumer.doOrder(request);
		DoOrderResponse response2 = orderService.doOrder(request);

		System.out.println(response);
		System.out.println(response2);
		System.out.println("123456");
	}

}
