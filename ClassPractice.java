package kz.kaznu.abay;

import java.util.Arrays;
import java.util.Scanner;

public class ClassPractice {
    public static void main(String[] args){
    WordsCollection();
    }

    public static void WordsCollection(){
        String[] words = {"hello ", "world ", "this ", "is ", "me."};
        String res = "";
        for (int i=0; i<words.length; i++){
            res += words[i];
        }
        System.out.println(res);
    }
}
