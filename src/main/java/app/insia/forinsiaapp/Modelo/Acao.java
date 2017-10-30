package app.insia.forinsiaapp.Modelo;

import java.util.ArrayList;

public class Acao {
    public String nome;
    public String datainicio;
    public String datafim;
    public String localidade;
    public float nota ;
    public int terminada;
    public Entidade entidade;

    public Entidade getEntidade() {
        return entidade;
    }

    public void setEntidade(Entidade entidade) {
        this.entidade = entidade;
    }

    public Acao(String nome, String datainicio, String localidade, float nota, int terminada, Entidade entidade) {
        this.nome = nome;
        this.datainicio = datainicio;
        this.localidade = localidade;
        this.nota = nota;
        this.terminada = terminada;
        this.entidade = entidade;
    }

    public Acao(String nome, String datainicio, String localidade, float nota, int terminada) {
        this.nome = nome;
        this.datainicio = datainicio;
        this.localidade = localidade;
        this.nota = nota;
        this.terminada = terminada;
    }



    public Acao(String nome, String datainicio, String localidade, float nota) {
        this.nome = nome;
        this.datainicio = datainicio;
        this.localidade = localidade;
        this.nota = nota;
    }

    public int getTerminada() {return terminada;}
    public void setTerminada(int terminada) {this.terminada = terminada;}
    public float getNota() {
        return nota;
    }
    public void setNota(float nota) {
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDatainicio() {
        return datainicio;
    }
    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }
    public String getDatafim() {
        return datafim;
    }
    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
}
