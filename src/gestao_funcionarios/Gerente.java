package gestao_funcionarios;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus;
        bonus = salario * 0.2;
        return bonus;
    }
}
