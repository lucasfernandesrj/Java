package contabanco;
public class Banco{
    public int numConta;
    protected String tipo; // cc = conta corrente, cp = conta poupança
    private String dono;
    private float saldo;
    private boolean  status; // true = aberto, false = fechado
    
    public Banco(int numConta,String dono){
        setNumConta(numConta);
        setDono(dono);
        setStatus(false);
        setSaldo(0);
    }
    public void abrirConta(String tipo){
        if (tipo.equals("CP") || tipo.equals("CC")){
            setTipo(tipo);
            setStatus(true);
            if(getTipo().equals("CC"))setSaldo(50);
            else if(getTipo().equals("CP"))setSaldo(150);
            System.out.println("Conta "+getNumConta()+" aberta com sucesso!");
        }
        else
            System.out.println("Erro! Falha na abertura de conta "+getNumConta()+"!");
    }
    public void fecharConta(){
        if(getSaldo() == 0){
            setStatus(false);
            System.out.println("Conta "+getNumConta()+" fechada com sucesso.");
        }
        else {
            System.out.print("### Conta "+getNumConta()+" não pode ser fechada. ");
            if(getSaldo() < 0) System.out.println("Saldo Negativo!");
            else System.out.println("Saldo Positivo!");
        }
    }
    public void depositar(float saldo){
        if (getStatus()) {
            setSaldo(getSaldo()+ saldo);
            System.out.println("Depósito realizado na conta "+getNumConta()+".");
        }
        else System.out.println("### ERRO ! Conta "+getNumConta()+" fechada ###");
    }
    public void sacar(float saldo){
        if (getStatus()){
            if(getSaldo() > 0){
                if(getSaldo()>= saldo) {
                    setSaldo(getSaldo()-saldo);
                    System.out.println("Saque realizado na conta "+getNumConta()+".");
                }
                else System.out.println("### Saldo insuficiente para saque.");
            }else System.out.println("### ERRO! Saldo Negativo! ###");
        }else System.out.println("### ERRO! Conta "+getNumConta()+" fechada!");
    }
    public void pagarMensal(){
        if (getStatus()) {
            int v=0;
            if (getTipo().equals("CC")) v = 12;
            else if(getTipo().equals("CP")) v = 20;
            
            if(!getTipo().equals("CP") && !getTipo().equals("CC")) 
                System.out.println("### ERRO = Tipo inválido!");
            if(getTipo().equals("CC"))setSaldo(getSaldo()-v);
            else if(getTipo().equals("CP"))setSaldo(getSaldo()-v);
        }
        else System.out.println("### ERRO! Conta "+getNumConta()+" fechada!");
    }
    private int getNumConta(){
        return this.numConta;
    }
    private void setNumConta(int numConta){
        this.numConta = numConta;
    }
    private String getTipo(){
        return this.tipo;
    }
    private void setTipo(String tipo){
        this.tipo = tipo;
    }
    private String getDono(){
        return this.dono;
    }
    private void setDono(String dono){
        this.dono = dono;
    }
    private float getSaldo(){
        return this.saldo;
    }
    private void setSaldo(float saldo){
        this.saldo = saldo;
    }
    private boolean getStatus(){
        return this.status;
    }
    private void setStatus(boolean status){
        this.status = status;
    }
    
    public void imprime(){
        System.out.println("------------Informações------------");
        System.out.println("Nº da Conta: "+ getNumConta());
        System.out.println("Dono: "+ getDono());
        System.out.printf("Saldo: %.2f reais.\n", getSaldo());
        if (getStatus()){
            System.out.println("Status: Conta Aberta.");
                if (getTipo().equals("CC"))
                    System.out.println("Tipo: Conta Corrente");
                else if(getTipo().equals("CP")) 
                    System.out.println("Tipo: Conta Poupança");
        }
        else System.out.println("Status: Conta Fechada.");
    }  
}