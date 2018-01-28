package cn.cabbsir.curd.service;

import cn.cabbsir.curd.bean.Shop;
import cn.cabbsir.curd.dao.ShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopService{
	@Autowired
	ShopMapper shopMapper;
	public List<Shop> getShops(){
		return shopMapper.selectByExample(null);
	}
}
