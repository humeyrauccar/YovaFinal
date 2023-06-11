package tr.medipol.edu.yova;

import java.util.List;

public interface ISecimApi {
    void partiOyArttir(String partiAdi);
    void partiOyAzalt(String partiAdi);
    int partiOyGetir(String partiAdi);
    <Parti> List<Parti> partiOyListele();
}

