package SpringFrameWorksdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Item;
public class lib {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_arg.xml");
		Item i = context.getBean("item", Item.class);
		
		System.out.println(i.getItemName());
		System.out.println(i.getPrice());
	}

}
