public class Tervitus {
    public String tervitusTekst;

    public Tervitus(String t) {
        this.tervitusTekst = t;
    }

    public Tervitus() {
        this.tervitusTekst ="...";
    }

    public void tervita(){
       System.out.println(tervitusTekst);
   }


}
