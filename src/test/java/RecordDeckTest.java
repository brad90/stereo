import components.RecordDeck;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before(){
        recordDeck = new RecordDeck("Sony", "xyz");
    }

    @Test
    public void recordDeckCanPlay(){
        assertEquals("playing", recordDeck.play());
    }

    @Test
    public void playSpeedSet(){
        assertEquals(33, recordDeck.setPlaySpeed(33));
    }


    @Test
    public void canGetMake(){
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("xyz", recordDeck.getModel());
    }

}
