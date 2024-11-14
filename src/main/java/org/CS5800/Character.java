package org.CS5800;

public class Character {
    private final char value;
    private final CharacterProperties properties;

    public Character(char value, CharacterProperties properties) {
        this.value = value;
        this.properties = properties;
    }

    // Getter for the character's value
    public char getValue() {
        return value;
    }

    // Getter for the character's properties (font, color, size)
    public CharacterProperties getProperties() {
        return properties;
    }
}


