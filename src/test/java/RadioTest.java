import components.Radio;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio("Sony", "xyz");
    }

    @Test
    public void canTune(){
        assertEquals("Radio 1", radio.tuneIntoStation("Radio 1"));
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("xyz", radio.getModel());
    }



}
