import java.util.LinkedList;

public class Queue{

    public static void main(String[] args){

        java.util.Queue<String> carros = new LinkedList<>();

        carros.add("Q3");
        carros.add("P1");
        carros.add("Porshe");
        carros.add("Astra");
        carros.add("A3");

        System.out.println("Topo da fila: " + carros.peek());
        System.out.println("Topo da fila retirando: " + carros.poll());
        System.out.println(carros);
        System.out.println(carros.isEmpty()?"Fila Vazia":"Fila com elementos");



    }
}
