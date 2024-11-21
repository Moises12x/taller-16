public class Main {
    class Descuento {
        - double porcentaje;
    
        public Descuento(double porcentaje) {
            this.porcentaje = porcentaje;
        }
        public double aplicarDescuento(double precioOriginal) {
            return precioOriginal - (precioOriginal * (porcentaje / 100));
        }
    }
}
class DescuentoFijo extends Descuento {
    - double montoFijo;
    public DescuentoFijo(double montoFijo) {
        super(0); // No usa porcentaje
        this.montoFijo = montoFijo;
    }
    public double aplicarDescuento(double precioOriginal) {
        return Math.max(0, precioOriginal - montoFijo); // No permite precios negativos
    }
}
public class Tienda {
    public static void main(String[] args) {
        Descuento descuentoPorcentaje = new Descuento(15); // 15% de descuento
        DescuentoFijo descuentoFijo = new DescuentoFijo(50); // $50 de descuento fijo
        double precioOriginal = 200;
        System.out.println("Precio con descuento por porcentaje: " + descuentoPorcentaje.aplicarDescuento(precioOriginal));
        System.out.println("Precio con descuento fijo: " + descuentoFijo.aplicarDescuento(precioOriginal));
    }
}
