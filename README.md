🎮 Jogo da Velha em Java

Um simples e didático Jogo da Velha (Tic Tac Toe) feito em Java, totalmente funcional no console.
O projeto permite que dois jogadores joguem entre si, escolhendo posições no tabuleiro por meio do teclado.

🚀 Tecnologias Utilizadas

Java (JDK 8+)

Console / Terminal

Scanner para entrada de dados

📌 Funcionalidades

Dois jogadores:

Jogador 1 → X

Jogador 2 → O

Validação de linha e coluna (1 a 3)

Validação de jogada (impede sobrescrever posições já preenchidas)

Impressão do tabuleiro a cada jogada

Verificação completa de vitória:

Linhas

Colunas

Diagonais

Detecta empate

▶️ Como Executar

Clone o repositório:

git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git


Entre no diretório:

cd SEU_REPOSITORIO


Compile:

javac Main.java


Execute:

java Main

🖥️ Exemplo de Execução
Jogador 1 = X
Jogador 2 = O

Jogador 1
Digite a linha: 1, 2 ou 3
1
Digite a coluna: 1, 2 ou 3
1

X _ _
_ _ _
_ _ _

📂 Código Fonte

O arquivo principal é:

Main.java


E contém toda a lógica do jogo:

Controle de turno

Entrada de dados

Validação

Impressão do tabuleiro

Verificação de vitória

🏆 Possíveis Melhorias Futuras

Criar uma classe JogoDaVelha para organizar melhor o código

Criar um loop para permitir reiniciar o jogo

Implementar um jogador bot (IA simples)

Criar interface gráfica com Swing ou JavaFX
