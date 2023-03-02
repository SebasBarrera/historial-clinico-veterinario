package com.control.veterinaria.businessDelegate.implementations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.control.veterinaria.businessDelegate.interfaces.UsuarioBusinessDelegate;
import com.control.veterinaria.model.Usuario;

@Component
public class UsuarioBusinessDelegateImp implements UsuarioBusinessDelegate {
	
	public final static String URL = "http://localhost:8080/api/usuario/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public UsuarioBusinessDelegateImp() {
		restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        messageConverters.add(converter);
        this.restTemplate.setMessageConverters(messageConverters);
	}

	@Override
	public List<Usuario> findAll() {
		return Arrays.asList(restTemplate.getForObject(URL, Usuario[].class));
	}

	@Override
	public Usuario findById(Integer id) {
		return restTemplate.getForObject(URL+ id, Usuario.class);
	}

	@Override
	public Usuario save(Usuario usuario) {
		HttpEntity<Usuario> http = new HttpEntity<Usuario>(usuario);
		return restTemplate.postForObject(URL, http, Usuario.class);
	}

	@Override
	public Usuario update(Usuario usuario) {
		HttpEntity<Usuario> http = new HttpEntity<Usuario>(usuario);
		return restTemplate.exchange(
				URL + usuario.getId(), 
				HttpMethod.PUT, 
				http, 
				Usuario.class,
				usuario.getId())
				.getBody();
	}

	@Override
	public void deleteById(Integer id) {
		restTemplate.delete(URL + id, Integer.class);
	}
}
