package no.kristiania.Test;

import no.kristiania.Java.ToRoman;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ToRomanTest {
    @Test
    public void shouldConvert1ToI() {
        assertEquals("I", ToRoman.toRoman(1));
    }

    @Test
    public void shouldConvert2ToII() {
        assertEquals("II", ToRoman.toRoman(2));
    }
}
