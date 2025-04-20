package calculator;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static double totalIncome = 0;

    public static void printItemList(List<Produto> produtos) {
        System.out.println("Prices:");
        for(Produto p: produtos) {
            System.out.printf("%s: $%.1f%n", p.getNome(), p.getPreco());
        }
    }

    public static void printEarnedAmount(List<Produto> produtos) {
        System.out.println("Earned amount:");
        for(Produto p : produtos) {
            System.out.printf("%s: $%d%n", p.getNome(), p.getEarnedAmount());
            setTotalIncome(p.getEarnedAmount());
        }
        System.out.printf("%nIncome: $%.1f%n", getTotalIncome());
    }

    public static void printNetIncome(double income, double staffExpenses, double otherExpenses) {
        double netIncome = income - staffExpenses - otherExpenses;
        System.out.printf("Net income: $%.0f", netIncome);
    }

    public static void setTotalIncome(double incomeValue) {
        totalIncome += incomeValue;
    }

    public static double getTotalIncome() {
        return totalIncome;
    }

    public static void main(String[] args) {

        List<Produto> produtos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        produtos.add(new Produto("Bubblegum", new BigDecimal("2"), 202));
        produtos.add(new Produto("Toffee", new BigDecimal("0.2"), 118));
        produtos.add(new Produto("Ice cream", new BigDecimal("5"), 2250));
        produtos.add(new Produto("Milk chocolate", new BigDecimal("4"), 1680));
        produtos.add(new Produto("Doughnut", new BigDecimal("2.5"), 1075));
        produtos.add(new Produto("Pancake", new BigDecimal("3.2"), 80));
        
        printEarnedAmount(produtos);

        System.out.println("Staff expenses:");
        double staffExpenses = sc.nextDouble();
        System.out.println("Other expenses:");
        double otherExpenses = sc.nextDouble();

        printNetIncome(getTotalIncome(), staffExpenses, otherExpenses);
    }
}