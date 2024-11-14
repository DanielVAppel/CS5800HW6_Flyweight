import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.CharacterProperties;
import org.CS5800.Character;
import org.junit.jupiter.api.Test;

class CharacterTest {

    @Test
    void testGetValue() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        Character character = new Character('H', properties);
        assertEquals('H', character.getValue(), "The character value should be 'H'.");
    }

    @Test
    void testGetProperties() {
        CharacterProperties properties = new CharacterProperties("Arial", "Red", 12);
        Character character = new Character('H', properties);

        assertSame(properties, character.getProperties(), "The character properties should match the assigned properties.");
        assertEquals("Arial", character.getProperties().getFont(), "The font should be 'Arial'.");
        assertEquals("Red", character.getProperties().getColor(), "The color should be 'Red'.");
        assertEquals(12, character.getProperties().getSize(), "The size should be 12.");
    }
}
