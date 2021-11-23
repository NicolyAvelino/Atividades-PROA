class Logica{  
  // Lógica de Programação com Java

    public static void main(String args[]){  
      // 0 - 0- Escreva um arquivo e um código em Java que exiba a mensagem "Torta de Frango".
      System.out.println("Torta de Frango");  

      // 1- Escreva um arquivo e um código em Java e crie uma variável chamada "nomeDoCarro" e atribua-a um valor "Ferrari".  
      String nomeDoCarro = "Ferrari";
      System.out.println(nomeDoCarro);

      // 2- Abaixo esta a formula para calcular a área de um Losango. Reescreva essa fórmula utilizando a sintaxe do Java.
      int diagonal1 = 10;
      int diagonal2 = 7;

      int areaLosango = (diagonal1 * diagonal2) / 2;

      System.out.printf("A área do losango é: " + areaLosango + " cm²");

      // 3- Abaixo esta a formula para trabalhar com a área de um trapézio. Reescreva essa fórmula utilizando a sintaxe do Java.
      int baseMaior = 8;
      int baseMenor = 4;

      int altura = 6;

      int areaTrapezio = ((baseMaior + baseMenor) * altura) / 2;
      System.out.println(areaTrapezio);

      // 4- Essa é a fórmula de bhaskara. Reescreva-a em Java.
      int valorA = 3;
      int valorB = -15;
     
      int raizDelta = 9;
      int dividir = 2 * valorA;

      int valorFinal = valorB * (-1);
      
      int resultadoX1 = (valorFinal + raizDelta) / dividir;
      int resultadoX2 = (valorFinal - raizDelta) / dividir;

      System.out.println(resultadoX1);
      System.out.println(resultadoX2);

      //Dado o acima, a fórmula abaixo, gerará o mesmo resultado?
      // 190 min * [60 min / 1 hour] = 190/60 hr = 3.16667 hr
      int hora = 195/ 60;
      int comparar = 190 / 60;

      System.out.println(hora);
      System.out.println(comparar);
    } 
}
