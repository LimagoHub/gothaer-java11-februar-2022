package de.gothaer;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class Transformer<T,R> extends SubmissionPublisher<R> implements Processor<T, R> {

	private Subscription subscription;
	private final Function<T, R> function;
	
	

	public Transformer(Function<T, R> function) {
		this.function = function;
	}

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(T item) {
		try {
			var ergebnis = function.apply(item);
			submit(ergebnis);
		} catch (Exception e) {
			System.out.println("Element konnte nicht konvertiert werden");
		}
		subscription.request(1);
	}

	@Override
	public void onError(Throwable throwable) {
		throwable.printStackTrace();
		this.closeExceptionally(throwable);
	}

	@Override
	public void onComplete() {
		close();
		
	}

}
