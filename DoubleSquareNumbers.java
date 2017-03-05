package com.company.DoubleSquareNumbers;
public class Main {
    public static void main(String[] args) {
        for(int i=0;;i++)
        {
            if(ps(ps(i))!=0)
            {
                System.out.println(i);
            }
        }
    }
    static int ps(int n)
    {
        int rf = 0;
        for(int i=0;i<=n;i++)
        {
            if(i*i==n) {
                rf = i;
            }
        }
        return rf;
    }
}