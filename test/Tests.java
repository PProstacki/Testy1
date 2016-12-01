
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import testy1.Equation;

public class Tests {
    
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testRootNumber(){
        Equation e1 = new Equation(1.0, 4.0, 2.0);
        int expValue = 2;
        int actualValue = e1.rootNumber();
        Assert.assertEquals(expValue, actualValue);
    }
    
    @Test
    public void testcalculateDiscriminant(){
        Equation e1 = new Equation(2.0, 5.0, 3.0);
        double expValue = 1.0;
        double actualValue = e1.calculateDiscriminant();
        Assert.assertEquals(expValue, actualValue, 0.0);
    }

}
