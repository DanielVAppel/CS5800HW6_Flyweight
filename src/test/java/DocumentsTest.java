import static org.junit.jupiter.api.Assertions.*;

import org.CS5800.CharacterPropertiesFactory;
import org.CS5800.Document;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;

class DocumentTest {

    @Test
    void testSaveAndLoadDocument() throws IOException {
        Document document = new Document();
        document.addCharacter('H', CharacterPropertiesFactory.getProperties("Arial", "Red", 12));
        document.addCharacter('e', CharacterPropertiesFactory.getProperties("Calibri", "Blue", 14));

        // Save the document to file
        document.saveToFile("testDocument.txt");

        // Load the document from file
        Document loadedDocument = new Document();
        loadedDocument.loadFromFile("testDocument.txt");

        assertEquals(document.characters.size(), loadedDocument.characters.size(),
                "The loaded document should have the same number of characters as the saved document.");

        // Clean up the test file
        new File("testDocument.txt").delete();
    }
}