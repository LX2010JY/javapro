package test.basetype; 

import basetype.num;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* num Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 25, 2018</pre> 
* @version 1.0 
*/ 
public class numTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: bigdecimal() 
* 
*/ 
@Test
public void testBigdecimal() throws Exception {
    try {
        num.bigdecimal("12.01221312");
    }catch (NumberFormatException e) {
        System.out.println(e);
    }
}


} 
