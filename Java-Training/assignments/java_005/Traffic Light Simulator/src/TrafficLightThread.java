
public class TrafficLightThread implements Runnable {
	
	Thread thread;
	static boolean stopped;
	TrafficLight l1 = TrafficLight.GREEN;
	TrafficLight l2 = TrafficLight.YELLOW;
	TrafficLight l3 = TrafficLight.RED;
	
	
	
	TrafficLightThread(String name){
		thread = new Thread(this, name);
		stopped = false;
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Traffic light simulation beginning");
		
		
		while(true) {
			synchronized(this) {
				if(stopped) {
					break;
				}
			}//synchronized end
			greenLight();
			synchronized(this) {
				if(stopped) {
					break;
				}
			}//synchronized end
			yellowLight();
			synchronized(this) {
				if(stopped) {
					break;
				}
			}//synchronized end
			redLight();
			synchronized(this) {
				if(stopped) {
					
					break;
				}
			}//synchronized end
		}// while end
		
	}//end run
	
	synchronized static void myStop() {
		stopped = true;
		//notify();
	}
	
	public void greenLight() {
		try {
			System.out.println("Light is " + l1 + " - Go!");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void yellowLight() {
		try {
			System.out.println("Light is " + l2 + " - Beware!");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void redLight() {
		try {
			System.out.println("Light is " + l3 + " - Stop!");
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}//end class
