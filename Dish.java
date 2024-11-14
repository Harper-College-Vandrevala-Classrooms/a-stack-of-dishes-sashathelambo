public class Dish {
    private String name;
    private int diameter;

    public Dish() {
        this.name = "Unknown";
        this.diameter = 0;
    }

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }
} 