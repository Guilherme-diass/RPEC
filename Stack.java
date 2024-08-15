public class Stack {

    public static void main(String[] args){

        java.util.Stack<String> carros = new java.util.Stack<>();

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
