import java.util.ArrayList;

public class Cofrinho{
    private ArrayList<String> moedas;

    public Cofrinho(){
        // TODO 
    }

    private int valor(String moeda){
        switch(moeda){
            case "Real":
            return 100;
            case "50":
            return 50;
            case "25":
            return 25;
            case "10":
            return 10;
            case "5":
            return 5;
            default:
            return -1;
        }
    }

    public boolean insereMoeda(String moeda){
       // TODO 
       return false;
    }

    public int getQtdadeMoedas(){
        // TODO 
        return 0;
    }

    public int getQtdadeMoedasTipo(String moeda){
        // TODO
        return 0;
    }

    public double getValorTotal(){
        // TODO

        return 0.0;
    }

    public String retiraMoeda(){
        // TODO 
        return null;
    }
}