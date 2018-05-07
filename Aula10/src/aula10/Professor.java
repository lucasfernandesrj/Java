package aula10;

public class Professor extends Pessoa {
    String especialidade;
    float salario;
    
    public void receberAumento(float valor){
        this.setSalario(this.getSalario()+valor);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
