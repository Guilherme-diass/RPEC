import java.util.Stack;

public class Main{

    public static void main(String[] args){

        Stack<String> carros = new Stack<>();

        carros.push("Q3");
        carros.push("Golf");
        carros.push("Polo");
        carros.push("Palio");
        carros.push("City");
        carros.push("March");

        System.out.println("primeiro da pilha " + carros.peek());
        System.out.println("primeiro da pilha retirando " + carros.pop());
        System.out.println(carros);
        carros.clear();
        System.out.println(carros.empty()?"Pilha vazia":"pilha com elementos");
    }
}
