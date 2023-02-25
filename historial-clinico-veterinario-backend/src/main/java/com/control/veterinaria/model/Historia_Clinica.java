package com.control.veterinaria.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotNull;
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
	@NotNull
	@OneToOne
	@JoinColumn(name="mascota_id")
	private Mascota mascota;
	@NotNull
	@OneToMany(mappedBy = "Historia_Clinica")
	@JsonIgnore
	private List<Detalle_Historia_Clinica> detallesHistoriaClinica;
}
