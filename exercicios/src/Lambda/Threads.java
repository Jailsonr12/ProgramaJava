package Lambda;

public class Threads {

	public static void main(String[] args) {

		Runnable Trabalho1 = new Trabalho1();
		Runnable Trabalho2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #2");
					try {
					Thread.sleep(1000);
					} catch(Exception e) {
						
					}
				}

			}

		};
		
		Runnable Trabalho3 = Threads :: trabalho3;
		

		Thread t1 = new Thread(Trabalho1);
		Thread t2 = new Thread(Trabalho2);
		Thread t3 = new Thread(Trabalho3);

		t1.start();
		t2.start();
		t3.start();

	}
	
	static void trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #3");
			try {
			Thread.sleep(1000);
			} catch(Exception e) {
				
			}
		}

		
	}
}
