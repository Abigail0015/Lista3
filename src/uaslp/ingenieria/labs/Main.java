package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.Iterator;
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

        Iterator it = lista1.getIterator();
        Iterator it2 = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next(); //regresar el dato y avanzar el iterador

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        while(it2.hasNext()){
            int element = it2.next(); //regresar el dato y avanzar el iterador

            System.out.println("Dato: " + element);
        }

    }
}

//Classes:  -> Main, LinkedList, System

//Objetos:  lista1, out

// add, getSize, main, println
// LinkedList -> constructor