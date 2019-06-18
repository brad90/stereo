package components;

public class MiniDisk extends Component{

    private int numberOfDisks;
//    private String make;
//    private String model;

    public MiniDisk(String make, String model, int numberOfDisks){
        super(make, model);
        this.numberOfDisks = numberOfDisks;
    }


    public String play() {
        return "playing";
    }

    public String skip() {
        return "Playing next Track";
    }

    public String pause() {

        return "Song Paused";
    }

}
