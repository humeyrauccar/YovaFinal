package tr.medipol.edu.yova;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MalatyaSecimApiOyAzaltmaTest {
    private MalatyaSecimApi api;

    @Before
    public void setUp() {
        api = new MalatyaSecimApi();
    }

    @Test
    public void testPartiOyAzalt() {
        api.partiOyArttir("A");
        api.partiOyArttir("A");
        api.partiOyAzalt("A");
        int oySayisi = api.partiOyGetir("A");
        Assert.assertEquals(1, oySayisi);
    }

    @Test
    public void testPartiOyAzaltInvalidParti() {
        api.partiOyAzalt("D");
        int oySayisi = api.partiOyGetir("D");
        Assert.assertEquals(-1, oySayisi);
    }
}
