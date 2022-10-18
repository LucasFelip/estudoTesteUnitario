package builder;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

import java.time.LocalDate;
import java.util.List;

public class EmprestimoBuilder {
    private Emprestimo emprestimo;

    private EmprestimoBuilder() {}

    public static EmprestimoBuilder umEmprestimo() {
        EmprestimoBuilder builder = new EmprestimoBuilder();

        builder.emprestimo = new Emprestimo();
        builder.emprestimo.setDataEmprestimo(LocalDate.now());
        builder.emprestimo.setDataPrevista(LocalDate.now().plusDays(7));

        return builder;
    }

    public EmprestimoBuilder emDevolucao() {
        this.emprestimo.setDataDevolucao(LocalDate.now());
        return this;
    }

    public EmprestimoBuilder emUsuario(Usuario usuario) {
        this.emprestimo.setUsuario(usuario);
        return this;
    }

    public EmprestimoBuilder emEmprestimoLivro(Livro livroBuilder) {
        this.emprestimo.adiciona(livroBuilder);
        return this;
    }

    public List<Emprestimo> buscarHistoricoPorUsuario(Usuario usuario) {
        List<Emprestimo> emprestimos = this.emprestimo.consultarEmprestimosPorUsuario(usuario);
        return emprestimos;
    }

    public Emprestimo construi() {
        return this.emprestimo;
    }
}