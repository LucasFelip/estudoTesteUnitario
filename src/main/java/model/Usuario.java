package model;

public class Usuario {
    private String nome;
    private String matricula;
    private boolean emDebito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public boolean isEmDebito() {
        return emDebito;
    }

    public void setEmDebito(boolean emDebito) {
        this.emDebito = emDebito;
    }
}