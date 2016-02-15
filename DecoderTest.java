package Module9;

import org.junit.Assert;
import org.junit.Test;

import java.util.Base64;

import static org.junit.Assert.*;

public class DecoderTest {

    @Test(timeout = 500)
    public void testDecodeMechanism() throws Exception {

        final String encodedPhrese = "nla ypjo vy kpL";
        final String decodedPhrese = "get rich or diE";
        final int offset = 7;

        Decoder decoder = new Decoder();
        String result = Decoder.decodeMechanism(encodedPhrese, offset);

        Assert.assertEquals(result, decodedPhrese);

    }
}