package com.hackthon.innovationIncognito;

import com.hackthon.innovationIncognito.entity.User;
import com.hackthon.innovationIncognito.securityconfigure.CustomeUserDetailService;
import com.hackthon.innovationIncognito.securityconfigure.CustomuserDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.userdetails.UserDetails;

@SpringBootApplication
public class InnovationIncognitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(InnovationIncognitoApplication.class, args);
	}

}
