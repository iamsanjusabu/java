package com.sanjusabu.javacompletecourse;

public class Parsing25 {
    public static void main(String[] args) {
        byte v1 = Byte.parseByte("10");
        Short v2 = Short.parseShort("10");
        int v3 = Integer.parseInt("10");        
        long v4 = Long.parseLong("10L".toUpperCase().replace("L", ""));

        Float v5 = Float.parseFloat("10F".toUpperCase().replace("F", ""));
        double v6 = Double.parseDouble("10");

        boolean v7 = Boolean.parseBoolean("true");

        
        System.out.printf("%d%n%d%n%d%n%d%n%.0f%n%.0f%n%b%n", v1, v2, v3, v4, v5, v6, v7);
        
    }
    
}
