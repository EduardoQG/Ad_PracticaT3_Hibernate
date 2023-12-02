package es.studium.hotel;

import jakarta.persistence.*;

@Entity
@Table(name="clientes", schema="hotel")
public class Cliente {

	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name = "idCliente") 
	private int idCliente;
	
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	@Column(name="email")
	private String email;
	@Column(name="dni")
	private String dni;
	@Column(name="clave")
	private String clave;
		
	public Cliente() {
	}
	
	public Cliente(String nombre, String apellidos, String email, String dni, String clave) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.dni = dni;
		this.clave = clave;
	}

	public Cliente(int idCliente, String nombre, String apellidos, String email, String dni, String clave) {
		this.idCliente = idCliente;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.dni = dni;
		this.clave = clave;
	}
	
	public Cliente (int id) {
		idCliente = id;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
