package com.control.veterinaria.model;


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
@Table(name="Mascota")
@NamedQuery(name = "Mascota.findAll", query = "SELECT m FROM Mascota m")
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {
	@Id
	@SequenceGenerator(name = "MASCOTA_ID_GENERATOR", allocationSize = 1, sequenceName = "MASCOTA_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MASCOTA_ID_GENERATOR")
	private int id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String raza;
	@Column(nullable = false)
	private String sexo;
	@Column(nullable = false)
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	@Column(nullable = false)
	@OneToOne(mappedBy = "Mascota")
	private Historia_Clinica historiaClinica;
}
