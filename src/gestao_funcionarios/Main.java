package gestao_funcionarios;

public class Main {
    public static void main(String[] args) {
        Gerente meuGerente = new Gerente("Junior", 12500.00);
        Desenvolvedor meuDesenvolvedor1 = new Desenvolvedor("Marcelo", 7300.00);
        Desenvolvedor meuDesenvolvedor2 = new Desenvolvedor("Richard", 8100.00);
        Desenvolvedor meuDesenvolvedor3 = new Desenvolvedor("Maria", 5700.00);
        Empresa minhaEmpresa = new Empresa();

        minhaEmpresa.adicionarFuncionario(meuGerente);
        minhaEmpresa.adicionarFuncionario(meuDesenvolvedor1);
        minhaEmpresa.adicionarFuncionario(meuDesenvolvedor2);
        minhaEmpresa.adicionarFuncionario(meuDesenvolvedor3);

        minhaEmpresa.exibirFuncionarios();
    }
}