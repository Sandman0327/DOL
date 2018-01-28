package cn.cabbsir.curd.controller;

import cn.cabbsir.curd.bean.Massage;
import cn.cabbsir.curd.bean.Shop;
import cn.cabbsir.curd.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShopController {
	@Autowired
	ShopService shopService;

	@RequestMapping("/shop")
	@ResponseBody
	public Massage getShop(){
		List<Shop> list = shopService.getShops();
		return Massage.success().add("shops",list);
	}
}
