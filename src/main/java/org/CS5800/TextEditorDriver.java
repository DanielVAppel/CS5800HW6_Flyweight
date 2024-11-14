package org.CS5800;

import java.io.IOException;

public class TextEditorDriver {
    public static void main(String[] args) {
        Document document = new Document();

        // Define the character properties using the Flyweight factory with 4 different variations
        CharacterProperties prop1 = CharacterPropertiesFactory.getProperties("Arial", "Red", 12);
        CharacterProperties prop2 = CharacterPropertiesFactory.getProperties("Calibri", "Blue", 14);
        CharacterProperties prop3 = CharacterPropertiesFactory.getProperties("Verdana", "Green", 16);
        CharacterProperties prop4 = CharacterPropertiesFactory.getProperties("Times New Roman", "Black", 18);

        // Add characters with the specified properties to the document
        document.addCharacter('H', prop1);
        document.addCharacter('e', prop2);
        document.addCharacter('l', prop3);
        document.addCharacter('l', prop1);
        document.addCharacter('o', prop2);
        document.addCharacter('W', prop4);
        document.addCharacter('o', prop1);
        document.addCharacter('r', prop3);
        document.addCharacter('l', prop2);
        document.addCharacter('d', prop4);
        document.addCharacter('C', prop1);
        document.addCharacter('S', prop2);
        document.addCharacter('5', prop3);
        document.addCharacter('8', prop4);
        document.addCharacter('0', prop1);
        document.addCharacter('0', prop2);

        // Save the document to a file
        try {
            document.saveToFile("HelloWorldCS5800.txt");
            System.out.println("Document saved to HelloWorldCS5800.txt");
        } catch (IOException e) {
            System.err.println("Failed to save document: " + e.getMessage());
        }

        // Load the document from the file and display each character with its properties
        Document loadedDocument = new Document();
        try {
            loadedDocument.loadFromFile("HelloWorldCS5800.txt");
            System.out.println("Loaded Document Contents:");
            for (Character character : loadedDocument.characters) {
                System.out.printf("Character: %c, Font: %s, Color: %s, Size: %d%n",
                        character.getValue(),
                        character.getProperties().getFont(),
                        character.getProperties().getColor(),
                        character.getProperties().getSize());
            }
        } catch (IOException e) {
            System.err.println("Failed to load document: " + e.getMessage());
        }
    }
}
