package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList lista1 = new LinkedList();

        lista1.add(1);
        lista1.add(4);

        System.out.println("El tamaño es:" + lista1.getSize());

        lista1.add(3);
        lista1.add(7);

        System.out.println("El tamaño es:" + lista1.getSize());

        int data = lista1.get(2);

        for(int i = 0; i< lista1.getSize(); i++){
            System.out.println("El dato en " + i + " es: " + lista1.get(i));
        }

        System.out.println("-----------------------------");

        lista1.delete(1);

        for(int i = 0; i< lista1.getSize(); i++){
            System.out.println("El dato en " + i + " es: " + lista1.get(i));
        }

        System.out.println("-----------------------------");

        lista1.delete(0);

        for(int i = 0; i< lista1.getSize(); i++){
            System.out.println("El dato en " + i + " es: " + lista1.get(i));
        }

        System.out.println("-----------------------------");

        lista1.delete(lista1.getSize() - 1);

        for(int i = 0; i< lista1.getSize(); i++){
            System.out.println("El dato en " + i + " es: " + lista1.get(i));
        }

        System.out.println("-----------------------------");

        lista1.delete(0);

        for(int i = 0; i< lista1.getSize(); i++){
            System.out.println("El dato en " + i + " es: " + lista1.get(i));
        }

        System.out.println("-----------------------------");

        System.out.println("El tamaño es:" + lista1.getSize());
    }
}

//Classes:  -> Main, LinkedList, System

//Objetos:  lista1, out

// add, getSize, main, println
// LinkedList -> constructor