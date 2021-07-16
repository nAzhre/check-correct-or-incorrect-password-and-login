package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Scanner in = new Scanner(System.in);
            BufferedReader bufferedReader = new BufferedReader(new FileReader("data.txt"));
            System.out.print("Insert login:");
            String login = in.next();
            System.out.print("Insert password:");
            String password = in.next();
            if (login.equals(bufferedReader.readLine()) && password.equals(bufferedReader.readLine())){
                System.out.println("Login and password are correct");
            }else {
                System.out.println("Login and password are incorrect");
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}