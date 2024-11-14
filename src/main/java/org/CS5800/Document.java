package org.CS5800;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Document {
    public final List<Character> characters = new ArrayList<>();

    public void addCharacter(char value, CharacterProperties properties) {
        characters.add(new Character(value, properties));
    }

    public void saveToFile(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Character character : characters) {
                writer.write(character.getValue());
                writer.write(" " + character.getProperties().getFont());
                writer.write(" " + character.getProperties().getColor());
                writer.write(" " + character.getProperties().getSize());
                writer.newLine();
            }
        }
    }

    public void loadFromFile(String filename) throws IOException {
        characters.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 4) {
                    char value = parts[0].charAt(0); // First part is the character
                    String font = parts[1];          // Second part is the font
                    String color = parts[2];         // Third part is the color
                    int size = Integer.parseInt(parts[3]); // Fourth part is the size

                    CharacterProperties properties = CharacterPropertiesFactory.getProperties(font, color, size);
                    characters.add(new Character(value, properties));
                }
            }
        }
    }
}

