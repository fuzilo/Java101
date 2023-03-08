/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
pulic class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Instanciar o objeto da classe Usuário*/
        
        Usuario usu=new Usuario();
        
        /*Guardando dados nos atributos da classe Usuario, Nome do Objeto usu*/
        usu.setNome("NomeQUalquer");
        usu.setEmail("asdaiodj@asdi.com");
        usu.setLogin("asduha");
        usu.setSenha("12345");
        /*Chamando método mensagem da classe Usuário*/
        usu.Mensagem();
        
                
    }
    
}
