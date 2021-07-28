package br.com.roberto.revisionthread.b.syncronized;

public class Example1Syncronized {
	
	/**
	 * https://www.youtube.com/watch?v=HQh0Omi7k7s&list=PLuYctAHjg89YNXAXhgUt6ogMyPphlTVQG&index=4
	 * Continuar a partir dos 10 minutos
	 * @param args
	 */
	static int i = -1;
	
	public static void main(String[] args) {
		
		MeuRunnable runnable = new MeuRunnable();
		
		Thread t0 = new Thread(runnable); 
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		Thread t4 = new Thread(runnable);
		
		t0.start();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}
	
	public static class MeuRunnable implements Runnable{

		@Override
		public void run() {
			//Sempre que o mesmo recurso for compartilhado entre threads, você não vai conseguir garantir
			//A execução
			i++;//O mesmo recurso sendo compartilhado
			String ThreadName = Thread.currentThread().getName();
			System.out.println(ThreadName+" : " + i);
			
		}
	}
	

}
