public class PrincipalElse {
    public static void main(String [] args){
        Pessoa[] pessoas = new Pessoa[3];        

        pessoas[0] = new Pessoa("Joaquim", "M", "Rua C, 145", 19, 0, 1.78);
        pessoas[1] = new Pessoa("Manuelita", "F", "Rua dos Camelos, 12", 30, 3, 1.67);
        pessoas[2] = new Pessoa("Pedro", "M", "Rua dos Gigantes, 189", 10, 1, 1.91);
        
        for(int i = 0; i < 3; i++){
            System.out.print(pessoas[i].imprimeInformacoes());

            if(pessoas[i].isFilhoUnico() && (pessoas[i].getSexo()).equals("M")){
                System.out.print("Filho unico!\n\n");
            }
            else if(pessoas[i].isFilhoUnico() && (pessoas[i].getSexo()).equals("F")){
                System.out.print("Filha unica!\n\n");
            }
            else if(pessoas[i].getSexo().equals("M")){
                System.out.print("Não eh filho unico!\n\n");
            }
            else System.out.print("Não eh filha unica!\n\n");
        }
    }
}
