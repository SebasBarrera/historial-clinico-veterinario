package com.control.veterinaria.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Usuario", uniqueConstraints = {@UniqueConstraint (columnNames = {"documento_identificacion"})})
@NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	@Id
	@SequenceGenerator(name = "USUARIO_ID_GENERATOR", allocationSize = 1, sequenceName = "USUARIO_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_ID_GENERATOR")
	private int id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column(nullable = false)
	private String tipo_documento;
	@Column(nullable = false, unique = true)
	private int documento_identificacion;
	@Column(nullable = false)
	private String estado;
	@Column(nullable = false)
	private int sexo;
	@Column(nullable = false)
	@OneToMany(mappedBy = "Usuario")
	@JsonIgnore
	private List<Mascota> mascotas;
}
