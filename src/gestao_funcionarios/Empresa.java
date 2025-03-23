package gestao_funcionarios;

import java.util.ArrayList;

public class Empresa {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario meuFuncionario){
        funcionarios.add(meuFuncionario);
    }

    public void exibirFuncionarios(){
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirInfo();
            System.out.println("---------------------------");
        }
    }
}
