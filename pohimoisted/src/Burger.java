public class Burger {
    private String nimi;
    private String lihh;
    private String sai;
    private Double hind;
    private String lisand1;
    private String lisand2;
    private String lisand3;
    private String lisand4;
    private Double lisand1Hind;
    private Double lisand2Hind;
    private Double lisand3Hind;
    private Double lisand4Hind;

    public Burger(String nimi, String liha, String sai, Double hind) {
        this.nimi = nimi;
        this.lihh = liha;
        this.sai = sai;
        this.hind = hind;
    }

    public Double lisaLisand1(String lisand1, Double lisand1Hind) {
        this.lisand1 = lisand1;
        this.lisand1Hind = lisand1Hind;

        System.out.println("Lisandiks sooviti " + this.lisand1);
        return this.lisand1Hind;
    }

    public Double lisaLisand2(String lisand2, Double lisand2Hind) {
        this.lisand2 = lisand2;
        this.lisand2Hind = lisand2Hind;

        System.out.println("Lisandiks sooviti " + this.lisand2);
        return this.lisand2Hind;
    }

    public Double lisaLisand3(String lisand3, Double lisand3Hind) {
        this.lisand3 = lisand3;
        this.lisand3Hind = lisand3Hind;

        System.out.println("Lisandiks sooviti " + this.lisand3);
        return this.lisand3Hind;
    }

    public Double lisaLisand4(String lisand4, Double lisand4Hind) {
        this.lisand1 = lisand4;
        this.lisand1Hind = lisand4Hind;

        System.out.println("Lisandiks sooviti " + this.lisand4);
        return this.lisand4Hind;
    }

    public void teeBurger() {
        System.out.println("Burger on ready.");
        Double burgeriLõppHind = this.hind + this.lisand1Hind + this.lisand2Hind + this.lisand3Hind + this.lisand4Hind;
        System.out.println("Burger maksab " + burgeriLõppHind + " eurot.");
    }


}


