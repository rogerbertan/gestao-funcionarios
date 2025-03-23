package gestao_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    protected void exibirInfo(){
        System.out.println("Nome: " + nome +
                           "\nSalário: R$" + salario +
                           "\nBônus: R$" + calcularBonus());
    }
}
