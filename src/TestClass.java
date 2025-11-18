import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {

    Logic logic = new Logic();

    @Test
    void testEngToMorse() {
        assertEquals(".... . .-.. .-.. ---", logic.engToMorse("HELLO"));
    }

    @Test
    void testMorseToEng() {
        assertEquals("SOS", logic.morseToEng("... --- ..."));
    }

    @Test
    void testEngToMorseInvalidChar() {
        String result = logic.engToMorse("HI!");
        assertTrue(result.startsWith("Error"));
    }

    @Test
    void testMorseToEngInvalidMorse() {
        String result = logic.morseToEng("..-.-");
        assertTrue(result.startsWith("Error"));
    }


    @Test
    void testEngToMorseWithSpace() {
        assertEquals(".... . .--- .--. .- -.. .. --.", logic.engToMorse("Hej pa dig"));
    }
}
