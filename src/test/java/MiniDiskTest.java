import components.MiniDisk;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiniDiskTest {

    MiniDisk miniDisk;

    @Before
    public void before(){
        miniDisk = new MiniDisk("Sony", "xyz",5);
    }


    @Test
    public void canPlay(){
        assertEquals("playing", miniDisk.play());
    }

    @Test
    public void canSkipSong(){
        assertEquals("Playing next Track", miniDisk.skip());
    }

    @Test
    public void canPauseSong(){
        assertEquals("Song Paused", miniDisk.pause());
    }


    @Test
    public void canGetMake(){
        assertEquals("Sony", miniDisk.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("xyz", miniDisk.getModel());
    }





}
