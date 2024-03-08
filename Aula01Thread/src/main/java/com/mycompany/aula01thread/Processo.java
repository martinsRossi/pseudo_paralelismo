package com.mycompany.aula01thread;

/* //Exemplo 1 - Thread
public class Processo extends Thread{
    String nome;
    int numeroInteracoes;
    public Processo (String n, int i){  //Construtor 
        nome = n;
        numeroInteracoes = i;
    }
    public void run(){ // Escritor
        for (int i=0; i <= numeroInteracoes; i++)
            System.out.println("Processo " + nome + ": " + i);
    }
        
}*/


/* //Exemplo 2 - Thread com escalonamento
public class Processo extends Thread{
    String nome;
    int numeroInteracoes;
    public Processo (String n, int i){  //Construtor 
        nome = n;
        numeroInteracoes = i;
    }
    public void run(){ // Escritor
        for (int i=0; i <= numeroInteracoes; i++){
            System.out.println("Processo " + nome + ": " + i);
            Thread.yield();
        }
    }
        
}*/

/*
 //Exemplo 3 - Thread com priorização
public class Processo extends Thread{
    String nome;
    int numeroInteracoes;
    String pri;
    public Processo (String n, int i, String p, int prioridade ){  //Construtor 
        nome = n;
        numeroInteracoes = i;
        pri = p;
        setPriority(prioridade);
    }
    public void run(){ // Escritor
        for (int i=0; i <= numeroInteracoes; i++){
            System.out.println("Processo " + nome + ", " + pri + ": " + i);
            Thread.yield();
        }
    }
}
*/
/*
 //Exemplo 4 - Thread com Sleep
public class Processo extends Thread{
    String nome;
    int numeroInteracoes;
    String pri;
    public Processo (String n, int i, String p, int prioridade ){  //Construtor 
        nome = n;
        numeroInteracoes = i;
        pri = p;
        setPriority(prioridade);
    }
    
    public void run(){ // Escritor
        for (int i=0; i <= numeroInteracoes; i++){
            System.out.println("Processo " + nome + ", " + pri + ": " + i);
            try{
                Thread.sleep(i * 100);
            } catch(InterruptedException ex){};
            Thread.yield();
        }
    }
}
*/

/*
 //Exemplo 5 - Thread Runnable
public class Processo extends Thread{
    String nome;
    int numeroInteracoes;
    String pri;
    public Processo (String n, int i, String p, int prioridade ){  //Construtor 
        nome = n;
        numeroInteracoes = i;
        pri = p;
        setPriority(prioridade);
    }
    
    public void run(){ // Escritor
        for (int i=0; i <= numeroInteracoes; i++){
            System.out.println("Processo " + nome + ", " + pri + ": " + i);
            try{
                Thread.sleep(i * 100);
            } catch(InterruptedException ex){};
            Thread.yield();
        }
    }
}
*/

// //Exemplo 5 - Thread Runnable
//public class Processo extends Thread{
//    String nome;
//    int numeroInteracoes;
//    String pri;
//    public Processo (String n, int i, String p, int prioridade ){  //Construtor 
//        nome = n;
//        numeroInteracoes = i;
//        pri = p;
//        setPriority(prioridade);
//    }
//    
//    public void run(){ // Escritor
//        for (int i=0; i <= numeroInteracoes; i++){
//            System.out.println("Processo " + nome + ", " + pri + ": " + i);
//            try{
//                Thread.sleep(i * 100);
//            } catch(InterruptedException ex){};
//            Thread.yield();
//        }
//    }
//}



