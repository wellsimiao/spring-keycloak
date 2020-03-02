package com.athentication.oauth2.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KeyCloakUser implements Serializable {

	@JsonProperty
	private String id;
	@JsonProperty
	private Long createdTimestamp;
	@JsonProperty
	private String username;
	@JsonProperty
	private Boolean enabled;
	@JsonProperty
	private Boolean totp;
	@JsonProperty
	private Boolean emailVerified;
	@JsonProperty
	private List<String> disableableCredentialTypes;
	@JsonProperty
	private List<String> requiredActions;
	@JsonProperty
	private Integer notBefore;
	@JsonProperty
	private Map<String, String> access;
}
