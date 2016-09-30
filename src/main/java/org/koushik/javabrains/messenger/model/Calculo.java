package org.koushik.javabrains.messenger.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Calculo {





//private static final GenerationType SEQUENCE = null;
// criar a classe servico e terminar a implementação de JPA
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;	
	
private int numero1;
private int numero2;
private double resultado;

public Calculo(){	
}


public Calculo(int numero1, int numero2) {
	super();
	this.numero1 = numero1;
	this.numero2 = numero2;
}


public int getNumero1() {
	return numero1;
}

public void setNumero1(int numero1) {
	this.numero1 = numero1;
}

public int getNumero2() {
	return numero2;
}

public void setNumero2(int numero2) {
	this.numero2 = numero2;
}

public double getResultado() {
	return resultado;
}

public void setResultado(double resultado) {
	this.resultado = resultado;
}

public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + numero1;
	result = prime * result + numero2;
	long temp;
	temp = Double.doubleToLongBits(resultado);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	Calculo other = (Calculo) obj;
	if (id != other.id)
		return false;
	if (numero1 != other.numero1)
		return false;
	if (numero2 != other.numero2)
		return false;
	if (Double.doubleToLongBits(resultado) != Double
			.doubleToLongBits(other.resultado))
		return false;
	return true;
}


public void Somar(){
	resultado = getNumero1() + getNumero2();
}

public void Subtrair (){
	resultado = getNumero1() - getNumero2();
}

public void Dividir (){
	resultado = getNumero1() / getNumero2();
}

public void Mutiplicar (){
	resultado = getNumero1() * getNumero2();
}

	


}
