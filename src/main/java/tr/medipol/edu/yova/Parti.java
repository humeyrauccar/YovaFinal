package tr.medipol.edu.yova;

public class Parti {
    private String ad;
    private int oySayisi;

    public Parti(String ad) {
        this.ad = ad;
        this.oySayisi = 0;
    }

    public String getAd() {
        return ad;
    }

    public int getOySayisi() {
        return oySayisi;
    }

    public void oyArttir() {
        oySayisi++;
    }

    public void oyAzalt() {
        if (oySayisi > 0) {
            oySayisi--;
        } else {
            System.out.println("Partinin oy sayısı zaten sıfır!");
        }
    }
}
