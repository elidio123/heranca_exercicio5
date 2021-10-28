public class Principal{
    
    public static void main(String args[]){

        Novo n=new Novo();
        n.setEndereco("Rua das Palmeiras, Marilia SP");
        n.setPreco(20000);
        n.setPrecoAdicional(200);

        System.out.println("Endereco: "+n.getEndereco()+ "Preco: "+n.getPreco()+ "Preco adicional"+n.getPrecoAdicional());


        Velho v=new Velho();
        v.setEndereco("Avenida Hassib Mafrey, Pompeia");
        v.setPreco(20000);
        v.setDescontoPreco(1000);

        System.out.println("Endereco: "+v.getEndereco()+ "Preco: "+v.getPreco()+ "DescontoPreco: "+v.getDescontoPreco());

    }
}