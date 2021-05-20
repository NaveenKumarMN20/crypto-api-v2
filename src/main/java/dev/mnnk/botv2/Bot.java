package dev.mnnk.botv2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import dev.mnnk.botv2.request.WazirxRequest;

public class Bot {

	private static final Logger log = LogManager.getLogger(Bot.class);

	public static void main(String[] args) {

		log.info("-------->Starting Application<--------");
		WazirxRequest request = new WazirxRequest();
		request.getPrice();
		log.info("<--------Shutting Down Application-------->");
	}

}
