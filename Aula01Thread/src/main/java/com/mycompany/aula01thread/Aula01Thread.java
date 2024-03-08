package com.mycompany.aula01thread;

public class Aula01Thread {

    public static void main(String[] args) {
        Processo proc1 = new Processo ("Pupilo", 50, "MIN", Thread.MIN_PRIORITY);
        Processo proc2 = new Processo ("PC", 50, "MAX", Thread.MAX_PRIORITY);
        Processo proc3 = new Processo ("DENSORISMO", 50, "NOR", Thread.NORM_PRIORITY);
        proc1.start();
        proc2.start();
        proc3.start();
    }
}
/*
//Exemplos 1 e 2
public class Aula01Thread {

    public static void main(String[] args) {
        Processo proc1 = new Processo ("Pupilo", 50);
        Processo proc2 = new Processo ("PC", 50);
        proc1.start();
        proc2.start();
    }
}
*/

