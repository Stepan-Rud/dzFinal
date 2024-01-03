package hw.shopToy;

import hw.shopToy.Methods.AddToy;
import hw.shopToy.Methods.ChoosingPrize;
import hw.shopToy.Methods.FrequencyLlossToy;
import hw.shopToy.Methods.ListToys;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Deque;

public class Programm {
    private ChoosingPrize choosingPrize;
    private FrequencyLlossToy frequencyLlossToy;
    private ListToys listToys = new ListToys();
    private AddToy addToy;


    public Programm(AddToy addToy, ChoosingPrize choosingPrize) {
        this.choosingPrize = choosingPrize;
        this.frequencyLlossToy = frequencyLlossToy;
        this.listToys = listToys;
        this.addToy = addToy;

    }

    public ListToys getListToys() {

        return listToys;
    }

    public void addToyInListToys() {
        addToy.addToy();
    }

    public Deque choosePrize(ListToys listToys) {
        return choosingPrize.toyPrize(listToys);
    }

    public void drawingOfPrize() {
        {
            Deque deque = choosingPrize.toyPrize(choosingPrize.getListToys());
            try {
                FileWriter writer = new FileWriter("prize.txt");
                writer.write(deque.pop().toString());
            } catch (IOException e) {
                throw new RuntimeException("Ошибка записи в файл");

            }
        }
    }
}
