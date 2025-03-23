package gestao_funcionarios;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus;
        bonus = salario * 0.1;
        return bonus;
    }
}
