package com.company;
// https://leetcode.com/problems/add-binary/

public class AddBinary {
    public static void main(String[] args) {
        String a = "11", b = "1";

        System.out.println(addBinary(a, b));
    }

    // Got a runtime error for these strings
    // "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
    // "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
    static String addBinary(String a, String b) {
        // Parsing the binary string to decimal numbers
        int anum = Integer.parseInt(a, 2);
        int bnum = Integer.parseInt(b, 2);

        // Adding the nums and returning the binary form of string
        return Integer.toBinaryString((anum + bnum));
    }

    // Someones answer
    static String addBinary1(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i >= 0 || j >= 0)
        {
            int sum = carry;
            if(i >= 0)
                sum += a.charAt(i)-'0';
            if(j >= 0)
                sum += b.charAt(j)-'0';
            sb.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }

        if(carry != 0)
            sb.append(1);
        return sb.reverse().toString();
    }
}
