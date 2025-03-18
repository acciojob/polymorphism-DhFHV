package com.driver;

public class Main {
    public static class product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args){
        product p = new product();
        System.out.print(p.product(4,5));
        System.out.print(p.product(4,5,8));
        System.out.print(p.product(4.2,5.5));
    }
}