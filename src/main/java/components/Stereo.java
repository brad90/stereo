package components;

import java.util.HashMap;

public class Stereo{

//    private ArrayList<Component> components;
    private String name;
    private HashMap<String, Component> stereoComponents;


    public Stereo(String name){
//        this.components = new ArrayList<Component>();
        this.name = name;
        this.stereoComponents = new HashMap<String, Component>();
    }

    public void addComponent(String type, Component component) {
        this.stereoComponents.put(type, component);
    }

    public int getNumberOfComponents() {
        return this.stereoComponents.size();
    }

    public String playRecordDeck() {
        return ((Iplay)this.stereoComponents.get("record deck")).play()  ;
    }
}
