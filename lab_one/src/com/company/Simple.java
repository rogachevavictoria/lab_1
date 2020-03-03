package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Simple extends Thread{
    public void run(){
        try {
            FileWriter myWriter = new FileWriter("simp.txt");
            for(int i=0;i < 100 ;++i)
            {
                if(checkSimple(i))  myWriter.write(i + " ");
            }
            myWriter.close();
        } catch (IOException e) {}
    }
    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}
