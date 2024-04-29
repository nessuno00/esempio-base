public class Triangolo extends  Forma{

    private double base;
    private double altezza;

    public Triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        System.out.println("L'area del rettangolo è: " + base * altezza);
    }
}
