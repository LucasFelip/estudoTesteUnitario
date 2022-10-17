package builder;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

import java.util.Collections;
import java.util.List;

public class LivroBuilder {
    private Livro livro;

    private LivroBuilder() {
    }

    public static LivroBuilder umLivro() {
        LivroBuilder builder = new LivroBuilder();

        builder.livro = new Livro();
        builder.livro.setTitulo("The Witcher");
        builder.livro.setAutor("Sapkowski");
        builder.livro.setEmprestado(false);
        builder.livro.setReservado(false);

        return builder;
    }

    public LivroBuilder taEmprestado() {
        this.livro.setEmprestado(true);
        return this;
    }

    public LivroBuilder taReservaod() {
        this.livro.setReservado(true);
        return this;
    }

    public List<Emprestimo> buscarHistoricoPorUsuario(Usuario usuario) {
        List<Emprestimo> emprestimos = this.livro.consultarEmprestimosPorUsuario(usuario);
        return emprestimos;
    }

    public Livro construi() {
        return this.livro;
    }
}