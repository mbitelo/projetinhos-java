import java.util.*;
/**
 * Escreva a descrição da classe MainCarro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class MainCarro
{
    public void Main(){
    
        System.out.print("\n");
        InserirCarro();
    ListarCarro();
}
    public ArrayList<Carro> ListCarros = new ArrayList<Carro>();
    public void InserirCarro(){
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        
        c1.Nome = "Gol";
        c1.Marca = "VW";
        c1.Modelo = "G5";
        c1.Ano = 2015;
        
        c2.Nome = "Voyage";
        c2.Marca = "VW";
        c2.Modelo = "G6";
        c2.Ano = 2014;
        
        c3.Nome = "Saveiro";
        c3.Marca = "VW";
        c3.Modelo = "Cross";
        c3.Ano = 2016;
        ListCarros.add(c1);
        ListCarros.add(c2);
        ListCarros.add(c3);
}
public void ListarCarro(){
    for(Carro c : ListCarros){
        System.out.println(c.Nome);
        System.out.println(c.Marca);
        System.out.println(c.Modelo);
        System.out.println(c.Ano);
}
}
}
