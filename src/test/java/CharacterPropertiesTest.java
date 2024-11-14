import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.CharacterProperties;
import org.junit.jupiter.api.Test;

class CharacterPropertiesTest {

    @Test
    void testGetFont() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        assertEquals("Arial", properties.getFont(), "The font should be 'Arial'.");
    }

    @Test
    void testGetColor() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        assertEquals("Red", properties.getColor(), "The color should be 'Red'.");
    }

    @Test
    void testGetSize() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        assertEquals(12, properties.getSize(), "The size should be 12.");
    }
}

