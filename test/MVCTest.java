import cn.cabbsir.curd.bean.ShopInventory;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
	@WebAppConfiguration
	@ContextConfiguration(locations={"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
	public class MVCTest {


		//传入到SpringMVC的ioc
		@Autowired
		WebApplicationContext context;
		MockMvc mockMvc; //虚拟mvc请求的
		@Before
		public void initMockMvc(){
			mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
		}

		@Test
		public void testPage() throws Exception{
			MvcResult result=mockMvc.perform(MockMvcRequestBuilders.
					get("/shopinventories").param("pn", "2")).andReturn();
			//发送完请求之后，请求当中会带有pageInfo信息
			MockHttpServletRequest request = result.getRequest();
			PageInfo pi = (PageInfo)request.getAttribute("pageInfo");
			System.out.println("当前页码："+pi.getPageNum());
			System.out.println("总页码："+pi.getPages());
			System.out.println("总记录数："+pi.getTotal());
			System.out.println("在页面当中进行连续显示的页码：");
			int []nums = pi.getNavigatepageNums();
			for(int i : nums){
				System.out.println(i);
			}


			//员工数据，pageInfo中的list
			List<ShopInventory> list = pi.getList();

			for(ShopInventory si : list){

				System.out.println("订单id:"+si.getSiid()+"===>店铺id"+si.getSisid());

			}
		}

	}
