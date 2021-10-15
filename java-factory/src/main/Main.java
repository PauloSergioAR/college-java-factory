package main;

import Factory.AbstractFactory;
import Factory.FactoryProvider;
import Factory.LivingRoomApplianceFactory;
import vo.Electronic;
import vo.ElectronicFactoryType;
import vo.ElectronicType;
import vo.Tv;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        AbstractFactory kitchenFactory = FactoryProvider.getElectronicFactory(ElectronicFactoryType.KITCHEN_APPLIANCE_FACTORY);
        AbstractFactory livingRoomFactory = FactoryProvider.getElectronicFactory(ElectronicFactoryType.LIVING_ROOM_APPLIANCE_FACTORY);

        System.out.println("Which device do you want to turn on? \n 1 for Tv;\n 2 for videogame;\n 3 for fridge;\n 4 for stove");

        int option = scanner.nextInt();

        Electronic tv = livingRoomFactory.getElectronic(ElectronicType.TV);
        Electronic videogame = livingRoomFactory.getElectronic(ElectronicType.VIDEOGAME);
        Electronic fridge = kitchenFactory.getElectronic(ElectronicType.FRIDGE);
        Electronic stove = kitchenFactory.getElectronic(ElectronicType.STOVE);;

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
