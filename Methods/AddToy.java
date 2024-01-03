package hw.shopToy.Methods;

import hw.shopToy.model.Toys;

import java.util.Scanner;

public class AddToy {
    private static int idcounter = 0;
    private ListToys listToys;

    public AddToy(ListToys listToys) {
        this.listToys = listToys;
    }

    public void addToy() {
//        int countToy = 0;
//        while (countToy < 1) {
//        Toys toys = null;
            Scanner scan = new Scanner(System.in);
            String title;
            int frequency;
            System.out.print("Введите название игрушки: ");
            title = scan.nextLine();
            if (title.isEmpty()) {
                System.out.println("Неверный ввод");
//                break;
            }
            System.out.print("Введите частоту выпадения игрушки 20, 50 или 100: ");
            String value = scan.nextLine();
                frequency = Integer.parseInt(value);
                if (frequency == 20 || frequency == 50 || frequency == 100) {
                    System.out.print("Введите индекс игрушки: ");
                    idcounter = scan.nextInt();
                    Toys toy = new Toys(title, frequency, idcounter);
                    if (listToys.getListToys().contains(toy)) {
                        System.out.println("Такая игрушка уже существует");
                    }
                    else {
//                        countToy++;
                        listToys.getListToys().add(toy);
//                        idcounter++;
//                        break;
                    }

                } else {
                    System.out.println("Частота должна быть равно 20, 50 или 100");

                }

        }

    }

