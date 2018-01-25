package cn.cabbsir.curd.service;

import cn.cabbsir.curd.bean.ShopInventory;
import cn.cabbsir.curd.dao.ShopInventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SIService {
	@Autowired
	ShopInventoryMapper shopInventoryMapper;
	public List<ShopInventory> getAll(){
		return shopInventoryMapper.selectByExampleWithShop(null);
	}
}
