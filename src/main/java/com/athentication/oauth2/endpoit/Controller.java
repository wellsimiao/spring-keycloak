package com.athentication.oauth2.endpoit;

import java.util.Collections;
import java.util.List;

import com.athentication.oauth2.service.KeycloakClient;

public class Controller {
	
	private KeycloakClient keycloakRemoteService;
	
	public void controller(KeycloakClient keycloakReomteService) {
		this.keycloakRemoteService = keycloakRemoteService;
	}
	
	public List<String> home(){
		return Collections.singletonList("Home page");
		
	}

}
