import java.util.Scanner;

public class Contador{
    public static void main(String args[]){
        Scanner entrada =new Scanner(System.in);
        System.out.println("digite o primeiro parâmetro");
        int par1= entrada.nextInt();
        System.out.println("digite o segundo parâmetro");
        int par2= entrada.nextInt();
        		try {
			//chamando o método contendo a lógica de contagem
			contar(par1, par2);
		
		}catch (ParamentrosInvalidosException e) {
			System.out.println(e);
		}
		
	}




	static void contar(int par1, int par2 ) throws ParamentrosInvalidosException {
		if(par1>par2){
            throw new ParamentrosInvalidosException("o parametro 1 deve ser menor que o 2");
        }

		
		int contagem = par2-par1;
		for(int i=0;i<contagem;i++){
            System.out.printf("imprimindo  parametro %d\n1",i);
        }
}
}