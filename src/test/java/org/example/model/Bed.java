package org.example.model;

public class Bed {
    private String pillows;
    private int height;
    private int sheets;
    private int quilts;
    private int style;



    public Bed(String pillows, int height, int sheets, int quilt, int style) {
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilt;
        this.style = style;
    }

    public String getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }

    public int getStyle() {
        return style;
    }

    public void make () {
      System.out.println("The bed is being made.");
    }
}
