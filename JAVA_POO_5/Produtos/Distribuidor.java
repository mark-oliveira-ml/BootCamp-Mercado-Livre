package JAVA_POO_5.Produtos;
import java.util.ArrayList;
import java.util.List;

public class Distribuidor 
{
    
    public static void main(String[] args) 
    {

        List<Product> listaProdutos = new ArrayList<>();        
        
        
        String bigBreak = "\n\n____________________________________________________________________________________________________________________\n\n";
        //Nome, Preco, quantidade, dia_vec (p) /tipo (np)
       
       listaProdutos.add(new Pereciveis( "Yakult", 10, 2, 1));
       listaProdutos.add(new NonPerishible("Arroz", 20, 20, "grão"));
       listaProdutos.add(new Pereciveis( "Pessego", 5, 18, 2));
       listaProdutos.add(new NonPerishible("Soja", 8.00, 10, "grão"));
       listaProdutos.add(new Pereciveis( "Alface", 1, 2, 1));
       listaProdutos.add(new NonPerishible("Sabão", 7.00, 30, "produto de limpeza"));
       listaProdutos.add(new Pereciveis( "Banana", 4, 33, 2));
       listaProdutos.add(new Pereciveis( "Vigor", 7, 5, 1));
       listaProdutos.add(new NonPerishible("Feijão", 15.00, 100, "grão"));
       listaProdutos.add(new NonPerishible("Panela", 25.00, 10, "Utensílio Cozinha"));// System.out.println

       
       double totalPer = 0.0;
       double totalNaoP = 0.0;
        
       String saidaPere = "";
       String saidaNaoPere = "";
             

        for (Product p : listaProdutos)
        {

            if (p instanceof Pereciveis)
            { //
                totalPer += p.calcule();
                saidaPere += p.toString() + "\n";
            }

            else 
            {
                totalNaoP += p.calcule();
                saidaNaoPere += p.toString() + "\n";
            }

            

        }      
            System.out.println(bigBreak + "                        PERECÍVEIS                        \n\n");
            System.out.println (saidaPere + bigBreak);


            System.out.println
            (
                "                        NÃO PERECÍVEIS                        \n\n"
                + saidaNaoPere 
                +"\n\n"
                + bigBreak
                
            );


            System.out.printf
            (
                "\tTotal Perecíveis: R$ %.2f \n\n\tTotal Não Perecíveis R$: %.2f",
                totalPer,
                totalNaoP
            );
 
            System.out.println(bigBreak);
        
        // (
        //     danone.calcule(10)
            
        // );

    }


}
