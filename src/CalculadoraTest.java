import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class CalculadoraTest {
	
	
	
	@Parameters
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
                {19,6,2},{40,4,6},{-50,-5,10},{255,15,17}
        });
    }
	
	
	private int num1;
    private int num2;
    private int esperado;

    public CalculadoraTest( int esperado,int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.esperado = esperado;
	}

    @Test
    public void multiplicaTest(){
        assertEquals("Ha fallado ",esperado,num1*num2);
    }
	

}
