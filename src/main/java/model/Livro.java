package model;

import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String autor;
    private String titulo;
    private boolean emprestado;
    private boolean reservado;
    private List<Emprestismo> historico;

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void setReservado(boolean reservado) {
        this.reservado = reservado;
    }

    public List<Emprestismo> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Emprestismo> historico) {
        this.historico = historico;
    }

    public boolean emprestar() {
        if (!this.isEmprestado()) {
            this.setEmprestado(true);
            System.out.println("Livro emprestado com sucesso");
        }
        return this.isEmprestado();
    }

    public List<Emprestismo> consultarEmprestimosPorUsuario(Usuario usuario) {
        List<Emprestismo> emprestismosPorUsuario = new ArrayList<Emprestismo>();
        for (Emprestismo emprestismoUsuario : emprestismosPorUsuario) {
            if (emprestismoUsuario.getUsuario().equals(usuario)) {
                emprestismosPorUsuario.add(emprestismoUsuario);
            }
        }
        return emprestismosPorUsuario;
    }
}
