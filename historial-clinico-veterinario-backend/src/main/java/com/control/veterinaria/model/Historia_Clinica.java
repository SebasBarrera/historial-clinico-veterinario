package com.control.veterinaria.model;

import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "HISTORIA_CLINICA")
@NamedQuery(name = "Historia_Clinica.findAll", query = "SELECT h FROM Historia_Clinica h")
@NoArgsConstructor
@AllArgsConstructor
public class Historia_Clinica {
	@Id
	@SequenceGenerator(name = "HISTORIA_CLINICA_ID_GENERATOR", allocationSize = 1, sequenceName = "HISTORIA_CLINICA_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HISTORIA_CLINICA_ID_GENERATOR")
	private int id;
	@Column(nullable = false)
	@NotNull(message = "La Fecha de creacion no puede estar vacia")
	private LocalTime fecha_creacion;
	@OneToOne
	@JoinColumn(name="mascota_id")
	private Mascota mascota;
	@OneToMany(mappedBy = "id")
	@JsonIgnore
	private List<Detalle_Historia_Clinica> detallesHistoriaClinica;
}
