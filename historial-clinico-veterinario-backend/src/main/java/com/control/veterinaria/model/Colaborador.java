package com.control.veterinaria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Colaborador")
@NamedQuery(name = "Colaborador.findAll", query = "SELECT c FROM Colaborador c")
@NoArgsConstructor
@AllArgsConstructor
public class Colaborador {
	@Id
	@SequenceGenerator(name = "COLABORADOR_ID_GENERATOR", allocationSize = 1, sequenceName = "COLABORADOR_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COLABORADOR_ID_GENERATOR")
	private int id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false)
	private String cargo;
	@Column(nullable = true)
	private String especialidad;
	@Column(nullable = false)
	private String tipo_documento;
	@Column(nullable = false, unique = true)
	private int documento_identificacion;
	
}
