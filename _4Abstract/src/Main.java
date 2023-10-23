public class Main {
    public static void main(String[] args) {

        Rettangolo rett1 = new Rettangolo(4,3);
        Triangolo triang1 = new Triangolo(4,3);

        System.out.println(rett1.calcolaArea());
        System.out.println(triang1.calcolaArea());
    }
}