public class Imovel{

    private String endereco;
    private double preco;

    //gerar metodos set e get
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public double getPreco(){
        return this.preco;
    }
}