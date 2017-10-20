package app.insia.forinsiaapp.Modelo;


import java.util.ArrayList;

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

    public Utilizador(String user, String pass, int permissao, int key, ArrayList<Acao> acoes) {
        this.user = user;
        this.pass = pass;
        this.permissao = permissao;
        this.key = key;
        this.acoes = acoes;
    }

    public Utilizador(String user, String pass, int permissao, ArrayList<Acao> acoes) {
        this.user = user;
        this.pass = pass;
        this.permissao = permissao;
        this.acoes = acoes;
    }

    private String user;
    private String pass;
    private int permissao;
    private int key;
    public ArrayList<Acao>acoes=new ArrayList<>();

    public ArrayList<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(ArrayList<Acao> acoes) {
        this.acoes = acoes;
    }

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
