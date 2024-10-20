package br.edu.insper.desagil.aps6.core;

import br.edu.insper.desagil.aps6.converter.FromLocalDateToString;
import br.pro.hashi.sdx.dao.annotation.Auto;
import br.pro.hashi.sdx.dao.annotation.Converted;
import br.pro.hashi.sdx.dao.annotation.Key;

import java.time.LocalDate;

public class Gato {
    private @Auto @Key String id;
    private String nome;
    private Sexo sexo;
    private String raca;
    private String tipoDePelagem;
    private String corDosOlhos;
    private @Converted(FromLocalDateToString.class) LocalDate dataDeNascimento;
    private @Converted(FromLocalDateToString.class) LocalDate dataDeResgate;

    Gato() {
    }

    public Gato(String nome, Sexo sexo, String raca, String tipoDePelagem, String corDosOlhos, LocalDate dataDeNascimento, LocalDate dataDeResgate) {
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.tipoDePelagem = tipoDePelagem;
        this.corDosOlhos = corDosOlhos;
        this.dataDeNascimento = dataDeNascimento;
        this.dataDeResgate = dataDeResgate;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipoDePelagem() {
        return tipoDePelagem;
    }

    public void setTipoDePelagem(String tipoDePelagem) {
        this.tipoDePelagem = tipoDePelagem;
    }

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public void setCorDosOlhos(String corDosOlhos) {
        this.corDosOlhos = corDosOlhos;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataDeResgate() {
        return dataDeResgate;
    }

    public void setDataDeResgate(LocalDate dataDeResgate) {
        this.dataDeResgate = dataDeResgate;
    }
}
