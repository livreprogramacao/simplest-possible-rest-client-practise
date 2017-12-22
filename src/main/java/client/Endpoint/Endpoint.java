package client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public class endpoint {

    public void access() {

  final String URI = "http://localhost:8080/hello-rest/resources/message";
		//...
        Client client = ClientBuilder.newClient();
        String result = client.target(URI).
                request().
                get(String.class);
        assertThat(result, containsString("duke"));
    }
}