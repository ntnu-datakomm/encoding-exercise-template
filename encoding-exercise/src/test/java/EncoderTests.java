import no.ntnu.datakomm.Encoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class EncoderTests {
    @Test
    public void testEmptyEncode() {
        assertNull(Encoder.encode(null));
        assertEquals("", Encoder.encode(""));
    }
    @Test
    public void testEmptyDecode() {
        assertNull(Encoder.decode(null));
        assertEquals("", Encoder.decode(""));
    }
}
