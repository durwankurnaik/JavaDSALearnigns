package com.company;

public class SomeonesProblemOnDiscord {
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
        permutation(p,up);

    }
    static void permutation(String p, String up){
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length() ; i++) {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutation(f+ch+s,up.substring(1));
        }
    }
}
