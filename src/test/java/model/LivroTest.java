package model;

import builder.LivroBuilder;
import builder.UsuarioBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void estaReservado() {
        Livro livro = LivroBuilder
                .umLivro()
                .construi();
        assertFalse(livro.isReservado());
    }

    @Test
    void estaEmprestado() {
        Livro livro = LivroBuilder
                .umLivro()
                .construi();
        assertFalse(livro.isEmprestado());
    }

    @Test
    void emprestimoPorUsuario() {
        Usuario usuario = UsuarioBuilder
                .umUsuario()
                .construi();
        List<Emprestimo> historico = LivroBuilder.umLivro().buscarHistoricoPorUsuario(usuario);
        int resulSize = historico.size();
        assertEquals(0,resulSize);
    }
}
