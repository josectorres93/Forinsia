package app.insia.forinsiaapp.Modelo;

import java.util.ArrayList;



public class Entidade {
    public int id;
    public String nome;
    public ArrayList<Acao>acoes=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Acao> getAcoes() {
        return acoes;
    }

    public void setAcoes(ArrayList<Acao> acoes) {
        this.acoes = acoes;
    }
}
