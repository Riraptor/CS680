package homework17;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class AllObserversTest {

	@Test
	public void ChangeQuoteOnceTest() {
		Random rando = new Random();
		PiechartObserver pie = new PiechartObserver();
		TableObserver table = new TableObserver();
		ThreeDObserver three = new ThreeDObserver();
		StockQuoteObservable stock = new StockQuoteObservable();

		stock.addObserver(pie);
		stock.addObserver(table);
		stock.addObserver(three);
		float quote = 0;
		quote = rando.nextFloat() * 10000;
		stock.changeQuote( "MY company Stocks", quote);
		
	}
	
	@Test
	public void ChangeQuoteFiveTimesEverySecTest() {
		Random rando = new Random();
		PiechartObserver pie = new PiechartObserver();
		TableObserver table = new TableObserver();
		ThreeDObserver three = new ThreeDObserver();
		StockQuoteObservable stock = new StockQuoteObservable();

		stock.addObserver(pie);
		stock.addObserver(table);
		stock.addObserver(three);
		float quote = 0;
		for ( int i = 0; i < 5; i ++) {
		quote = rando.nextFloat() * 10000;
		stock.changeQuote( "MY company Stocks", quote);
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}   
        
		}
	}
	
}

