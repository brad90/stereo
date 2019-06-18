import components.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Radio radio;
    MiniDisk miniDisk;
    RecordDeck recordDeck;
    Stereo stereo;


    @Before
    public void before(){
        stereo = new Stereo("Sony");
        radio = new Radio("Sony", "xyz");
        miniDisk = new MiniDisk("Sony", "xyz", 5);
        recordDeck = new RecordDeck("Sony", "xyz");
    }

    @Test
    public void canAddComponent(){
        stereo.addComponent("radio", (Component)radio);
        assertEquals(1,stereo.getNumberOfComponents());
    }

    @Test
    public void canAddAllComponent(){
        stereo.addComponent("radio", (Component)radio);
        stereo.addComponent("miniDisk",(Component)miniDisk);
        stereo.addComponent("record deck",(Component)recordDeck);
        assertEquals(3,stereo.getNumberOfComponents());
    }

    @Test
    public void canPlayRecordDeck(){
        stereo.addComponent("record deck", (Component)recordDeck);
        assertEquals("playing", stereo.playRecordDeck());
    }
}
