import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.CharacterProperties;
import org.CS5800.CharacterPropertiesFactory;
import org.junit.jupiter.api.Test;

class CharacterPropertiesFactoryTest {

    @Test
    void testGetPropertiesReturnsSameInstance() {
        CharacterProperties properties1 = CharacterPropertiesFactory.getProperties("Arial", "Red", 12);
        CharacterProperties properties2 = CharacterPropertiesFactory.getProperties("Arial", "Red", 12);

        assertSame(properties1, properties2, "The factory should return the same instance for identical properties.");
    }

    @Test
    void testGetPropertiesReturnsDifferentInstance() {
        CharacterProperties properties1 = CharacterPropertiesFactory.getProperties("Arial", "Red", 12);
        CharacterProperties properties2 = CharacterPropertiesFactory.getProperties("Calibri", "Blue", 14);

        assertNotSame(properties1, properties2, "The factory should return different instances for different properties.");
    }
}
