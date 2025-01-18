package com.org;

public class Find_Prime_101_to {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 101 and 150 are:");

        
        for (int num = 101; num <= 150; num++)
        {
            boolean num1 = true;

            for (int i = 2; i < num ; i++)
            {
                if (num % i == 0) 
                {
                   num1 = false; 
                    
                }
            }

            if (num1) {
                System.out.print(num + " ");
            }
        }
    }
}
