package ru.examle.test;


import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead1 {

    public static void fileRead() throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("pom.txt"));

        byte[] buffer = new byte[dis.available()];
        while (dis.available() != 0){
            int count = dis.read(buffer);
            System.out.println();
            System.out.println("В файл pom.xml должны быть внесены следующие строки:");
            System.out.println();
            if (count > 0){
                System.out.println(new String(buffer));
            }
        }
    }
}