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

import com.control.veterinaria.businessDelegate.interfaces.Historia_ClinicaBusinessDelegate;
import com.control.veterinaria.model.Historia_Clinica;

@Component
public class Historia_ClinicaBusinessDelegateImp implements Historia_ClinicaBusinessDelegate {
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Historia_ClinicaBusinessDelegateImp() {
		restTemplate = new RestTemplate();
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.APPLICATION_JSON));
        messageConverters.add(converter);
        this.restTemplate.setMessageConverters(messageConverters);
	}

	@Override
	public List<Historia_Clinica> findAll() {
		return Arrays.asList(restTemplate.getForObject(URL, Historia_Clinica[].class));
	}

	@Override
	public Historia_Clinica findById(Integer id) {
		return restTemplate.getForObject(URL+ id, Historia_Clinica.class);
	}

	@Override
	public Historia_Clinica save(Historia_Clinica historial) {
		HttpEntity<Historia_Clinica> http = new HttpEntity<Historia_Clinica>(historial);
		return restTemplate.postForObject(URL, http, Historia_Clinica.class);
	}

	@Override
	public Historia_Clinica update(Historia_Clinica historial) {
		HttpEntity<Historia_Clinica> http = new HttpEntity<Historia_Clinica>(historial);
		return restTemplate.exchange(
				URL + historial.getId(), 
				HttpMethod.PUT, 
				http, 
				Historia_Clinica.class,
				historial.getId())
				.getBody();
	}

	@Override
	public void deleteById(Integer id) {
		restTemplate.delete(URL + id, Integer.class);
	}
}
