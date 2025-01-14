package org.example.model;

public class Carpet {
    private int width;
    private int height;
    private int PaintColor color;


    public Carpet(int height, int width, int paintColor) {
        this.height = height;
        this.width = width;
        PaintColor = paintColor;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintColor() {
        return PaintColor;
    }

    public void lying() {
        System.out.println("Carpet is lying on Bedroom floor.");
    }
}
