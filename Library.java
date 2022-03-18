/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SpringFrameWorksdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Person;
import com.Customer;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springbean.xml");
		Person p = context.getBean(Person.class);
		
		System.out.println(p.getPersonName());
		System.out.println(p.getPersonAddress());
		
		Customer custo = context.getBean("Customer", Customer.class);
		
		System.out.println(custo.getCustomerName());
		System.out.println(custo.getCustomerEmail());
		
		
	}
}
