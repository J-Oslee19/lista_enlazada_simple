package umg.edu.gt.listasenlazadas.retos;

import umg.edu.gt.listasenlazadas.simple.SinglyLinkedList;

public final class LinkedListChallenges {

    private LinkedListChallenges() {
    }

    public static void run() {
        System.out.println("=== RETOS DE IMPLEMENTACION ===");
        
        challenge1CountOccurrences();
        System.out.println();
        
        challenge2Clean(); 
        System.out.println();
        
        challenge3Reverse(); 
        System.out.println();
        
        challenge4RemoveDuplicates();
        System.out.println();
    }

    private static void challenge1CountOccurrences() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("LOGIN");
        eventos.addLast("CLICK");
        eventos.addLast("LOGIN");
        eventos.addLast("SCROLL");
        eventos.addLast("LOGIN");

        System.out.println("Reto 1 - Analitica de eventos (lista simple)");
        System.out.println("Eventos: " + eventos);

        try {
            int totalLogins = eventos.countOccurrences("LOGIN");
            System.out.println("Resultado esperado para LOGIN: 3");
            System.out.println("Resultado obtenido: " + totalLogins);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void challenge2Clean() {
        SinglyLinkedList<String> eventos = new SinglyLinkedList<>();
        eventos.addLast("A");
        eventos.addLast("B");
        eventos.addLast("C");

        System.out.println("Reto 2 - Limpiar lista");
        System.out.println("Antes: " + eventos + " size: " + eventos.size());

        try {
            int eliminados = eventos.clean();
            System.out.println("Nodos eliminados: " + eliminados);
            System.out.println("Después: " + eventos + " size: " + eventos.size());
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void challenge3Reverse() {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<>();
        lista.addLast(2);
        lista.addLast(4);
        lista.addLast(5);
        lista.addLast(6);

        System.out.println("Reto 3 - Invertir lista");
        System.out.println("Antes: " + lista);

        try {
            lista.reverseInPlace();
            System.out.println("Después: " + lista);
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    private static void challenge4RemoveDuplicates() {
        SinglyLinkedList<String> lista = new SinglyLinkedList<>();
        lista.addLast("A");
        lista.addLast("B");
        lista.addLast("A");
        lista.addLast("C");
        lista.addLast("B");
        lista.addLast("D");

        System.out.println("Reto 4 - Eliminar duplicados");
        System.out.println("Antes: " + lista + " size: " + lista.size());

        try {
            int eliminados = lista.removeDuplicates();
            System.out.println("Nodos eliminados: " + eliminados);
            System.out.println("Despues: " + lista + " size: " + lista.size());
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}