package Test;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wd.entity.Item;
import com.wd.service.items.IItemService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext-*.xml"})
public class ItemTest {
	@Resource IItemService itemService;
	
	@Test
	public void testAddItem() {
		Item item = new Item();
		
		itemService.addItemService(item);
	}
	
	@Test
	public void testDeleteItem() {
		int i_id = 0;
		itemService.deleteItemService(i_id);
	}
	
	@Test
	public void testEditDeleteItem() {
		Item item = new Item();
		
		itemService.editItemService(item);
	}
	
	@Test
	public void testListItems() {
		List<Item> list_item = (ArrayList<Item>)itemService.listItemsService();
		for(Item item : list_item){
			System.out.println(item);
		}
	}
	
	@Test
	public void testListStoreItems() {
		int u_id = 2;
		List<Item> list_item = itemService.listStoreItemsService(u_id);
		for(Item item : list_item) {
			System.out.println(item);
		}
	}
	
}
