
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(@NotNull String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] jogoVelha = new char[3][3];


        System.out.println("Jogador 1 = X ");
        System.out.println("Jogador 2 = O ");

        boolean ganhou = false;
        int jogada = 1;
        char sinal = 0;
        int linha = 0;
        int coluna = 0;

        while (!ganhou){
            if(jogada % 2 == 1){
                System.out.println("Jogador 1");
                sinal = 'X';
            }else{
                System.out.println("Jogador 2");
                sinal = 'O';
            }
            boolean linhaValida = false;
            while (!linhaValida) {
                System.out.println("Digite a linha: 1, 2 ou 3 ");
                 linha = scanner.nextInt();
                 if (linha >= 1 && linha <= 3){
                     linhaValida = true;
                 }else{
                     System.out.println("Linha invalida");
                 }

            }
            boolean colunaValida = false;
            while (!colunaValida) {
                System.out.println("Digite a coluna: 1, 2 ou 3 ");
                 coluna = scanner.nextInt();
                 if (coluna >= 1 && coluna <= 3){
                     colunaValida = true;
                 }else{
                     System.out.println("Coluna invalida");
                 }

            }

        }
        linha --;
        coluna --;
        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O'){
            System.out.println("Posicao invalida");
        }else{
            jogoVelha[linha][coluna] = sinal;
            jogada++;
        }
        for (int i = 0; i < jogoVelha.length; i++) {
            for (int j = 0; j < jogoVelha[i].length; j++) {
                System.out.print(jogoVelha[i][j] + " ");
            }
            System.out.println();
        }
        //vericar ganhador
        if ((jogoVelha[0][0]== 'X' && jogoVelha[0][1] == 'X' && jogoVelha[0][2] == 'X')
            || (jogoVelha[1][0]== 'X' && jogoVelha[1][1] == 'X' && jogoVelha[1][2] == 'X') ||
                (jogoVelha[2][0]== 'X' && jogoVelha[2][1] == 'X' && jogoVelha[2][2] == 'X') ||
                (jogoVelha[0][0]== 'X' && jogoVelha[1][0] == 'X' && jogoVelha[2][0] == 'X') ||
                (jogoVelha[0][1]== 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][1] == 'X') ||
                (jogoVelha[0][2]== 'X' && jogoVelha[1][2] == 'X' && jogoVelha[2][2] == 'X') ||
                (jogoVelha[0][0]== 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][2] == 'X') ||
                (jogoVelha[0][2]== 'X' && jogoVelha[1][1] == 'X' && jogoVelha[2][0] == 'X')){
            ganhou = true;
            System.out.println("Jogador 1 venceu");

        } else if ((jogoVelha[0][0]== 'O' && jogoVelha[0][1] == 'O' && jogoVelha[0][2] == 'O')
            || (jogoVelha[1][0]== 'O' && jogoVelha[1][1] == 'O' && jogoVelha[1][2] == 'O') ||
                (jogoVelha[2][0]== 'O' && jogoVelha[2][1] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][0]== 'O' && jogoVelha[1][0] == 'O' && jogoVelha[2][0] == 'O') ||
                (jogoVelha[0][1]== 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][1] == 'O') ||
                (jogoVelha[0][2]== 'O' && jogoVelha[1][2] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][0]== 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][2] == 'O') ||
                (jogoVelha[0][2]== 'O' && jogoVelha[1][1] == 'O' && jogoVelha[2][0] == 'O')){
            ganhou = true;
            System.out.println("Jogador 2 venceu");

        } else {
            System.out.println("Empate");
        }




    }
}


