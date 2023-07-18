
public class Principal {
    
    public static void main(String[] args){

        Software sublime = new Software("Sublime", 100);
        Software ubuntu = new Software("Ubuntu", 2000);
        Software chrome = new Software("Chrome", 2500);
        Software eclipse = new Software("Eclipse", 500);

        System.out.println("Software: " + sublime.tamanho);

        Container c1 = new Container();
        c1.addSoftware(ubuntu);
        c1.run();
        c1.addSoftware(sublime);

        Container c2 = new Container();
        c2.addSoftware(eclipse);
        c2.addSoftware(chrome);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("Tamanho de c1: " + c1.tamanho_total() + "\n");
        System.out.println("Tamanho de c2: " + c2.tamanho_total() + "\n");

        Compose containers = new Compose();
        containers.addContainer(c1);
        containers.addContainer(c2);

        
        containers.run();

        System.out.println("Tamanho total: " + containers.getTamanhoReal() + "\n");

        containers.stop();

        System.out.println("Tamanho total: " + containers.getTamanhoReal() + "\n");
        
    }

}
