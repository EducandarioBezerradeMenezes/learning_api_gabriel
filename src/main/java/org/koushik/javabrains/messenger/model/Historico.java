package org.koushik.javabrains.messenger.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Historico {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)	
private int ID;	
private String ip;
private String navegador;

@Temporal(TemporalType.DATE)
private Date data;
private String metodo;



public Historico(){
	
}






public Historico(String ip, String navegador, String metodo) {
	super();
	this.ip = ip;
	this.navegador = navegador;
	this.data = new Date();
	this.metodo = metodo;
}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getIp() {
	return ip;
}

public void setIp(String ip) {
	this.ip = ip;
}

public String getNavegador() {
	return navegador;
}

public void setNavegador(String navegador) {
	this.navegador = navegador;
}

public Date getData() {
	return data;
}

public void setData(Date data) {
	this.data = data;
}

public String getMetodo() {
	return metodo;
}

public void setMetodo(String metodo) {
	this.metodo = metodo;
}






@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ID;
	result = prime * result + ((data == null) ? 0 : data.hashCode());
	result = prime * result + ((ip == null) ? 0 : ip.hashCode());
	result = prime * result + ((metodo == null) ? 0 : metodo.hashCode());
	result = prime * result + ((navegador == null) ? 0 : navegador.hashCode());
	return result;
}






@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Historico other = (Historico) obj;
	if (ID != other.ID)
		return false;
	if (data == null) {
		if (other.data != null)
			return false;
	} else if (!data.equals(other.data))
		return false;
	if (ip == null) {
		if (other.ip != null)
			return false;
	} else if (!ip.equals(other.ip))
		return false;
	if (metodo == null) {
		if (other.metodo != null)
			return false;
	} else if (!metodo.equals(other.metodo))
		return false;
	if (navegador == null) {
		if (other.navegador != null)
			return false;
	} else if (!navegador.equals(other.navegador))
		return false;
	return true;
}






	
	
}
