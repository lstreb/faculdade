import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FuncionarioCaixa[] funcionarios = new FuncionarioCaixa[2];
        Empresa empresa1 = new Empresa();

        System.out.print("\nPreencha as informações do primeiro funcionario: ");
        funcionarios[0] = preencheInfoFuncionario(scanner);
        empresa1.setFuncionario1(funcionarios[0]);

        System.out.print("\nOPERAÇÕES\n");
        System.out.println(funcionarios[0].soma(2, 2));
        System.out.println(funcionarios[0].subtrai(5, 4));
        System.out.println(funcionarios[0].multiplica(2, 3));
        System.out.println(funcionarios[0].divide(6, 3));
        System.out.println(funcionarios[0].elevaAoQuadrado(72));
        System.out.println(funcionarios[0].elevaAoCubo(83));

        System.out.print("\nPreencha as informações da empresa: ");
        System.out.print("\nNome da empresa: ");
        empresa1.setNome(scanner.nextLine());

        System.out.print("\nPreencha as informações do segundo funcionario: ");
        funcionarios[1] = preencheInfoFuncionario(scanner);
        empresa1.setFuncionario2(funcionarios[1]);

        System.out.print(empresa1.imprimeInfo());
    }

    static public FuncionarioCaixa preencheInfoFuncionario(Scanner scanner){
        FuncionarioCaixa funcionario = new FuncionarioCaixa();
        Calculadora calculadora = new Calculadora(null);

        System.out.print("\nNome do funcionário: ");
        funcionario.setNome(scanner.nextLine());

        System.out.print("Endereco do funcionário: ");
        funcionario.setEndereco(scanner.nextLine());

        System.out.print("Sexo do funcionário: ");
        funcionario.setSexo(scanner.nextLine());

        System.out.print("Cor da calculadora do funcionário: ");
        calculadora.setCor(scanner.nextLine());

        System.out.print("Memoria da calculadora do funcionário: ");
        calculadora.setMemoria(Integer.parseInt(scanner.nextLine()));

        funcionario.setCalculadora(calculadora);

        return funcionario;
    }
}
