package homework17;

public class TableObserver implements Observer{

	@Override
	public void update(Observable o, Object arg) {
			((StockEvent) arg).getTicker();
			((StockEvent) arg).getQuote();
			System.out.println("TABLE OBSERVER : "+ ((StockEvent) arg).getTicker() + " : " + ((StockEvent) arg).getQuote() );
	}

}
