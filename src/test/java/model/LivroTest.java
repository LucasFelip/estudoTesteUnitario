package model;

import builder.LivroBuilder;
import org.junit.jupiter.api.Test;

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
}
