package org.example;

public class TC01 {
    public static void main(String[] args) {
        String str = "Hollowood";
        //find distinct/unique characters in the string
        for(int i = 0; i < str.length(); i++){
            int flag= 0;
            for(int j = 0; j < str.length(); j++){
                if(str.charAt(j) == str.charAt(i) && i!=j){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(str.charAt(i));
            }
        }


    }
}
