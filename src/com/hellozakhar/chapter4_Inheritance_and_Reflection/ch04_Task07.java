package com.hellozakhar.chapter4_Inheritance_and_Reflection;

public class ch04_Task07 {
    public static void main(String[] args) {
        Color whiteColor = Color.WHITE;
        System.out.println(whiteColor);
        Color blueColor = Color.BLUE;
        System.out.println(blueColor);
    }

    enum Color {
        BLACK(0, 0, 0),
        RED(255, 0, 0),
        BLUE(0, 0, 255),
        GREEN(0, 255, 0),
        CYAN(0, 255, 255),
        MAGENTA(255, 0, 255),
        YELLOW(255, 255, 0),
        WHITE(255, 255, 255);

        private int r, g, b;

        Color(int r, int g, int b) {
            this.r = r;
            this.g = g;
            this.b = b;
        }

        public int getRed() {
            return r;
        }

        public int getGreen() {
            return g;
        }

        public int getBlue() {
            return b;
        }

        @Override
        public String toString() {
            return "Color{" +
                    "r=" + r +
                    ", g=" + g +
                    ", b=" + b +
                    '}';
        }
    }
}
