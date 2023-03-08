
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Contatos {
    // Declaração de atributos
    private String nome;
    private String telefone;
    private String endereco;
    private String cidade;

    public Contatos() {
        
        this("","","","");
        
    }

    public Contatos(String nome, String telefone, String endereco, String cidade) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cidade = cidade;
    }

      
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

     // criar método cadastrarDados
    
    public void cadastrarDados(){
    
        Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite o Nome: \n");
        setNome (leia.next());
        System.out.println("Digite o Telefone: \n");
        setTelefone (leia.next());        
        System.out.println("Digite o Endereço: \n");
        setEndereco (leia.next());        
        System.out.println("Digite o Cidade: \n");
        setCidade (leia.next());
    }
    
        public void Listar(){
        System.out.println("Os dados do Usuario são \n"+
                "Nome: "+ getNome() + 
                "\nTelefone: "+ getTelefone() + 
                "\nEndereço: "+ getEndereco() +
                "\nCidade: "+ getCidade());
                                
    }
    
}