package br.senai;

public class RecuperarSenha {
    private String email;

    public RecuperarSenha(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "RecuperarSenha{" +
                "email='" + email + '\'' +
                '}';
    }
}
