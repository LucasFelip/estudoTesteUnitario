package service;

import model.Emprestismo;
import model.Livro;
import model.Usuario;

import java.time.LocalDate;
import java.util.Arrays;

public class EmprestimoLivro {
    public Emprestismo emprestismoLivro(Usuario usuario,Livro... livros){
        //if(livros.length < 1 || livros.length > 3)

        Arrays.stream(livros).forEach(livro -> {
            if (livro.isEmprestado() == true)
                throw new IllegalArgumentException("O livro " + livro.getTitulo() + " esta emprestimo");
            if (livro.isReservado() == true)
                throw new IllegalArgumentException("O livro " + livro.getTitulo() + " esta reservado");
        });

        Emprestismo emprestismo = new Emprestismo();
        emprestismo.setUsuario(usuario);
        emprestismo.adiciona(livros);
        emprestismo.setDataEmprestimo(LocalDate.now());
        emprestismo.setDataPrevista(LocalDate.now().plusDays(7));

        return emprestismo;
    }

    public double calculaValorEmprestimo(Livro... livros){
        double valorEmprestimo = 5.00;
        for (int i = 0; i < livros.length; i++){

        }
        return valorEmprestimo;
    }
}