package hw.shopToy.model;

public class Toys {
    private String name;
    private Integer frequencyLlossToy;
    private Integer id;


    public Toys(String name, Integer frequencyLlossToy, Integer id) {
        this.name = name;
        this.frequencyLlossToy = frequencyLlossToy;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getFrequencyLlossToy() {
        return frequencyLlossToy;
    }

    public Integer getId() {
        return id;
    }

    public void setFrequencyLlossToy(Integer frequencyLlossToy) {
        this.frequencyLlossToy = frequencyLlossToy;
    }

    @Override
    public String toString() {
        return "Toys{" +
                "name='" + name + '\'' +
                ", frequencyLlossToy=" + frequencyLlossToy +
                ", id=" + id +
                '}';
    }
}