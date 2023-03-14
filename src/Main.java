public class Main {

    public static void main(String[] args) {

        precioFinal(139.99);

    }

    static void precioFinal (double precioProducto){

        double productoIVA = 1.19;

        System.out.println(precioProducto * productoIVA);

    }

}

