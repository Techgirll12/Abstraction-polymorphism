abstract class home {
    protected String name;
    protected double chairs;
    public home(String name, double chairs) {
        this.name = name;
        this.chairs = chairs;
    }
    public abstract void displayDetail();
    public double computeValue(double chairs) {
        return 0;
    }
}


class car extends home {
    private int numberOfwheels;
    public car(String name, double chairs, int numberOfwheels) {
        super(name, chairs);
        this.numberOfwheels = numberOfwheels;
    }
    @Override
    public void displayDetail() {
        System.out.println("home name: " +name);
        System.out.println("home chairs:" +chairs);
        System.out.println("number of wheels: " +numberOfwheels);
    }
}

class Tell extends home {
    private String brand;
    public Tell(String name, double chairs, String brand) {
        super(name, chairs);
        this.brand = brand;
    }
    @Override
    public void displayDetail() {
        System.out.println("home chairs:" + chairs);
        System.out.println("tell brand:" + brand);
    }
}

class Main {
    public static void main(String[] args) {
        car car = new car("toyota", 8635,65);
        Tell tell = new Tell("nokia", 56,"rexaji");

        System.out.println("car details");
        car.displayDetail();
        System.out.println("Tell details");
        tell.displayDetail();
    }
}



