package homework17;

public class StockQuoteObservable extends Observable{
	float quote;
		public void  changeQuote(String t, float q) {
			quote = q;
			setChanged();
			this.notifyObservers(new StockEvent(t,q));
		}
}
