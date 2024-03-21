import org.example.Adding;
import org.example.Multiply;
import org.example.StringCheck;
import org.example.Sub;
import org.junit.Assert;
import org.junit.Test;


public class Testng {
    @Test
    public void Testing_Addition(){
        Adding a = new Adding();
        Assert.assertEquals(a.add(7, 17), 24);
    }
    @Test
    public void Testing_Addition_Negative(){
        Adding a = new Adding();
        Assert.assertNotSame(a.add(-7, 17), 11);
    }
    @Test
    public void Testing_Subtraction(){
        Sub a = new Sub();
        Assert.assertEquals(a.sub(40, 5), 35);
    }
    @Test
    public void Testing_Subtraction_Negative(){
        Sub a = new Sub();
        Assert.assertNotSame(a.sub(-70, 10), 80);
    }
    @Test
    public void Testing_Multiply(){
        Multiply a = new Multiply();
        Assert.assertEquals(a.multi(20, 10), 200);
    }
    @Test
    public void Testing_Multiply_Negative(){
        Multiply a = new Multiply();
        Assert.assertNotSame(a.multi(-55, -10), 50);
    }
    @Test
    public void Testing_String(){
        StringCheck a = new StringCheck();
        Assert.assertEquals(a.Upper("abcd"), "ABCD");
    }
    @Test
    public void Testing_String_Negative(){
        StringCheck a = new StringCheck();
        Assert.assertNotSame(a.Upper("abcd"), "AbCd");
    }




}
