/*
 * Para isso, crie a classe Jogo com os atributos jpgador1 e jpgadpr2 (ambos Strings que correspondem aos nomes dos jogadores).
 * Implemente os métodos de instância básicos. 
 * Implemente também um método que receba por parâmetro a opção de jogada do jogador1 e do jpgador2 (0 para Pedra, 1 para Papel, 2 para Tesoura). 
 * O método deverá retornar o nome do jogador que venceu a rodada.
 */
package PedraPapelTesoura;
import java.util.Scanner;
/**
 *
 * @author caroline rosa
 */
public final class Jogo
{
    private String jpgador1;
    private String jpgador2;
    
    public Jogo()
    {
        Scanner in = new Scanner(System.in);
        int jogada1=0, jogada2=0;
        nomeJogadores();
        System.out.print("[Pedra [0], Papel [1], ou Tesoura [2]!!! \n Jogada do primeiro jogador: ");
        jogada1 = in.nextInt();
        if(jogada1<0 || jogada1>2)
        {
            do
            {
                System.out.print("Jogada inválida, tente de novo!");
                jogada1 = in.nextInt();
            }while(jogada1<0 || jogada1>2);
        }
        System.out.print("Jogada do segundo jogador: ");
        if(jogada2<0 || jogada2>2)
        {
            do
            {
                System.out.print("Jogada inválida, tente de novo!");
                jogada2 = in.nextInt();
            }while(jogada2<0 || jogada2>2);
        }
        jogada(jogada1, jogada2);
    }
    
    public void nomeJogadores()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe nome do primeiro jogador: ");
        jpgador1 = in.next();
        System.out.print("Informe nome do segundo jogador: ");
        jpgador2 = in.next();
    }
    
    public void jogada(int jogada1, int jogada2)
    {
         /* As regras do jogo são as seguintes:
          * o  Tesoura corta papel
          * o  Papel cobre pedra
          * o  Pedra quebra tesoura 
          */
        
    }
    
    
    

}
