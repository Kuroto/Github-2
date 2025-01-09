package Calculator;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassTest
{
    @Test
    public void testAdd()
    {
        MyClass myClass = new MyClass();

        // Adding a comment to commit
        assertEquals(3, myClass.add(1, 2));
        assertEquals(0, myClass.add(-1, 1));
        assertEquals(0, myClass.add(0, 0));
    }
}
