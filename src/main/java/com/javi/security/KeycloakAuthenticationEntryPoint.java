package com.javi.security;

import java.io.OutputStream;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.javi.response.RestResponseError;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

@Component("keycloakAuthenticationEntryPoint")
@Slf4j
public class KeycloakAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    @SneakyThrows
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) {
        var restResponseHeader = new RestResponseError(
                List.of(new RestResponseError.Error(HttpStatus.INTERNAL_SERVER_ERROR, "INVALID_TOKEN",
                        "Invalid token.")));
        log.error("Invalid token");
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        OutputStream responseStream = response.getOutputStream();
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(responseStream, restResponseHeader);
        responseStream.flush();
    }
}
