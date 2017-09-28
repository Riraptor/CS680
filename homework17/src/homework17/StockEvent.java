package homework17;

public class StockEvent {
	String ticker;
	float quote;
	public StockEvent(String t, float q) {
		ticker = t;
		quote = q;
	}
	public float getQuote() {
		return quote;
		
	}
	public String getTicker() {
		return ticker;
		
	}
}
