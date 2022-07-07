package com.cts.classifiedsportal.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserToken {

	private String username;
	private String authToken;
	public int empid;
	
	
}
