
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
public class Cliente {
    private Scanner leia=new Scanner(System.in);
    //Declaração de atributos
    private String nome;
    private String end;
    private String rg;

    public Cliente() {
        this ("","","");
    }

    public Cliente(String nome, String end, String rg) {
        this.nome = nome;
        this.end = end;
        this.rg = rg;
    }

    public Scanner getLeia() {
        return leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
   
    
}
