package br.com.alura.screenmatch;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

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
}
