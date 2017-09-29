package app.insia.forinsiaapp;

/**
 * Created by José on 29/09/2017.
 */

public class Utilizador {



    public Utilizador( String user, String pass, int permissao) {

        this.user = user;
        this.pass = pass;
        this.permissao = permissao;
    }

    public Utilizador(String user, String pass, int permissao, int key) {
        this.user = user;
        this.pass = pass;
        this.permissao = permissao;
        this.key = key;
    }

    public String user;
    public String pass;
    public int permissao;
    public int key;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPermissao() {
        return permissao;
    }

    public void setPermissao(int permissao) {
        this.permissao = permissao;
    }


    public Utilizador() {

    }


}
