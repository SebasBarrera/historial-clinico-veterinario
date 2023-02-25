package com.control.veterinaria.model;


import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "Detalle_Historia_Clinica")
@NamedQuery(name = "Detalle_Historia_Clinica.findAll", query = "SELECT d FROM Detalle_Historia_Clinica d")
@NoArgsConstructor
@AllArgsConstructor
public class Detalle_Historia_Clinica {
	@Id
	@SequenceGenerator(name = "DETALLE_HISTORIA_CLINICA_ID_GENERATOR", allocationSize = 1, sequenceName = "DETALLE_HISTORIA_CLINICA_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DETALLE_HISTORIA_CLINICA_ID_GENERATOR")
	private int id;
	@NotNull
	private String temperatura;
	@NotNull
	private double peso;
	@NotNull
	private double frecuencia_cardiaca;
	@NotNull
	private double frecuencia_respiratoria;
	@NotNull
	private LocalTime fecha_hora;
	@NotNull
	private String alimentacion;
	@NotNull
	private String habitad;
	@NotNull
	private String observacion;
	@NotNull
	@ManyToOne
	@JoinColumn(name="historia_clinica_id")
	private Historia_Clinica historias_clinicas;
	@NotNull
	@OneToOne
	@JoinColumn(name="colaborador_id")
	private Colaborador colaborador;
}
