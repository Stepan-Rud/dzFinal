package hw.shopToy;

import hw.shopToy.Methods.AddToy;
import hw.shopToy.Methods.ChoosingPrize;
import hw.shopToy.Methods.FrequencyLlossToy;
import hw.shopToy.Methods.ListToys;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ListToys listToys = new ListToys();
        Programm programm = new Programm(new AddToy(listToys), new ChoosingPrize(listToys));
        Scanner scan = new Scanner(System.in);
        FrequencyLlossToy frequency = new FrequencyLlossToy();
        while (true) {
            System.out.print("""
                    Main menu:
                    1 - Создайте новую игрушку и добавьте её в список игрушек
                    2 - Разыграйете призы и запишите их в файл
                    3 - Измените частоту выпадения 1 игрушки 
                    4 - Выведите список игрушек
                    0 - EXIT
                    >\s""");
            var selection = scan.next();
            switch (selection) {
                case "1" -> programm.addToyInListToys();
                case "2" -> programm.drawingOfPrize();
                case "3" -> frequency.changeFrequencyLloss(listToys);
                case "4" -> listToys.toString();
                case "0" -> {
                    System.out.println("Bye");
                    System.exit(0);
                }
                default -> System.out.println("Incorrect selection. Try again.");
            }
        }
    }
}
