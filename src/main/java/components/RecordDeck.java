package components;

public class RecordDeck extends Component implements Iplay{

    private int playSpeed;


    public RecordDeck(String make, String model){
        super(make, model);
        this.playSpeed = playSpeed;
    }


    public String play() {
        return "playing";
    }


    public int setPlaySpeed(int speed) {
        return this.playSpeed = speed;
    }
}
