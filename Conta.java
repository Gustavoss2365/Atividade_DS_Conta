package atividade_conta;

/**
 *
 * @author Admin
 */
public class Conta {
    
    private int numero;
    private double saldo;
    private String nome;
    
public Conta(int numero,String nome){
    
    this.numero = numero;
    this.nome = nome;
    this.saldo = 0.0;
}

public void Depositar(double valor){
    
    if(valor > 0){
        this.saldo += valor;
        System.out.println("Deposito de R$: " + valor + "Deposito Realizado com Sucesso. ");
    }else{
        System.out.println("Valor do Deposito Invalido. ");
    }
}

public boolean Sacar(double valor){
    
   if (valor > 0 && valor <= this.saldo){
        this.saldo = valor;
        return true;
    }
    return false;
}

public double ConsultarSaldo(){
    
    return this.saldo;
}

public void ExibirDados(){
    System.out.println("Numero: " + this.numero);
    System.out.println("");
    System.out.println("Nome: " + this.nome);
    System.out.println("");
    System.out.println("Saldo Disponivel: " + this.saldo);
    
}

 }
