package org.example;

public class Solution {
    public static int areaOrPerimeter(int l, int w) {
        return w == l ? (l * w) : (2 * (l + w));
    }
}
