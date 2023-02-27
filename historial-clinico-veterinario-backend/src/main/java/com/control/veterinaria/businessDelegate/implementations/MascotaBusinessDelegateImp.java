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

import com.control.veterinaria.businessDelegate.interfaces.MascotaBusinessDelegate;
import com.control.veterinaria.model.Mascota;

@Component
public class MascotaBusinessDelegateImp implements MascotaBusinessDelegate {
	
	public final static String URL = "http://localhost:8080/api/mascota/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public MascotaBusinessDelegateImp() {
		restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        messageConverters.add(converter);
        this.restTemplate.setMessageConverters(messageConverters);
	}

	@Override
	public List<Mascota> findAll() {
		return Arrays.asList(restTemplate.getForObject(URL, Mascota[].class));
	}

	@Override
	public Mascota findById(Integer id) {
		return restTemplate.getForObject(URL+ id, Mascota.class);
	}

	@Override
	public Mascota save(Mascota mascota) {
		HttpEntity<Mascota> http = new HttpEntity<Mascota>(mascota);
		return restTemplate.postForObject(URL, http, Mascota.class);
	}

	@Override
	public Mascota update(Mascota mascota) {
		HttpEntity<Mascota> http = new HttpEntity<Mascota>(mascota);
		return restTemplate.exchange(
				URL + mascota.getId(), 
				HttpMethod.PUT, 
				http, 
				Mascota.class,
				mascota.getId())
				.getBody();
	}

	@Override
	public void deleteById(Integer id) {
		restTemplate.delete(URL + id, Integer.class);
	}
}
