import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class MultiplicaTest {

	@Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
                {4,2,2},{6,3,2},{5,5,1},{10,5,2}
        });
    }
	
	private int num1;
    private int num2;
    private int esperado;

    public MultiplicaTest( int esperado,int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.esperado = esperado;
	}



    @Test
    public void MultiplicaTest(){
        Assert.assertEquals(esperado,num1*num2);
    }
}
