package contabanco;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args){
	
	 int numConta;
	 String numAgencia;
	 String nomeCliente;
	 double saldo;
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Bem-vindo!");
	 System.out.println("Para realizar seu cadastro, digite seu nome:\n");
	 nomeCliente = sc.nextLine();	 
	 System.out.println("O número da conta:\n");
	 numConta = sc.nextInt();
	 System.out.println("O número da agência:\n");
	 numAgencia = sc.next();	 
	 System.out.println("Saldo inicial:\n");
	 saldo = sc.nextDouble();
	 
	 System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é " + 
	 numAgencia + ", conta " + numConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

	 
	 sc.close();
}}
