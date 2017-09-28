package homework17;

public class PiechartObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		 ((StockEvent) arg).getTicker();
		((StockEvent) arg).getQuote();
		System.out.println("PIE CHART OBSERVER :"+ ((StockEvent) arg).getTicker() + " : " + ((StockEvent) arg).getQuote() );
	}

}
