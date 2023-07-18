import java.util.*;
/*
 * To do:
 * - criar um toString()
 * - criar um remove()
 */

public class Compose {
    List<Container> compose;

    public Compose(){
        compose = new ArrayList<Container>();
    }

    public void addContainer(Container c){
        compose.add(c);
    }

    public int getTamanhoReal(){
        int tamanho = 0;
        for(Container c : compose){
            if(c.getStatus() == true)
                tamanho = tamanho + c.tamanho_total();
        }

        return tamanho;
    }

    public void run(){
        for(Container c : compose){
            c.run();
        }
    }

    public void stop(){
        for(Container c : compose){
            c.stop();
        }
    }
}
