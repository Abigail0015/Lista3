package uaslp.ingenieria.labs;

import uaslp.ingenieria.labs.list.Iterator;
import uaslp.ingenieria.labs.list.LinkedList;
import uaslp.ingenieria.labs.list.ReverseIterator;

public class Main {

    public static void main(String[] args) {

        int after = LinkedList.AFTER;
        int before = LinkedList.BEFORE;

        LinkedList lista1 = new LinkedList();
        LinkedList lista2 = new LinkedList();

        lista1.add(1);
        lista1.add(4);

        System.out.println("El tamaño es:" + lista1.getSize());

        lista1.add(3);
        lista1.add(7);


        System.out.println("El tamaño es:" + lista1.getSize());

        Iterator it = lista1.getIterator();
        //ReverseIterator it2 = lista1.getReverseIterator();

        while(it.hasNext()){
            Iterator backupIt = new Iterator(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, LinkedList.BEFORE, backupIt);
            }

            if(element == 7){
                lista1.insert(15, LinkedList.AFTER, backupIt);
            }

            System.out.println("Dato: " + element);
        }

        System.out.println("--------------------- Completo");

        it = lista1.getIterator();

        while(it.hasNext()){
            int element = it.next(); //regresar el dato y avanzar el iterador

            System.out.println("Dato: " + element);
        }

    }
}

// final static

//Classes:  -> Main, LinkedList, System

//Objetos:  lista1, out

// add, getSize, main, println
// LinkedList -> constructor