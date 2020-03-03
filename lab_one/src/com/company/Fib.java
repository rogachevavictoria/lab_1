package com.company;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Fib extends Thread{

        public void run(){
            int n1=0,n2=1,n3,i,count=10;
            try {
                File myObj = new File("fib.txt");
                FileWriter myWriter = new FileWriter("fib.txt");
                myWriter.write(n1+" "+n2);
                for(i=2;i<count;++i)
                {
                    n3=n1+n2;
                    myWriter.write(" "+ n3);
                    n1=n2;
                    n2=n3;
                }
                myWriter.close();
            } catch (IOException e) {}
        }

    }
