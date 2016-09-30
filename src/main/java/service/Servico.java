package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.koushik.javabrains.messenger.model.Calculo;
import org.koushik.javabrains.messenger.model.Historico;

public class Servico {

//private EntityManagerFactory factory = Persistence.createEntityManagerFactory("messenger");
//private EntityManager manager = factory.createEntityManager();

EntityManagerFactory factory;

public Servico(){
factory = Persistence.createEntityManagerFactory("messenger");
}



public void gravarCalculo(Calculo calculo, Historico historico){

EntityManager manager = factory.createEntityManager();	
	
manager.getTransaction().begin();
manager.persist(calculo);
manager.persist(historico);
manager.getTransaction().commit();
manager.close();
} 
	
public List<Calculo> getCalculos(){
	List<Calculo>calculos ;
	EntityManager manager = factory.createEntityManager();	
	Query query = manager.createQuery("Select c From Calculo c ", Calculo.class);
	calculos = query.getResultList();
	manager.close();
	return calculos;
}


	
	
}
