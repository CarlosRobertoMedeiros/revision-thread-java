package br.com.roberto.revisionthread.a;

//Continuar daqui https://www.youtube.com/watch?v=MT3YNqDOTFQ&list=PLuYctAHjg89YNXAXhgUt6ogMyPphlTVQG&index=3
//minuto 14:30
public class Exemplo1CriacaoDeThread {
	
	public static void main(String[] args) {
		
		//Thread Atual Principal
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		//Nova Thread
		Thread t1 = new Thread(new MeuRunnable());
		//t1.run();//Apenas executando na mesma thread
		t1.start(); //Aqui a JVM vai chamar o run do meu Runnable assim que possível em uma nova thread
		
		//Criando Nova Thread com Lambda
		Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()+ " Enviando Mensagem"));
		t2.start();

	}

}

class MeuRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
