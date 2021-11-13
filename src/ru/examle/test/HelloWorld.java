package ru.examle.test;

import java.io.IOException;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет! Это проект без maven framework.");
        System.out.println("После создания в корне проекта файла pom.xml");

        FileRead1.fileRead();
        System.out.println();
        System.out.println("и добаления его через меню Add as Maven Project");
        System.out.println("проект должен стать maven проектом");

    }
}
