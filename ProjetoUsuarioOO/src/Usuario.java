
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
public class Usuario {
    // declaração de atributos
    private String nome;
    private String email;
    private String login;
    private String senha;

        //criando construtor - inicialização de valores dos atributos
    public Usuario() {
        this("","","","");
    }

    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    
    // CRIAR MÉTODO MENSAGEM
    
    public void Mensagem(){
        System.out.println("Os dados do Usuario são \n"+
                "Nome: "+ getNome() + 
                "\nEmail: "+ getEmail() + 
                "\nLogin: "+ getLogin() +
                "\nSenha: "+ getSenha());
                                
    }
    //CRIAR METODO CADASTRAR USUARIO
    
    public void CadastrarUsuario(){
        
            Scanner leia=new Scanner(System.in);
        
        System.out.println("Digite o nome do Usuario \n");
            setNome (leia.next());
        System.out.println("Digite o Email do Usuario \n");
            setEmail (leia.next());
        System.out.println("Digite o Login do Usuario \n");
            setLogin (leia.next());            
         System.out.println("Digite o Senha do Usuario \n");
            setSenha (leia.next());           
                
        
            
    }
    
}
