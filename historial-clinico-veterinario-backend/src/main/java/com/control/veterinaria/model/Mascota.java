package com.control.veterinaria.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
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
	@NotEmpty(message = "El nombre no puede estar vacio")
	private String nombre;
	@Column(nullable = false)
	@NotEmpty(message = "La raza no puede estar vacia")
	private String raza;
	@Column(nullable = false)
	@NotEmpty(message = "El sexo no puede estar vacio")
	private String sexo;
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;
	@OneToOne//(mappedBy = "id")
	private Historia_Clinica historiaClinica;
}
