package br.com.alura.screenmatch;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")//so to dizendo q quando ele for ler o nome ele tbm como title a palavra chave
    private String nome;
    @SerializedName("Year") // so estou dizendo que o ano e isso aqui
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meutituloOmdb) {
        this.nome = meutituloOmdb.title();
        this.anoDeLancamento = Integer.valueOf(meutituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meutituloOmdb.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void setTotalDeAvaliacao(int totalDeAvaliacao) {
        this.totalDeAvaliacao = totalDeAvaliacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibiFichaTecnica() {
        System.out.println("Nome do filme :" + nome);
        System.out.println( "Ano de lançamento :" + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacao ;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());//Comparando um titulo com o outro
    }

    @Override
    public String toString() {
        return STR."Titulo:nome='\{nome}', anoDeLancamento=\{anoDeLancamento},DuracaoEmMinutos=\{duracaoEmMinutos}"
                ;
    }
}
