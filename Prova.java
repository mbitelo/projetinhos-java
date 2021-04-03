public class Prova
{
    String G[] = new String[5];
    String R[] = new String[5];
    int C;
    int E;

    public void Verificar(){
    G[0] = "A";
    G[1] = "A";
    G[2] = "C";
    G[3] = "E";
    G[4] = "D";
    
    
    R[0] = "E";
    R[1] = "A";
    R[2] = "E";
    R[3] = "E";
    R[4] = "C";
        for (int x = 0; x < 5; x++){
            if (G[x].equals(R[x])){
                C++;
            }else{
                E++;
            }
        }
        System.out.println("Acertou: "+C+", errou: "+E);
    }
}
