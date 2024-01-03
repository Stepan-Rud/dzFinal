package hw.shopToy.Methods;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Deque;

public class DrawingOfToys {
    private ChoosingPrize choosingPrize;

    public DrawingOfToys(ChoosingPrize choosingPrize) {
        this.choosingPrize = choosingPrize;
    }

    public void drawingOfToys(ChoosingPrize choosingPrize) {
        Deque deque = choosingPrize.toyPrize(choosingPrize.getListToys());
        try {
            FileWriter writer = new FileWriter("PrizeToy.txt");
            writer.write(deque.pop().toString());
        } catch (IOException e) {
            throw new RuntimeException("Ошибка записи в файл");
        }

    }
}
