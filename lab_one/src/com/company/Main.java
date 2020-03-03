package com.company;
import java.io.*;
import java.util.Scanner;
public class Main extends Thread{
    public static void main(String[] args)	{
        Scanner console = new Scanner(System.in);
        Fib f = new Fib(); Simple s = new Simple();
        s.start(); f.start();
        try{
        File myObj = new File("simp.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
        }
            FileReader fr=new FileReader(myObj);
            BufferedReader br=new BufferedReader(fr);
            int c = 0, a=0;
            while((c = br.read()) != -1)
            {
                char character = (char) c;
                if(character==' '){a++;}
            }
            myReader.close();
            System.out.println(a);
        }catch (IOException e){}
        try{
            File myObj2 = new File("fib.txt");
            Scanner myReader2 = new Scanner(myObj2);
            while (myReader2.hasNextLine()) {
                String data2 = myReader2.nextLine();
                System.out.println(data2);
            }
            FileReader fr2=new FileReader(myObj2);
            BufferedReader br2=new BufferedReader(fr2);
            int c2 = 0, a2=0;
            while((c2 = br2.read()) != -1)
            {
                char character2 = (char) c2;
                if(character2==' '){a2++;}
            }
            myReader2.close();
            System.out.println((a2+1));
        }catch (IOException e){}}
    }

