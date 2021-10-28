public class Principal{
    
    public static void main(String args[]){

        Novo n=new Novo();
        n.setEndereco("Rua das Palmeiras, Marilia SP");
        n.setPreco(20000);
        n.setPrecoAdicional(0.2*n.getPreco());

        System.out.println("Endereco: "+n.getEndereco()+ "Preco: "+n.getPreco()+ "Preco adicional"+n.getPrecoAdicional());

        System.out.println("Imovel Velho");
        Velho v=new Velho();
        v.setEndereco("Avenida Hassib Mafrey, Pompeia");
        v.setPreco(20000);
        v.setDescontoPreco(0.1*v.getPreco());

        System.out.println("Preco Imovel Velho:"+(v.getPreco()-v.getDescontoPreco()));

        System.out.println("Endereco: "+v.getEndereco()+ "Preco: "+v.getPreco()+ "DescontoPreco: "+v.getDescontoPreco());
        System.out.println(n.getPreco()+n.getPrecoAdicional());
    }
}