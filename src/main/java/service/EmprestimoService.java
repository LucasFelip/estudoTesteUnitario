package service;

import model.Livro;
import model.Emprestimo;
import model.Usuario;

import javax.swing.plaf.BorderUIResource;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmprestimoService {
    public Emprestimo alugarLivro(Usuario usuario, Livro... livros) {
        Arrays.stream(livros).forEach(livro -> {
            if (livro.isEmprestado() == true || livro.isReservado() == true)
                throw new IllegalArgumentException("O " + livro.getTitulo() + " foi emprestado");
        });

        Emprestimo Emprestimo = new Emprestimo();
        Emprestimo.adiciona(livros);
        Emprestimo.setUsuario(usuario);
        Emprestimo.setDataEmprestimo(LocalDate.now());
        Emprestimo.setDataPrevista(LocalDate.now().plusDays(7));

        return Emprestimo;
    }

//    public double devolverLivro(Usuario usuario, Livro... livros) {
//
//        Arrays.stream(livros).forEach(livro -> {
//            livro.consultarEmprestimosPorUsuario(usuario);
//        });
//    }

    private double calculaValorLocacao(Livro... livros) {
        double valorTotal = 0, valorLivro = 5;

        for(int i = 1; i <= livros.length; i++){
            valorTotal = valorLivro;
            if(valorTotal <= (valorLivro * 0.6)){
                valorTotal += 0.4;
            }
        }
        return valorTotal;
    }
}