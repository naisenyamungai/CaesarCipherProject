import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptionTest {
@Test
    public void encrypt_word(){
    Encryption obj = new Encryption();
    String output = "CD";
    assertEquals(output, obj.encrypt("AB", 2));
}
}