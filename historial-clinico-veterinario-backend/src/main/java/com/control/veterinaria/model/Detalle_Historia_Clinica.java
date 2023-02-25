package com.control.veterinaria.model;


import java.time.LocalTime;

import javax.persistence.Column;
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
	@Column(nullable = false)
	private String temperatura;
	@Column(nullable = false)
	private double peso;
	@Column(nullable = false)
	private double frecuencia_cardiaca;
	@Column(nullable = false)
	private double frecuencia_respiratoria;
	@Column(nullable = false)
	private LocalTime fecha_hora;
	@Column(nullable = false)
	private String alimentacion;
	@Column(nullable = false)
	private String habitad;
	@Column(nullable = false)
	private String observacion;
	@Column(nullable = false)
	@ManyToOne
	@JoinColumn(name="historia_clinica_id")
	private Historia_Clinica historias_clinicas;
	@Column(nullable = false)
	@OneToOne
	@JoinColumn(name="colaborador_id")
	private Colaborador colaborador;
}
