package cn.cabbsir.curd.controller;

import cn.cabbsir.curd.bean.Massage;
import cn.cabbsir.curd.bean.ShopInventory;
import cn.cabbsir.curd.service.SIService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SIController {
	@Autowired
	SIService siService;


	//更新数据
	@RequestMapping(value = "shopinventories/{siid}",method = RequestMethod.PUT)
	@ResponseBody
	public Massage updateSI(ShopInventory shopInventory){
		siService.updateSI(shopInventory);
		return Massage.success();
	}

	//根据id进行si查询
	@ResponseBody
	@RequestMapping(value = "shopinventories/{id}",method = RequestMethod.GET)
	public Massage getSI1(@PathVariable("id") Integer sid){
		ShopInventory shopInventory = siService.getSI1(sid);
		return Massage.success().add("si", shopInventory);
	}



	@RequestMapping(value = "/shops",method = RequestMethod.POST)
	@ResponseBody
	public Massage saveSI(ShopInventory shopInventory){
		siService.insertSI(shopInventory);
		return Massage.success();
	}
	//json方法,导入json依赖包

	@RequestMapping(value = "/shopinventories")
	@ResponseBody
	public Massage getSI(@RequestParam(value="pn" , defaultValue = "1")Integer pn){
		PageHelper.startPage(pn,5);
		List<ShopInventory> si = siService.getAll();
		PageInfo page = new PageInfo(si,5);
		return Massage.success().add("pageInfo",page);
	}




//	@RequestMapping("/shopinventories")
//	public String getSI(@RequestParam(value="pn" , defaultValue = "1")Integer pn,Model model){
//		PageHelper.startPage(pn,5);
//		List<ShopInventory> si = siService.getAll();
//		PageInfo page = new PageInfo(si,5);
//		model.addAttribute("pageInfo",page);
//		return "list";
//	}
}
