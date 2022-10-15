package builder;

import model.Usuario;

public class UsuarioBuilder {
    private Usuario usuario;

    private UsuarioBuilder() {
    }

    public static UsuarioBuilder umUsuario() {
        UsuarioBuilder builder = new UsuarioBuilder();

        builder.usuario = new Usuario();
        builder.usuario.setNome("Lucas");
        builder.usuario.setMatricula("55102232");
        builder.usuario.setEmDebito(false);

        return builder;
    }

    public UsuarioBuilder emDebito() {
        this.usuario.setEmDebito(true);
        return this;
    }

    public Usuario construi() {
        return this.usuario;
    }
}