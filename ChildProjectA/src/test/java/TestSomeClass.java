import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

public class TestSomeClass {

    @Test
    public void nothing() throws IOException {
        SomeClass sc = new SomeClass();
        PrintStream sysout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        sc.greetWorld();
        Assertions.assertEquals("Hello World!\n", out.toString());

        System.setOut(sysout);
    }
}
