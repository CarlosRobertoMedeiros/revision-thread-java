package br.com.roberto.revisionthread.a.createthread;

public class Exemplo1CriacaoDeThread {
	
	public static void main(String[] args) {
		
		//Thread Atual Principal Seria a Thread que vem do main
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
		
		MeuRunnable meuRunnable = new MeuRunnable();
		
		//Nova Thread
		Thread t0 = new Thread(meuRunnable);
		//t1.run();//Apenas executando na mesma thread
		//t0.start(); //Aqui a JVM vai chamar o run do meu Runnable assim que possível em uma nova thread
		
		//Criando Nova Thread com Lambda
		Thread t1 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
		
		//t2.start(); //N�o funciona lan�a exce��o ao executar varia vezes a mesma thread
		
		//V�rias Threads
		Thread t2 = new Thread(meuRunnable);
		//Ao criar v�rias threads quem vai gerenciar a thread � o processador
		//as vezes uma thread pode passar a frente da outra 
		t0.start(); //Executando em uma nova thread
		t1.start();
		t2.start();
	}

}

class MeuRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}
