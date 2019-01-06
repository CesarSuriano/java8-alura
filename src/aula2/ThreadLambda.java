package aula2;

public class ThreadLambda {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Executando numa thread");
			}
		}).start();
		
		new Thread(() -> System.out.println("Executando thread com lambda")).start();
	}
}
