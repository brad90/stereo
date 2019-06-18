package components;

public class Radio extends Component {

//    private String make;
//    private String model;

    public Radio( String make, String model){
        super(make, model);
    };

    public String tuneIntoStation(String radioStation) {
        return radioStation;
    }



}
