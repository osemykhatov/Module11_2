package Module9;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncoderTest {

    @Test(timeout = 1000)
    public void testEncodeMechanism() throws Exception {

        final String encryptPhrase = "Deadly Touch";
        final String encryptedPhrase = "Klhksf Avbjo";
        final int offset = 7;

        Encoder encoder = new Encoder();
        String result  = Encoder.encodeMechanism(encryptPhrase, offset);

        Assert.assertEquals(encryptedPhrase, result);

    }
}