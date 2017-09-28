package homework17;

public class ThreeDObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		((StockEvent) arg).getTicker();
		((StockEvent) arg).getQuote();
		System.out.println("3D OBSERVER : "+ ((StockEvent) arg).getTicker() + " : " + ((StockEvent) arg).getQuote() );
	}

}
