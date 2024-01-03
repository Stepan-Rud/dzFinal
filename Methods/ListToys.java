package hw.shopToy.Methods;

import hw.shopToy.model.Toys;

import java.util.ArrayList;

public class ListToys {
    private ArrayList listToys;
    private Integer sizeToys;


    public ListToys() {
        this.listToys = new ArrayList<Toys>();
    }

    public Integer getSizeToys() {
        sizeToys = listToys.size();
        return sizeToys;
    }

    public ArrayList getListToys() {
        return listToys;
    }
    public Toys getToy(Integer id) {
        return (Toys) listToys.get(id);
    }

    @Override
    public String toString() {
        return "ListToys{" +
                "listToys=" + listToys +
                '}';
    }
}
