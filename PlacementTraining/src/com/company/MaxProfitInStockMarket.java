package com.company;

class MaxProfitInStockMarket {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minIndex = min(prices);
        int maxIndex = max(prices, minIndex);
        
        return maxIndex - minIndex;
    }
    
    public static int min(int[] arr) {
        int min = 0;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }
    
    public static int max(int[] arr, int start) {
        int max = start;
        
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }
}