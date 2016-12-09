import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class PersonTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
      
   @Test public void test_getFirstname() {
      Person p1 = new Person("Christian", "Kirschberg");
      Assert.assertEquals("Firstname does not match", 
         p1.getFirstname(), "Christian");   
   }
}
