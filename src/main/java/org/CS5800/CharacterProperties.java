package org.CS5800;

public class CharacterProperties {
    private final String font;
    private final String color;
    private final int size;

    public CharacterProperties(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }

    // Getter for font
    public String getFont() {
        return font;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Getter for size
    public int getSize() {
        return size;
    }
}
