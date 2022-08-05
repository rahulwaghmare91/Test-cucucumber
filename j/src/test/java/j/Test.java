package j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*String 	 inputString="testing is uu ";
		 HashMap<Character, Integer> charCountMap
         = new HashMap<Character, Integer>();

     // Converting given string to char array

     char[] strArray = inputString.toCharArray();
     for(int i=0;i<strArray.length;i++) {
    	 if(charCountMap.containsKey(strArray[i])) {
    		 charCountMap.put(strArray[i], charCountMap.get(strArray[i]) + 1);
    	 }
    	 else {
    		 charCountMap.put(strArray[i], 1);
    	 }
     }
     // Printing the charCountMap
     for (Map.Entry entry : charCountMap.entrySet()) {
         System.out.println(entry.getKey() + " " + entry.getValue());*/
		
		//duplicate character in string
/*		String s="aaaaa t f gg k";
		int count;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
		count=1;
		for(int j=i+1;j<ch.length;j++){
		if(ch[i]==ch[j]&&ch[i]!=' '){
		count++;
		ch[j]='0';
		}
		}
		if(count>1&&ch[i]!='0'){
		System.out.println(ch[i]);
		}}*/
		//larget number in array
	/*	int [] a={23,4,56,4};
		int max=a[0];
		for(int i=0;i<a.length;i++){
		if(a[i]>max){
		max=a[i];
		}
		}
		System.out.println("the largest number in array is:" +max);*/
		//the smllest number in array
	/*	int [] a={23,4,56,4};
		int small=a[0];
		for(int i=0;i<a.length;i++){
		if(a[i]<small){
		small=a[i];
		}
		}
		System.out.println("the smallest number in array is:" +small);*/
		//swapping of number withou using third variable
		/*int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b); */
		//Java program to reverse a string's words characters

/*String s="this is";
String [] a=s.split(" ");
String rev="";
for(int i=0;i<a.length;i++) {
	if(i==a.length-1) {
		rev=a[i]+rev;
	}
	else {
		rev=" "+a[i]+rev;
	}
}
System.out.println(rev);*/
		
/*String h="this is another string";
String rev=" ";
String [] s1=h.split(" ");
for(int i=0;i<s1.length;i++) {
	if(i%2!=0) {
		StringBuilder sb=new StringBuilder(s1[i]);
		rev=rev+" "+sb.reverse().toString();
	}
	else {
		rev=" "+rev+" "+s1[i];
	}
}
System.out.println(rev);*/
	/*	String s="this  is string";
        char ch[]=s.toCharArray();
        HashMap <Character, Integer>h1=new HashMap();
        int count=1;
        for(int i=0;i<ch.length;i++){
            if(h1.containsKey(ch[i])){
                h1.put(ch[i],h1.get(ch[i])+1);
            }
            else{
                h1.put(ch[i],1);
            }
        }
          for (Map.Entry entry : h1.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }*/
      /*  String s="this is string";
        int count=0;
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++ ){
            count=1;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]!=ch[j]){
                    continue;
                }
                count++;
                ch[j]='0';
            }
            if(count>1&& ch[i]!=' '){
                System.out.println(ch[i]);
            }
        }*/
		
		    

	}}

	 	
	    
	   
		
		

	


