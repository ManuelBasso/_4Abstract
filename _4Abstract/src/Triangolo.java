public class Triangolo extends Forma{
    private int base;
    private int altezza;

    public Triangolo(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public int calcolaArea(){
        int area = (base*altezza)/2;
        return area;
    }
}
