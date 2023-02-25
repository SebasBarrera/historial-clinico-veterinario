package com.control.veterinaria.model;


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
@Table(name="Mascota")
@NamedQuery(name = "Mascota.findAll", query = "SELECT m FROM Mascota m")
@NoArgsConstructor
@AllArgsConstructor
public class Mascota {
	@Id
	@SequenceGenerator(name = "MASCOTA_ID_GENERATOR", allocationSize = 1, sequenceName = "MASCOTA_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MASCOTA_ID_GENERATOR")
	private int id;
	@NotNull
	private String nombre;
	@NotNull
	private String raza;
	@NotNull
	private String sexo;
	@NotNull
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	@NotNull
	@OneToOne(mappedBy = "Mascota")
	private Historia_Clinica historiaClinica;
}
