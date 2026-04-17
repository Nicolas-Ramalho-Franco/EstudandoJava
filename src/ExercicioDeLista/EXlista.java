package ExercicioDeLista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EXlista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resp = "S";

        // 1. Lista FORA do loop para persistir os dados
        List<String> compras = new ArrayList<>();
        System.out.println("Bem vindo ao mercado do Nicolas");
        System.out.print("Digite o seu saldo máximo: ");
        int saldo = scanner.nextInt();

        while (!resp.equalsIgnoreCase("N")) {
            System.out.print("Digite o produto que você deseja comprar: ");
            String produto = scanner.next();

            System.out.print("Qual o valor do produto? ");
            int valor = scanner.nextInt();
            // 2. Verifica ANTES de descontar
            if (valor <= saldo) {
                saldo -= valor;
                compras.add(produto);
                System.out.println("Produto adicionado! Saldo restante: " + saldo);

                if (saldo == 0) {
                    System.out.println("Seu saldo atingiu o limite exato!");
                    break;
                }

                System.out.print("Deseja continuar? (S/N): ");
                resp = scanner.next();
            } else {
                System.out.println("Saldo insuficiente para este produto!");
                break;
            }
        }
        Collections.sort(compras);
        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Produtos comprados: " + compras);
        System.out.println("Saldo final: " + saldo);
        scanner.close();
    }
}