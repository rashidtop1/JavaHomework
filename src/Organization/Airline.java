package Organization;

import Venchiles.Airplane;
import Venchiles.Helicopter;
import Venchiles.Quadcopter;
import Venchiles.Venchile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Airline implements Organization {

    Scanner scanner = new Scanner(System.in);

    int input = scanner.nextInt();
    String inputName = scanner.nextLine();

    Helicopter[] helicopters = new Helicopter[input];
    Airplane[] airplanes = new Airplane[input];
    Quadcopter[] quadcopters = new Quadcopter[input];

    @Override
    public void createBase() {
        System.out.println("Добавление в базу вертолётов:");
        for (int i = 0; i < helicopters.length; i++) {
            helicopters[i].setName(inputName);
            helicopters[i].setLoadСapacity(input);
            helicopters[i].setСapacity(input);
            helicopters[i].setRangeOfflight(input);
        }
        System.out.println("Вид летательного аппарата установлен. Информация:");
        for (int i = 0; i < helicopters.length; i++) {
            System.out.println(helicopters[i].getName());
            System.out.println(helicopters[i].getLoadСapacity());
            System.out.println(helicopters[i].getСapacity());
            System.out.println(helicopters[i].getRangeOfflight());
        }

        System.out.println("Добавление в базу самолётов:");
        for (int i = 0; i < airplanes.length; i++) {
            airplanes[i].setName(inputName);
            airplanes[i].setLoadСapacity(input);
            airplanes[i].setСapacity(input);
            airplanes[i].setRangeOfflight(input);
        }
        System.out.println("Вид летательного аппарата установлен. Информация:");
        for (int i = 0; i < airplanes.length; i++) {
            System.out.println(airplanes[i].getName());
            System.out.println(airplanes[i].getLoadСapacity());
            System.out.println(airplanes[i].getСapacity());
            System.out.println(airplanes[i].getRangeOfflight());
        }


        System.out.println("Добавление в базу квадрокоптеров:");
        for (int i = 0; i < quadcopters.length; i++) {
            quadcopters[i].setName(inputName);
            quadcopters[i].setLoadСapacity(input);
            quadcopters[i].setСapacity(input);
            quadcopters[i].setRangeOfflight(input);
        }
        System.out.println("Вид летательного аппарата установлен. Информация:");

        for (int i = 0; i < quadcopters.length; i++) {
            System.out.println(quadcopters[i].getName());
            System.out.println(quadcopters[i].getLoadСapacity());
            System.out.println(quadcopters[i].getСapacity());
            System.out.println(quadcopters[i].getRangeOfflight());
        }

    }
//???????????????? допилить

    @Override
    public void sortBySign() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < airplanes.length; i++) {


        }

    }

    @Override
    public void countLoadCapacity() {
        double totalLoadCapacity = 0;

        for (int i = 0; i < airplanes.length; i++) {
            totalLoadCapacity+= airplanes[i].getLoadСapacity();
        }

        for (int i = 0; i < helicopters.length; i++) {
            totalLoadCapacity+= helicopters[i].getLoadСapacity();
        }

        for (int i = 0; i < quadcopters.length; i++) {
            totalLoadCapacity+= quadcopters[i].getLoadСapacity();
        }

        System.out.println("Общая грузподъёмность = " + totalLoadCapacity);

    }

    @Override
    public void countCapacity() {
        double totalCapacity = 0;

        for (int i = 0; i < airplanes.length; i++) {
            totalCapacity+= airplanes[i].getСapacity();
        }

        for (int i = 0; i < helicopters.length; i++) {
            totalCapacity+= helicopters[i].getСapacity();
        }

        for (int i = 0; i < quadcopters.length; i++) {
            totalCapacity+= quadcopters[i].getСapacity();
        }

        System.out.println("Общая вместимость = " + totalCapacity);

    }
}
