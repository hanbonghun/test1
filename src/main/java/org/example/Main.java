package org.example;

public class Main {
    public static void main(String[] args)
    {
        int num = Integer.parseInt("271");
        int len = "271".length();
        int answer = 0;
            String t= "3141592";
        for(int i=0; i<=t.length()-len; i++){
            String s= t.substring(i,i+len);
            if(!compare(s,"271")) answer++;
        }
        System.out.println(answer);
    }
    public static boolean compare(String a,String b){
        for (int i = 0; i < a.length(); i++) {
            dddd
            if(a.charAt(i)-'0'> b.charAt(i)-'0'){
                return true;
            }else if(a.charAt(i)-'0'<b.charAt(i)-'0') return false;
        }
        return false;
    }
}