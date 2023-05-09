package com.likelion.project03.week4.day2;

public class ReversePyramid {
    private String spaceChar = "0";
    public ReversePyramid(String spaceChar) {
        this.spaceChar = spaceChar;
    }
    public String makeALine(int h, int i) {
        return String.format("%s%s\n", spaceChar.repeat(i), "*".repeat(h + 3 - (i * 2)));
    }
    public static void main(String[] args) {
        ReversePyramid reversePyramid = new ReversePyramid(" ");
        int h = 4;
        for (int i = 0; i < h; i++) {
            System.out.print(reversePyramid.makeALine(h, i));
        }
    }
}
