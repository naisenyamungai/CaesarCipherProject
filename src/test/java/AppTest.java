import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void runApp_displayIndexOf_numberValue() {
        String oneLetter = "A";
        Integer actual = 0;
        Integer expected = oneLetter.indexOf("A");
        assertEquals(expected, actual);

    }
}

