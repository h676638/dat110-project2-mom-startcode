package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		// TODO - START
				
		// create a client object and use it to
		
		// - connect to the broker - use "display" as the username
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		Client client = new Client("display", Common.BROKERHOST, Common.BROKERPORT);
		client.connect();
		client.createTopic("temperature");
		client.subscribe("temperature");
		for (int i = 0; i < COUNT; i++) {

			client.receive();
		}
		client.unsubscribe("temperature");
		client.disconnect();
		// TODO - END
		
		System.out.println("Display stopping ... ");
		

	}
}
