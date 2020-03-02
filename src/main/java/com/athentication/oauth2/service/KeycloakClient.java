package com.athentication.oauth2.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;

public class KeycloakClient {

	@Value("${keycloak.auth-server-url}")
	private String keycloakAuthServerUrl;
	@Autowired
	private KeycloakRestTemplate template;

	@PreAuthorize("hasRole('CLIENT_USER')")
	public List<KeyCloakUser> getUsers() {
		String userUrl = keycloakAuthServerUrl + "/admin/realms/demo/users";
		ResponseEntity<KeyCloakUser[]> response = template.getForEntity(userUrl, KeyCloakUser[].class);
		return Arrays.stream(response.getBody()).collect(Collectors.toList());
	}

}
