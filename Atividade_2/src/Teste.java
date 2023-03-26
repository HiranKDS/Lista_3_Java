public class Teste {
    public static void main(String[] args) throws Exception {

        Retangulo semparametro = new Retangulo();
        Retangulo comparametro = new Retangulo(3, 4);

        System.out.println("Comprimento: "+ semparametro.getComprimento() + "\nLargura: "+ semparametro.getLargura() + "\nPerímetro do retangulo1: "+ semparametro.calcular() + "\nÁrea do retangulo1: "+ semparametro.calcularArea() + "\n");
        System.out.println("Comprimento: "+ comparametro.getComprimento() + "\nLargura: "+ comparametro.getLargura() + "\nPerímetro do retangulo2: "+ comparametro.calcular()+ "\nÁrea do retangulo2: "+ comparametro.calcularArea() + "\n");
    }
}
