import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptionTest {
    @Test
    public void decrypt_word(){
        Decryption obj = new Decryption();
        String output = "AB";
        assertEquals(output, obj.decrypt("CD", 2));
    }
}