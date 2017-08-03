package com.challenges.codewars;

/*
 * Dont count numbers which have 5 inside. Negative numbers accepted.
 */
public class DontGiveMeFive {
    public static void main(String[] args) {

        System.out.println("Starting method");
        int a = dontGiveMeFiveBetter(7, 6);
        System.out.println(a);

    }

    public static int dontGiveMeFive(int start, int end) {

        int count = 0;
        for (int i = start; i <= end; i++) {

                String temp = Integer.toString(Math.abs(i));

                boolean found5 = false;
                for (int j = 0; j < temp.length(); j++) {
                    String a = temp.substring(j, j + 1);
                    int b = Integer.parseInt(a);
                    if (b == 5) {
                        found5 = true;
                        break;
                    }
                }
                if (!found5) {
                    count++;
                }




        }
        return count;
    }
    public static int dontGiveMeFiveBetter(int start, int end) {

        int count = 0;
        if(start > end){throw new RuntimeException("Start is greater than end !");}
        while(start<=end){
            if(!String.valueOf(start).contains("5")){
                count++;
            }
            start++;
        }
        return count;
    }
}