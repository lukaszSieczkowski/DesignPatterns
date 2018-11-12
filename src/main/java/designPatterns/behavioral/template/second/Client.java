package designPatterns.behavioral.template.second;

public class Client {

    public static void main(String[]args){
        Pizza margherita = new Margherita();
        margherita.prepare();
        Pizza sicilian = new Sicilian();
        sicilian.prepare();
    }
}
