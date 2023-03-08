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
    /*Declaração de atributos*/
    private String nome;
    private String email;
    private String login;
    private String senha;
    private int idade;
/*Construtor de atributos*/

    public Usuario() {
        this("","","","",0);
    }

    public Usuario(String nome, String email, String login, String senha, int idade) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.idade = idade;
    }

/*Encapsulamento dos atributos*/

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

   
    /*Método da classe usuario*/
    public void Mensagem(){
        System.out.println("Os dados do usuario sao: Nome: "+this.getNome()+
                "\n Email "+this.getEmail()+ "\n Login "+ this.getLogin()+
                "\n Senha "+this.getSenha()+ "\n Idade "+ this.getIdade());
    }

    void getLogin(String asduha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void getSenha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
