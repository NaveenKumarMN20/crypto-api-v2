package dev.mnnk.botv2.request;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dev.mnnk.botv2.response.Dogeinr;
import dev.mnnk.botv2.response.Input;

public class WazirxRequest {

	private static final Logger log = LogManager.getLogger(WazirxRequest.class);

	public void getPrice() {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		log.info("Sending Request to wazirx api");
		String wazrixURL = "https://api.wazirx.com/api/v2/tickers";
		HttpGet httpget = new HttpGet(wazrixURL);
		HttpResponse httpresponse = null;
		ObjectMapper objectMapper = new ObjectMapper();
		Input wazrixResponses = null;
		try {
			httpresponse = httpclient.execute(httpget);
			wazrixResponses = objectMapper.readValue(httpresponse.getEntity().getContent(), Input.class);
		} catch (IOException e) {
			e.printStackTrace();
		}

		Dogeinr dogeinr = wazrixResponses.getDogeinr();
		String json = "";
		try {
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(dogeinr);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		System.out.println(json);
	}
}
