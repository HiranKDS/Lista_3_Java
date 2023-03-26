public class Ponto2D {
        //classe Ponto2D encapsula um ponto no espaço cartesiano de duas dimensões.
        //atributos da classe, coordenadas do ponto no espaço bidimensional
        private double x, y;
        private static int contador = 0;

        public Ponto2D(){
            x = 0;
            y = 0;
        }

        public Ponto2D(double x, double y){
            this.x = x;
            this.y = y;

            ++contador;
            System.out.printf("valores: %d %d; contador = %d\n", x, y, contador);
        }

        public double getX() {
        return x;
        }
        
        public double getY() {
        return y;
        }

        public static int getContador() {
            return contador;
        }
}
