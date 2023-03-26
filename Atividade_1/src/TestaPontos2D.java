public class TestaPontos2D {
    public static void main(String[] args) throws Exception {
        Ponto2D p1 = new Ponto2D(1, 2);

        System.out.printf("X: %d\n", p1.getX());
        System.out.printf("Y: %d\n", p1.getY());

        Ponto2D p2 = new Ponto2D(1, 2);
        System.out.printf("x: %d\n", p2.getX());
        System.out.printf("Y: %d\n", p2.getY());
    }
}
