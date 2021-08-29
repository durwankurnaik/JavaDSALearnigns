package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    static int subtractProductAndSum(int n) {
        int sum = 0, prod = 1;
        while(n != 0) {
            sum += (n % 10);
            prod *= (n % 10);
            n /= 10;
        }
        int min = sum, max = prod;
        if(sum > prod) {
            min = prod;
            max = sum;
        }
        return max - min;
    }
}
