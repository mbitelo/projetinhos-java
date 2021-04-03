public class calculadora
{
   int A;
   int B;
   int xx;
   public void Calculadora(){
       System.out.println("1 - para somar\n2 - para diminuir\n3 - para multiplicar\n4 - para duvidir\n\nDigite a operação");
       System.out.println("Digite a opção da operação");
       Scanner 12 = new Scanner(System.in);
       xx = 12.nextInt();
       System.out.println("Digite o primeiro numero da operacao");
       Scanner 23 = new Scanner(System.in);
       A = 23.nextInt();
       System.out.println("Digite o primeiro numero da operacao");
       Scanner 34 = new Scanner(System.in);
       B = 34.nextInt();
       switch(xx){
           case 1:
       System.out.println(A+B);
       break;
}
