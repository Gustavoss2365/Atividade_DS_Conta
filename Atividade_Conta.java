package atividade_conta;

/**
 *
 * @author Admin
 */
public class Atividade_Conta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta conta1 = new Conta(1234,"Gustavo Sanches");
        conta1.Depositar(600.00);
        conta1.ExibirDados();
        
        boolean sucesso = conta1.Sacar(500.00);
        System.out.println("Saque Realizado com : " + sucesso);
        System.out.println("Saldo Apos realizar o Saque : " + conta1.ConsultarSaldo());
        
        boolean falhou = conta1.Sacar(1000.00);
        System.out.println("Houve Saque : " + falhou);
        System.out.println("Valor do Saque foi 100.00");
        
    }
    
         
    
}
