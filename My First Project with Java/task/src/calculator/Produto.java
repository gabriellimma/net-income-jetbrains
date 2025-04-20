package calculator;

import java.math.BigDecimal;

public class Produto {
    private final String nome;
    private final BigDecimal preco;
    private int earnedAmount;

    public Produto(String nome, BigDecimal preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, BigDecimal preco, int earnedAmount) {
        this.nome = nome;
        this.preco = preco;
        this.earnedAmount = earnedAmount;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public int getEarnedAmount() {
        return earnedAmount;
    }

    public void setEarnedAmount(int earnedAmount) {
        this.earnedAmount = earnedAmount;
    }
}
