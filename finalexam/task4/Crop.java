package finalexam.task4;

import java.io.Serializable;

public class Crop implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String type;
    private double yield;

    public Crop(String name, String type, double yield) {
        this.name = name;
        this.type = type;
        this.yield = yield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        this.yield = yield;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", yield=" + yield +
                '}';
    }
}
