package de.gothaer;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) throws Exception{
		var liste = List.of("1","2","drei","4");

		
		
		var endSubscriber = new EndSubscriber<Integer>();
		var transformer = new Transformer<String, Integer>(String::length);
		transformer.subscribe(endSubscriber);
				
		try(var publisher = new SubmissionPublisher<String>()){
			publisher.subscribe(transformer);
			liste.forEach(publisher::submit);
		}
		
		
		Thread.sleep(2000);
		System.out.println("Fertig");
	}

}
