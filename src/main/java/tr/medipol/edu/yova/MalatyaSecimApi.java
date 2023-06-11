package tr.medipol.edu.yova;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MalatyaSecimApi implements ISecimApi {
    private Map<String, Parti> partiler;

    public MalatyaSecimApi() {
        partiler = new HashMap<>();
        partiler.put("A", new Parti("A"));
        partiler.put("B", new Parti("B"));
        partiler.put("C", new Parti("C"));
    }

    
    public void partiOyArttir(String partiAdi) {
        if (partiler.containsKey(partiAdi)) {
            Parti parti = partiler.get(partiAdi);
            parti.oyArttir();
        } else {
            System.out.println("Geçersiz parti!");
        }
    }

 
    public void partiOyAzalt(String partiAdi) {
        if (partiler.containsKey(partiAdi)) {
            Parti parti = partiler.get(partiAdi);
            parti.oyAzalt();
        } else {
            System.out.println("Geçersiz parti!");
        }
    }

    public int partiOyGetir(String partiAdi) {
        if (partiler.containsKey(partiAdi)) {
            Parti parti = partiler.get(partiAdi);
            return parti.getOySayisi();
        } else {
            System.out.println("Geçersiz parti!");
            return -1;
        }
    }

    public List<Parti> partiOyListele() {
        return new ArrayList<>(partiler.values());
    }

    public static void main(String[] args) {
        MalatyaSecimApi api = new MalatyaSecimApi();
        
        api.partiOyArttir("A");
        api.partiOyArttir("B");
        api.partiOyArttir("C");
        api.partiOyArttir("A");
        api.partiOyAzalt("B");
        
        System.out.println("Parti A oy sayısı: " + api.partiOyGetir("A"));
        System.out.println("Parti B oy sayısı: " + api.partiOyGetir("B"));
        System.out.println("Parti C oy sayısı: " + api.partiOyGetir("C"));
        
        List<Parti> partiler = api.partiOyListele();
        System.out.println("Partilerin oy bilgileri:");
        for (Parti parti : partiler) {
            System.out.println(parti.getAd() + ": " + parti.getOySayisi());
        }
    }
}

