package main;

import vo.Fridge;
import vo.Stove;
import vo.Tv;
import vo.VideoGame;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("works");
        System.out.println("Which device do you want to turn on? \n 1 for Tv;\n 2 for videogame;\n 3 for fridge;\n 4 for stove");

        int option = scanner.nextInt();

        Tv tv = new Tv();
        VideoGame videogame = new VideoGame();
        Fridge fridge = new Fridge();
        Stove stove = new Stove();

        switch (option) {
            case 1:
                tv.turnOn();
                break;
            case 2:
                videogame.turnOn();
                break;
            case 3:
                fridge.turnOn();
                break;
            case 4:
                stove.turnOn();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
