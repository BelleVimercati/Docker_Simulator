/*
 * To do:
 * - trocar status para boolean
 */

import java.util.*;

public class Container {
    private List<Software> container;
    private boolean status;

    public Container(){
        container = new ArrayList<Software>();
        this.status = false; //um contêiner, quando criado, possui status inicial inativo
    }

    public boolean getStatus() {
        return this.status;
    }

    public String toString(){
        String result = "Este container possui " + container.size() + " Softwares" + "\n";

        for(Software s: container)
            result = result + s.toString() + "\n"; 
        
        return result;
    }
    
    public void addSoftware(Software s){ //definindo o método de addSoftware
        if(this.status == false){
           container.add(s); 
        }
        else System.out.println("\nERROR: so e possivel adicionar Softwares quando o container nao esta em execucao\n");
    }

    public void run(){
        this.status = true;
    }

    public void stop(){
        this.status = false;
    }

    public int tamanho_total(){
        int tam = 0;
        for(Software s : container)
            tam = tam + s.tamanho;
        
        return tam;
    }
}
