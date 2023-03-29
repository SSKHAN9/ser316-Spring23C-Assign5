package test.java;

import main.java.Main;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class test {

    @Test
    public void testMain(){
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));
        Main.main(null);
        Assert.assertEquals("Hello World", bos.toString());
        System.setOut(originalOut);
    }
}
