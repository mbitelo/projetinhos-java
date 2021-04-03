import java.util.Scanner;
public class Menu{
    int opcao;
    int quarto;
    int Luxo[] = new int[2];
    int Master[] = new int[4];
    int Casal[] = new int[7];
    int Standart[] = new int[11];
    Textos txt = new Textos();

   public void Voltar(){
    System.out.println(txt.Voltar()+" ao menu");
    Scanner Voltar = new Scanner(System.in);
    quarto = Voltar.nextInt();
    if (quarto == 0){
       Menu();
    }else{Voltar();}
  }
   public void Voltar1(){
    System.out.println(txt.Voltar()+" as reservas");
    Scanner Voltar = new Scanner(System.in);
    quarto = Voltar.nextInt();
    if (quarto == 0){
       Reservar();
    }else{Voltar1();}
  }
   public void Voltar2(){
    System.out.println(txt.Voltar()+" as deslocações");
    Scanner Voltar = new Scanner(System.in);
    quarto = Voltar.nextInt();
    if (quarto == 0){
       Tchau();
    }else{Voltar2();}
  }
    
    public void Menu(){
        txt.Menu();
        txt.Opcao();
        Scanner Pergunta = new Scanner(System.in);
        opcao = Pergunta.nextInt();
        switch(opcao){
        case 1:
            System.out.println("\f *** Lista de todos os quartos: ***");
            System.out.println("\n\n *** Quartos Luxo: ***");
        for (int x = 1; x < 2; x++){    
          if (Luxo[x] == 0){
              System.out.println("Quarto Luxo "+x+" livre.");
          }else{System.out.println("Quarto Luxo "+x+" ocupado.");}
        }
        
        System.out.println("\n *** Quartos Master: ***");
        for (int y = 1; y < 4; y++){    
          if (Master[y] == 0){
              System.out.println("Quarto Master "+y+" livre.");
          }else{System.out.println("Quarto Master "+y+" ocupado.");}
        }
        
        System.out.println("\n *** Quartos Casal: ***");
        for (int z = 1; z < 7; z++){    
          if (Casal[z] == 0){
              System.out.println("Quarto Casal "+z+" livre.");
          }else{System.out.println("Quarto Casal "+z+" ocupado.");}
        }
        
        System.out.println("\n *** Quartos Standart: ***");
        for (int b = 1; b < 11; b++){    
          if (Standart[b] == 0){
              System.out.println("Quarto Standart "+b+" livre.");
          }else{System.out.println("Quarto Standart"+b+" ocupado.");}
        }
            Voltar();
        break;
        case 2:
            Reservar();
        break;
        case 3:
            Tchau();
        break;
        case 9:
            Admin();
        break;
        default:
            Menu();
        break;
      }
  }
   
   public void Reservar(){
     txt.Reservar();
     txt.Opcao();
     Scanner Pergunta2 = new Scanner(System.in);
     int opcao2 = Pergunta2.nextInt();
     switch(opcao2){
         case 1:
         if (Luxo[0] == 1){
         txt.Ocupados();
         Voltar1();
           }else{
         txt.RG();
           Scanner Pergunta4 = new Scanner(System.in);
           Luxo[1] = Pergunta4.nextInt();
           Luxo[0]++;
           txt.ResOk();
           Voltar();
         
       }
         break;
         
         case 2:
         if (Master[0] == 3){
         txt.Ocupados();
         Voltar1();
           }else{
         txt.Deseja();
         Scanner Pergunta3 = new Scanner(System.in);
         quarto = Pergunta3.nextInt();
         if (quarto > 0 && quarto < 4){
           if (Master[quarto] == 0){
               txt.RG();
               Scanner Pergunta4 = new Scanner(System.in);
               int RG = Pergunta4.nextInt();
               Master[quarto] = RG;
               Master[0]++;
               txt.ResOk();
               Voltar();
           }else{
               txt.Ocupado();
               Voltar1();
           }
          }else{
           txt.NaoExiste();
           Voltar1();
         }
       }
         break;
         
         case 3:
       if (Casal[0] == 7){
         txt.Ocupados();
         Voltar1();
           }else{
         txt.Deseja();
         Scanner Pergunta3 = new Scanner(System.in);
         quarto = Pergunta3.nextInt();
         if (quarto > 0 && quarto <8){
           if (Casal[quarto] == 0){
               txt.RG();
               Scanner Pergunta4 = new Scanner(System.in);
               int RG = Pergunta4.nextInt();
               Casal[quarto] = RG;
               Casal[0]++;
               txt.ResOk();
               Voltar();
           }else{
               txt.Ocupado();
               Voltar1();
           }
          }else{
           txt.NaoExiste();
           Voltar1();
         }
       }
         break;
         
         case 4:
         if (Standart[0] == 10){
         txt.Ocupados();
         Voltar1();
           }else{
         txt.Deseja();
         Scanner Pergunta3 = new Scanner(System.in);
         quarto = Pergunta3.nextInt();
         if (quarto > 0 && quarto <11){
           if (Standart[quarto] == 0){
               txt.RG();
               Scanner Pergunta4 = new Scanner(System.in);
               int RG = Pergunta4.nextInt();
               Standart[quarto] = RG;
               Standart[0]++;
               txt.ResOk();
               Voltar();
           }else{
               txt.Ocupado();
               Voltar1();
           }
          }else{
           txt.NaoExiste();
           Voltar1();
         }
       }
            break;
         case 0:
            Menu();
            break;
         default:
            Reservar();
            break;
        } 
  }
  
   public void Tchau(){
      txt.Tchau();
      txt.RG();
      Scanner Pergunta1 = new Scanner(System.in);
      int RG = Pergunta1.nextInt();
     if (RG == 0){Menu();}
      for (int zebra = 1; zebra < 2; zebra++){
            if (Luxo[1] == RG){
                System.out.println("Deseja desalocar o quarto Luxo 1?\n1 para SIM e 2 para NÃO");
                Scanner Pergunta2 = new Scanner(System.in);
                int resp = Pergunta2.nextInt();
            if (resp == 1){
                    Luxo[1] = 0;
                    Luxo[0]--;
                    txt.DesOk();
                    Voltar();
            }else{
                Menu();
            }
        }
    }
    
      for (int zebra = 1; zebra < 4; zebra++){
            if (Master[zebra] == RG){
                System.out.println("Deseja desalocar o quarto Master "+zebra+"?\n1 para SIM e 2 para NÃO");
                Scanner Pergunta2 = new Scanner(System.in);
                int resp = Pergunta2.nextInt();
            if (resp == 1){
                    Master[zebra] = 0;
                    Master[0]--;
                    txt.DesOk();
                    Voltar();
            }else{
                Menu();
            }
        }
    }
    
      for (int zebra = 1; zebra < 7; zebra++){
            if (Casal[zebra] == RG){
                System.out.println("Deseja desalocar o quarto Casal "+zebra+"?\n1 para SIM e 2 para NÃO");
                Scanner Pergunta2 = new Scanner(System.in);
                int resp = Pergunta2.nextInt();
            if (resp == 1){
                    Casal[zebra] = 0;
                    Casal[0]--;
                    txt.DesOk();
                    Voltar();
            }else{
                Menu();
            }
        }
    }
    
      for (int zebra = 1; zebra < 11; zebra++){
            if (RG == Standart[zebra]){
                System.out.println("Deseja desalocar o quarto Standart "+zebra+"?\n1 para SIM e 2 para NÃO");
                Scanner Pergunta2 = new Scanner(System.in);
                int resp = Pergunta2.nextInt();
            if (resp == 1){
                    Standart[zebra] = 0;
                    Standart[0]--;
                    txt.DesOk();
                    Voltar();
            }else{
                Menu();
            }
        }
        if (zebra == 10){Voltar2();}
    }
  }
  public void Admin(){
    System.out.print("Senha: ");
    Scanner Voltar = new Scanner(System.in);
    int senha = Voltar.nextInt();
    if (senha == 0){Voltar();}
    if (senha == 123456){
    for (int x = 1; x < 2; x++){    
          if (Luxo[x] == 0){
              System.out.println("\fQuarto Luxo "+x+" livre.");
          }else{System.out.println("\fQuarto Luxo "+x+" ocupado por "+Luxo[x]);}
        }
    for (int y = 1; y < 4; y++){    
        if (Master[y] == 0){
             System.out.println("Quarto Master "+y+" livre.");
          }else{System.out.println("Quarto Master "+y+" ocupado por "+Master[y]);}
    }
    for (int z = 1; z < 7; z++){    
         if (Casal[z] == 0){
             System.out.println("Quarto Casal "+z+" livre.");
          }else{System.out.println("Quarto Casal "+z+" ocupado por "+Casal[z]);}
    }
    for (int b = 1; b < 11; b++){    
         if (Standart[b] == 0){
             System.out.println("Quarto Standart "+b+" livre.");
          }else{System.out.println("Quarto Standart"+b+" ocupado por "+Standart[b]);}
    }
    Voltar();
  }else{Admin();}
 }
}

