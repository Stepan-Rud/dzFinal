package hw.shopToy.Methods;

import hw.shopToy.model.Toys;

import java.util.Scanner;

public class FrequencyLlossToy {

    public Toys changeFrequencyLloss(ListToys listToys) {
        Toys toy = (Toys) listToys.getListToys().get(0);
        System.out.println("Вы хотите изменить игрушку с именем " + toy.getName());
        System.out.println("Введите частоту выпадения игрушки 20, 50 или 100: ");
        Scanner scan = new Scanner(System.in);
        if (scan.nextInt() == 20) toy.setFrequencyLlossToy(20);
        if (scan.nextInt() == 50) toy.setFrequencyLlossToy(50);
        if (scan.nextInt() == 100) toy.setFrequencyLlossToy(100);
        switch (toy.getFrequencyLlossToy()) {
            case 20:
                System.out.println("Частота выпадения игрушки изменена на 20");
                break;
            case 50:
                System.out.println("Частота выпадения игрушки изменена на 50");
                break;
            case 100:
                System.out.println("Частота выпадения игрушки изменена на 100");
                break;
        }
        return toy;
    }
}
