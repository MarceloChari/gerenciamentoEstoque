import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma das opções para calcular área:");
        System.out.println("1. Quadrado");
        System.out.println("2. Losango");
        System.out.println("3. Triangulo");
        opcao = scanner.nextInt();

        switch(opcao){
            case 1:
            Quadrado x, y;
            x = new Quadrado();
            y = new Quadrado();

            System.out.println("Digite o lado do primeiro quadrado");
            x.lado = scanner.nextDouble();
            double areaX = x.calcularArea();
            System.out.println("A área do quadrado x é: " + areaX);

            System.out.println("Digite o lado do segundo quadrado");
            y.lado = scanner.nextDouble();
            double areaY = y.calcularArea();
            System.out.println("A área do quadrado y é: " + areaY);

            if(areaX > areaY){
                System.out.println("O quadrado X é maior que o Y");
            }else{
                System.out.println("O quadrado Y é maior que o X");
            }
            break;
            case 2:
            Losango lx, ly;
            lx = new Losango();
            ly = new Losango();
            
            System.out.println("Digite a diagonal maior");
            lx.diagonalMaior = scanner.nextDouble();
            System.out.println("Digite a diagonal menor");
            lx.diagonalMenor = scanner.nextDouble();
            double areaLx = lx.calcularAreaLosango();
            System.out.println("A área do losango x é: " + areaLx);

            System.out.println("Digite a diagonal maior");
            ly.diagonalMaior = scanner.nextDouble();
            System.out.println("Digite a diagonal menor");
            ly.diagonalMenor = scanner.nextDouble();
            double areaLy = ly.calcularAreaLosango();
            System.out.println("A área do losango y é: " + areaLy);

            if(areaLx > areaLy){
                System.out.println("O losango X é maior que o Y");
            }else{
                System.out.println("O losango Y é maior que o X");
            }
            break;
            case 3:
            Triangulo tx, ty;
            tx = new Triangulo();
            ty = new Triangulo();
    
            System.out.println("Digite o primeiro lado");
            tx.lado1 = scanner.nextDouble();
            System.out.println("Digite o segundo lado");
            tx.lado2 = scanner.nextDouble();
            System.out.println("Digite o terceiro lado");
            tx.lado3 = scanner.nextDouble();
            double areatX = tx.calcularAreaTriangulo();
            System.out.println("A area do triangulo X é: " + areatX);
    
            System.out.println("Digite o primeiro lado");
            ty.lado1 = scanner.nextDouble();
            System.out.println("Digite o segundo lado");
            ty.lado2 = scanner.nextDouble();
            System.out.println("Digite o terceiro lado");
            ty.lado3 = scanner.nextDouble();
            double areatY = ty.calcularAreaTriangulo();
            System.out.println("A area do triangulo Y é: " + areatY);
    
            if(areatX > areatY){
                System.out.println("O triângulo X é maior que o Y");
            }else{
                System.out.println("O triangulo Y é maior que o X");
            }
            break;
            default:
            System.out.println("Opção inválida.");
        }
        }
}
