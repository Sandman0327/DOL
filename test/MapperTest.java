import cn.cabbsir.curd.bean.Shop;
import cn.cabbsir.curd.dao.ShopInventoryMapper;
import cn.cabbsir.curd.dao.ShopMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration("classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class MapperTest {
	@Autowired
	ShopMapper shopMapper;
	@Autowired
	ShopInventoryMapper shopInventoryMapper;
	@Test
	public void testCrud(){
		shopMapper.insertSelective(new Shop(null,"cabbsir","czb970418","黑龙江哈尔滨",11,"18846012507"));
		System.out.println("Insert Succeed!");
	}
}
