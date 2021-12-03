package com.company;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	    int n=0;
	    String s="Rajesh eats apple pine apple and custard apple";
        StringTokenizer st=new StringTokenizer(s);
        while(st.hasMoreTokens()){
            if(st.nextToken().equalsIgnoreCase("apple")){
                n++;
            }
        }
        System.out.println(n);

    }
}
