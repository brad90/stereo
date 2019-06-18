package components;

public abstract class Component {


    private String make;
    private String model;

    public Component(String make, String model){
        this.model = model;
        this.make = make;
    }


    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }
}
