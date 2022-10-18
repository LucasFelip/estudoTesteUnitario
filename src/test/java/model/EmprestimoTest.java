package model;

import builder.LivroBuilder;
import builder.UsuarioBuilder;
import builder.EmprestimoBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class EmprestimoTest {
    @Test
    void emprestimoPorUsuario() {
        Usuario usuario = UsuarioBuilder
                .umUsuario()
                .construi();
        Livro livro = LivroBuilder
                .umLivro()
                .taEmprestado()
                .construi();
        Emprestimo emprestimo = EmprestimoBuilder
                .umEmprestimo()
                .emUsuario(usuario)
                .emEmprestimoLivro(livro)
                .construi();
        List<Emprestimo> historico = emprestimo.consultarEmprestimosPorUsuario(usuario);

        int resulSize = historico.size();
        assertEquals(1,resulSize);
    }
}
