package main.TestNG;
import java.lang.reflect.Method;
import org.testng.annotations.DataProvider;
public class TestDataFile {
    @DataProvider(name="data")
    public static Object[][] testData(Method m){
        Object[][] obj = null;
        if(m.getName().equals("registerUser")){
            obj = new Object[3][4];
            obj[0][0]="Rahul";
            obj[0][1]="singh";
            obj[0][2]="test@gmail.com";
            obj[0][3]="123";
            obj[1][0]="saurav";
            obj[1][1]="singh";
            obj[1][2]="test1@gmail.com";
            obj[1][3]="12334";
            obj[2][0]="Vaibhav";
            obj[2][1]="tt";
            obj[2][2]="teejest@gmail.com";
            obj[2][3]="rkiro";
        }
        if(m.getName().equals("LoginUser")){
            obj = new Object[3][2];
            obj[0][0]="test@gmail.com";
            obj[0][1]="123";
            obj[1][0]="test1@gmail.com";
            obj[1][1]="12334";
            obj[2][0]="teejest@gmail.com";
            obj[2][1]="rkiro";
        }
        return obj;
    }

}
