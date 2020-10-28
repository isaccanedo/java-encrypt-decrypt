package br.com.isaccanedo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Autor: Isac Canedo de Almeida
 */

public class Main {

    static BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter screen=new PrintWriter(System.out, true);	// Configurando variáveis de entrada / saída


    public static void main(String[] args) throws IOException {

        int choice;
        String str;

        screen.println();
        screen.println("******************** C R I P T O G R A F A R ********************");
        screen.println();
        screen.println("Por favor, digite o texto a ser criptografado / descriptografado");
        str = keyboard.readLine();

        screen.println("Escolha uma opção. Insira o número da opção");
        screen.println("1) Criptografar string				2) Descriptografar string");


        choice = new Integer(keyboard.readLine()).intValue();


        switch(choice){

            case 1:
                screen.println("A string criptografada é lida da seguinte forma ==> " + encrypt(str));

                break;
            case 2:
                screen.println("A string descriptografada é lida da seguinte forma ==> " + decrypt(str));

                break;
        }

        screen.println("Obrigado por usar este programa!");
        screen.println("Saudações: Isac Canedo!");

    }

    public static String encrypt(String str) {

        str = str.toLowerCase(); // converta string para minúsculas para evitar problemas

        int length = str.length();
        int i,count,inc;
        char[] array = new char[length];	// variáveis usadas no método
        String encrypted;



        for(i=0;i<length;i++){array[i] = str.charAt(i);} // Coloca cada caractere na string
        // em um índice de array


        for(count=0;count<array.length;count++){ // para cada item na matriz a seguinte mudança é realizada

            switch(array[count]){

                /**
                 * Esta instrução switch altera o caractere em cada índice de array. Este é o começo da criptografia
                 */

                case 'a':
                    array[count] = '7';
                    break;

                case 'b':
                    array[count] = 'k';
                    break;

                case 'c':
                    array[count] = 'r';
                    break;

                case 'd':
                    array[count] = 's';
                    break;

                case 'e':
                    array[count] = '3';
                    break;

                case 'f':
                    array[count] = 'e';
                    break;

                case 'g':
                    array[count] = 'a';
                    break;

                case 'h':
                    array[count] = 'o';
                    break;

                case 'i':
                    array[count] = '8';
                    break;

                case 'j':
                    array[count] = ',';
                    break;

                case 'k':
                    array[count] = 'b';
                    break;

                case 'l':
                    array[count] = 'x';
                    break;

                case 'm':
                    array[count] = 'c';
                    break;

                case 'n':
                    array[count] = 'h';
                    break;

                case 'o':
                    array[count] = '5';
                    break;

                case 'p':
                    array[count] = '?';
                    break;

                case 'q':
                    array[count] = 'd';
                    break;

                case 'r':
                    array[count] = '4';
                    break;

                case 's':
                    array[count] = 'f';
                    break;

                case 't':
                    array[count] = 'm';
                    break;

                case 'u':
                    array[count] = 'z';
                    break;

                case 'v':
                    array[count] = 'g';
                    break;

                case 'w':
                    array[count] = '1';
                    break;

                case 'x':
                    array[count] = 'i';
                    break;

                case 'y':
                    array[count] = '9';
                    break;

                case 'z':
                    array[count] = 'j';
                    break;

                case '1':
                    array[count] = '6';
                    break;

                case '2':
                    array[count] = 'p';
                    break;

                case '3':
                    array[count] = '.';
                    break;

                case '4':
                    array[count] = '!';
                    break;

                case '5':
                    array[count] = '0';
                    break;

                case '6':
                    array[count] = 'l';
                    break;

                case '7':
                    array[count] = 'y';
                    break;

                case '8':
                    array[count] = 'n';
                    break;

                case '9':
                    array[count] = 'u';
                    break;

                case '0':
                    array[count] = 'q';
                    break;

                case '.':
                    array[count] = 'w';
                    break;

                case '!':
                    array[count] = 'v';
                    break;

                case '?':
                    array[count] = '2';
                    break;

                case ',':
                    array[count] = 't';
                    break;

                case ' ':
                    array[count] = ' ';
                    break;

            }

        }
        encrypted = String.valueOf(array);	// Construindo um objeto String de char array []

        StringBuffer reversed = new StringBuffer(encrypted); // Criando um objeto StringBuffer a partir de String criptografada.
        reversed.reverse();	 // Invertendo a ordem no objeto StringBuffer.

        encrypted = new String(reversed); // Configurando a String criptografada do objeto StringBuffer invertida.


        return encrypted;	// Retornando String criptografada.

    } // FIM DO MÉTODO encrypt();


    public static String decrypt(String str){

        str = str.toLowerCase(); // Converta a string para minúsculas para evitar problemas

        int length = str.length();
        int i,count;						// Variável usada no método
        char[] array = new char[length];


        StringBuffer reversed = new StringBuffer(str);
        reversed.reverse();								// Reverte a string criptografada


        String encrypted = new String(reversed);

        for(i=0;i<length;i++){array[i] = encrypted.charAt(i);} // Coloca todos os caracteres da string no array


        for(count=0;count<length;count++){

            switch(array[count]){

                /**
                 * Esta instrução switch altera o caractere em cada índice de array. Este é o início da descriptografia.
                 */

                case 'a':
                    array[count] = 'g';
                    break;

                case 'b':
                    array[count] = 'k';
                    break;

                case 'c':
                    array[count] = 'm';
                    break;

                case 'd':
                    array[count] = 'q';
                    break;

                case 'e':
                    array[count] = 'f';
                    break;

                case 'f':
                    array[count] = 's';
                    break;

                case 'g':
                    array[count] = 'v';
                    break;

                case 'h':
                    array[count] = 'n';
                    break;

                case 'i':
                    array[count] = 'x';
                    break;

                case 'j':
                    array[count] = 'z';
                    break;

                case 'k':
                    array[count] = 'b';
                    break;

                case 'l':
                    array[count] = '6';
                    break;

                case 'm':
                    array[count] = 't';
                    break;

                case 'n':
                    array[count] = '8';
                    break;

                case 'o':
                    array[count] = 'h';
                    break;

                case 'p':
                    array[count] = '2';
                    break;

                case 'q':
                    array[count] = '0';
                    break;

                case 'r':
                    array[count] = 'c';
                    break;

                case 's':
                    array[count] = 'd';
                    break;

                case 't':
                    array[count] = ',';
                    break;

                case 'u':
                    array[count] = '9';
                    break;

                case 'v':
                    array[count] = '!';
                    break;

                case 'w':
                    array[count] = '.';
                    break;

                case 'x':
                    array[count] = 'l';
                    break;

                case 'y':
                    array[count] = '7';
                    break;

                case 'z':
                    array[count] = 'u';
                    break;

                case '1':
                    array[count] = 'w';
                    break;

                case '2':
                    array[count] = '?';
                    break;

                case '3':
                    array[count] = 'e';
                    break;

                case '4':
                    array[count] = 'r';
                    break;

                case '5':
                    array[count] = 'o';
                    break;

                case '6':
                    array[count] = '1';
                    break;

                case '7':
                    array[count] = 'a';
                    break;

                case '8':
                    array[count] = 'i';
                    break;

                case '9':
                    array[count] = 'y';
                    break;

                case '0':
                    array[count] = '5';
                    break;

                case '.':
                    array[count] = '3';
                    break;

                case '!':
                    array[count] = '4';
                    break;

                case '?':
                    array[count] = 'p';
                    break;

                case ',':
                    array[count] = 'j';
                    break;

                case ' ':
                    array[count] = ' ';
                    break;

            }


        }


        String decrypted = new String (String.valueOf(array)); // Construindo string a partir de array de char
        return decrypted;


    } // FIM DO MÉTODO decrypt()


} // FIM DA CLASSE Encrypto