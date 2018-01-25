package cn.cabbsir.curd.controller;

import cn.cabbsir.curd.bean.ShopInventory;
import cn.cabbsir.curd.service.SIService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SIController {
	@Autowired
	SIService siService;
	@RequestMapping("/shopinventories")
	public String getSI(@RequestParam(value="pn" , defaultValue = "1")Integer pn,Model model){
		PageHelper.startPage(pn,5);
		List<ShopInventory> si = siService.getAll();
		PageInfo page = new PageInfo(si,5);
		model.addAttribute("pageInfo",page);
		return "list";
	}
}
