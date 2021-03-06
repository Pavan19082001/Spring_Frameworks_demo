/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SpringFrameWorksdemo;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Person;
import com.Customer;
import com.Employee;
import com.Department;
public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spr.xml");
		Department dept = context.getBean("Department", Department.class);
		
		System.out.println(dept.getDepartmentName());
		System.out.println(dept.getManager().getEmployeeName());
		System.out.println(dept.getManager().getBasicSalary());
		
	}
}
