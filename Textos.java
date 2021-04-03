public class Textos
{
     public String Voltar(){
        return "\n\nDigite 0 para voltar";
    }
    public void Menu(){
        System.out.println("\f********************************************\n*             CADASTRO - HOTEL             *\n*                                          *\n*                                          *\n*      1 - LISTAR QUARTOS DISPONIVEIS      *\n*      2 - RESERVAR QUARTO                 *\n*      3 - DESALOCAR QUARTO                *\n*                                          *\n*                                          *\n********************************************\n");
    }
    public void Opcao(){
        System.out.println("Digite a opção desejada: ");
    }
    public void Ocupados(){
        System.out.println("\nTodos os quartos dessa categoria ocupados");
    }
    public void Ocupado(){
        System.out.println("Quarto ocupado!");
    }
    public void NaoExiste(){
        System.out.println("Este quarto não existe");
    }
    public void RG(){
        System.out.println("Qual seu RG?");
    }
    public void ResOk(){
        System.out.println("Reserva efetuada com sucesso!");
    }
    public void DesOk(){
        System.out.println("Quarto desocupado com sucesso! Até a próxima.");
    }
    public void Tchau(){
        System.out.println("\f********************************************\n*          DESALOCAÇÃO de QUARTO           *\n*                                          *\n*                                          *\n*                                          *\n*      0 - VOLTA AO MENU INCIAL            *\n*                                          *\n*                                          *\n*                                          *\n********************************************\n\n");    
    }
    public void Reservar(){
        System.out.println("\f********************************************\n*             RESERVA de QUARTO            *\n*                                          *\n*                                          *\n*      1 - QUARTO LUXO                     *\n*      2 - QUARTO MASTER                   *\n*      3 - QUARTO CASAL                    *\n*      4 - QUARTO STANDART                 *\n*                                          *\n*      0 - VOLTA AO MENU INCIAL            *\n*                                          *\n********************************************\n\n");    
    }
    public void Deseja(){
        System.out.println("Qual quarto deseja?");
    }
}
