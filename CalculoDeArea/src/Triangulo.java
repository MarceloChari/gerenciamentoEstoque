public class Triangulo {
    public double lado1;
    public double lado2;
    public double lado3;

        public double calcularAreaTriangulo(){
            double perimetro = (lado1+lado2+lado3);
            double area = Math.sqrt(perimetro*(perimetro-lado1)*(perimetro-lado2)*(perimetro-lado3));
            return area;
        }
}
