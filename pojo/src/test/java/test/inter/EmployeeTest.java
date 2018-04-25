package test.inter; 

import inter.Employee;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Employee Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 24, 2018</pre> 
* @version 1.0 
*/ 
public class EmployeeTest { 

/** 
* 
* Method: compareTo(Employee other) 
* 
*/ 
@Test
public void testCompareTo() throws Exception {
    Employee e1 = new Employee(12.3);
    Employee e2 = new Employee(23.32);
    int out = e1.compareTo(e2);
    System.out.println(e1 instanceof inter.Comparable);
    //克隆对象
    //克隆对象是继承自 Object 类的方法，但是是protected方法，不能直接调用，
    //需要克隆的对象类必须实现clonenable接口以及重写clone方法，将其变为public
    Employee copy = e1.clone();
    //字符串的equals方法和对象不同，对象直接判断==，也就是是否指向同一个地址，而string加了每一个字符的相等判断，都继承自Object类
    System.out.println(e1.equals(copy));
    "nihao".equals("nihao");
}


} 
