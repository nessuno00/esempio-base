public class Main {


    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.calcolaArea();

        Rettangolo rettangolo = new Rettangolo(5, 10);
        rettangolo.calcolaArea();
       Triangolo triangolo = new Triangolo(15,11);
       triangolo.calcolaArea();
    }
}