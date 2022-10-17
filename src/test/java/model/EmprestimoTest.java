package model;

import builder.UsuarioBuilder;
import builder.EmprestimoBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmprestimoTest {
    @Test
    void naoEmprestaLivro() {
        Usuario usuario = UsuarioBuilder
                .umUsuario()
                .construi();
        Emprestimo emprestimo = EmprestimoBuilder
                .umEmprestimo()
                .emUsuario(usuario)
                .construi();
        assertEquals(null, emprestimo.getLivros()); //Teste estranho? Sim!KKKKKKKK
    }
}
