package hw.shopToy.Methods;

import hw.shopToy.model.Toys;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

public class ChoosingPrize {
    private ListToys listToys;

    public ChoosingPrize(ListToys listToys) {
        this.listToys = listToys;
    }


    public Deque toyPrize(ListToys toys) {
        Deque<Toys> deque = new ArrayDeque<>();
        Comparator<Toys> compareByFrequency = Comparator.comparing(Toys::getFrequencyLlossToy).reversed();
        toys.getListToys().sort(compareByFrequency);
        deque.add((Toys) toys.getListToys().get(0));
        toys.getListToys().remove(0);
        System.out.println("Вы выиграли игрушку " + deque.peek().getName());
        System.out.println("Список игрушек " + toys.getListToys());
        return deque;
    }

    public ListToys getListToys() {
        return listToys;
    }
}
