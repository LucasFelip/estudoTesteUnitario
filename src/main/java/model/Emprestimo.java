package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Emprestimo {
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private LocalDate dataPrevista;
    private Usuario usuario;
    private List<Livro> livros = new ArrayList<>();

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public LocalDate getDataPrevista() {
        return dataPrevista;
    }

    public void setDataPrevista(LocalDate dataPrevista) {
        this.dataPrevista = dataPrevista;
    }

    public List<Livro> getLivros() {
        return Collections.unmodifiableList(livros);
    }

    public void adiciona(Livro... livros) {
        if (livros.length < 1)
            throw new IllegalArgumentException("A lista precisa de pelo menos um livro");
        else if (livros.length > 3)
            throw new IllegalArgumentException("A lista precisa de no máximo três livros");
        else
            this.livros.addAll(Arrays.asList(livros));
    }

    public List<Emprestimo> consultarEmprestimosPorUsuario(Usuario usuario) {
        List<Emprestimo> emprestismosPorUsuario = new ArrayList<Emprestimo>(); // ERROR: Cannot find local variable 'emprestimo'
        for (Emprestimo emprestismoUsuario : emprestismosPorUsuario) {
            if (emprestismoUsuario.getUsuario().equals(usuario)) {
                emprestismosPorUsuario.add(emprestismoUsuario);
            }
        }
        return emprestismosPorUsuario;
    }
}
