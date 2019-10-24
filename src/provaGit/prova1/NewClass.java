/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaGit.prova1;

/**
 *
 * @author luigi
 */
public class NewClass {
    private String nuova;

    public NewClass(String nuova) {
        this.nuova = nuova;
    }

    public String getNuova() {
        return nuova;
    }

    public void setNuova(String nuova) {
        this.nuova = nuova;
    }

    @Override
    public String toString() {
        return nuova;
    }
     
    
    
}
