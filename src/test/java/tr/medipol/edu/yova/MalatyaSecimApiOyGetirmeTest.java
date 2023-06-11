package tr.medipol.edu.yova;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MalatyaSecimApiOyGetirmeTest {
    private MalatyaSecimApi api;

    @Before
    public void setUp() {
        api = new MalatyaSecimApi();
    }

    @Test
    public void testPartiOyGetir() {
        api.partiOyArttir("A");
        int oySayisi = api.partiOyGetir("A");
        Assert.assertEquals(1, oySayisi);
    }

    @Test
    public void testPartiOyGetirInvalidParti() {
        int oySayisi = api.partiOyGetir("D");
        Assert.assertEquals(-1, oySayisi);
    }
    
    @Test
    public void testPartiOyGetirPartisiOlmayanOylar() {
        api.partiOyArttir("Oy1");
        api.partiOyArttir("Oy2");
        int oy1Sayisi = api.partiOyGetir("Oy1");
        int oy2Sayisi = api.partiOyGetir("Oy2");
        Assert.assertEquals(1, oy1Sayisi);
        Assert.assertEquals(1, oy2Sayisi);
    }
}


