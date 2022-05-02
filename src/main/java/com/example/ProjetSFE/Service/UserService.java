package com.example.ProjetSFE.Service;

import com.example.ProjetSFE.dto.LocalUser;
import com.example.ProjetSFE.dto.SignUpRequest;
import com.example.ProjetSFE.exception.UserAlreadyExistAuthenticationException;
import com.example.ProjetSFE.Model.User;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;

import java.util.Map;
import java.util.Optional;

public interface UserService {

	public User registerNewUser(SignUpRequest signUpRequest) throws UserAlreadyExistAuthenticationException;

	User findUserByEmail(String email);

	Optional<User> findUserById(Long id);

	LocalUser processUserRegistration(String registrationId, Map<String, Object> attributes, OidcIdToken idToken, OidcUserInfo userInfo);
}
