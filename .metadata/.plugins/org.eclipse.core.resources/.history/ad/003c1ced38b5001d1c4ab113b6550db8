package com.control.veterinaria.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;
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
	@NotNull
	private String nombre;
	@NotNull
	private String apellido;
	@NotNull
	private String cargo;
	private String especialidad;
	@NotNull
	private String tipo_documento;
	@NotNull
	private int documento_identificacion;
	
}
