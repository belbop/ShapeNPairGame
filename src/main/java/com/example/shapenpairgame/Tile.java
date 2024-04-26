package com.example.shapenpairgame;

import java.util.Arrays;
import java.util.List;

public class Tile {
    private String shape;
    private String color;

    public Tile(String shape, String color) {
        setShape(shape);
        setColor(color);
    }

    public String getShape() {
        return shape;
    }

    public static List<String> getValidShapes()
    {
        return Arrays.asList("square", "triangle", "circle", "star", "diamond");
    }

    /**
     * Valid shapes for a tile are "square", "triangle", "circle", "star", "diamond"
     * @param shape
     */
    public void setShape(String shape) {
        shape = shape.toLowerCase();
        if(getValidShapes().contains(shape))
        this.shape = shape;
        else
            throw new IllegalArgumentException(shape + " is not a valid shape. It must be one of " + getValidShapes());
    }

    public String getColor() {
        return color;
    }

    public static List<String> getValidColor() {
        return Arrays.asList("red", "orange", "yellow", "green", "blue", "purple");
    }
    /**
     * Valid colors for a tile are "red", "orange", "yellow", "green", "blue", "purple"
     * @param color
     */
    public void setColor(String color) {
        color = color.toLowerCase();
        if(getValidColor().contains(color))
        this.color = color;
        else
            throw new IllegalArgumentException(color + " is not a valid color. It must be one of " + getValidColor());
    }

    public String toString() {
        return color + " " + shape;
    }

    public String getColors()
    {
        switch (shape) {
            case "square" -> {
                return "blue";
            }
            case "triangle" -> {
                return "green";
            }
            case "circle" -> {
                return "red";
            }
            case "star" -> {
                return "yellow";
            }
            case "diamond" -> {
                return "orange";
            }
        }
        return "";
    }

    /**
     * Valid shapes for a tile are "square", "triangle", "circle", "star", "diamond"
     * @return
     */
    public String getShapes() {
        return getValidShapes() + " " + color;
    }
}
