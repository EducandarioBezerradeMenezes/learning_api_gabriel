package org.koushik.javabrains.messenger.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;




import javax.ws.rs.core.UriInfo;

import org.koushik.javabrains.messenger.model.Calculo;
import org.koushik.javabrains.messenger.model.Historico;

import service.Servico;




@Path("/calcular")
public class CalcularResorce {




   Servico servico = new Servico();	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String calcular(){
		
		return "gabriel";
		
	}
	
		
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/soma/{valor1}/{valor2}")
	public Calculo getSoma (@PathParam("valor1") int valor1, @PathParam("valor2") int valor2, @Context HttpHeaders header, @Context UriInfo Uri    ){
		
			
	Calculo calculo = new Calculo(valor1,valor2);
	calculo.Somar();
	
Historico historico = new Historico(header.getHeaderString("host"),header.getRequestHeader("User-Agent").toString(),Uri.getAbsolutePath().toString() );
	
	

	
	 servico.gravarCalculo(calculo, historico);
	
	return calculo;	
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/subtrai/{valor1}/{valor2}")
	public Calculo getSubtrai(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2,  @Context HttpHeaders header, @Context UriInfo Uri    ){
		
			
	Calculo calculo = new Calculo(valor1,valor2);
	calculo.Subtrair();
	Historico historico = new Historico(header.getHeaderString("host"),header.getRequestHeader("User-Agent").toString(),Uri.getAbsolutePath().toString() );

	servico.gravarCalculo(calculo, historico);
	return calculo;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/multiplica/{valor1}/{valor2}")
	public Calculo getMutiplica (@PathParam("valor1") int valor1, @PathParam("valor2") int valor2,  @Context HttpHeaders header, @Context UriInfo Uri   ){
			
		
	Calculo calculo = new Calculo(valor1,valor2);	
	calculo.Mutiplicar();	
	Historico historico = new Historico(header.getHeaderString("host"),header.getRequestHeader("User-Agent").toString(),Uri.getAbsolutePath().toString() );

	servico.gravarCalculo(calculo, historico);
	return calculo;	
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/divide/{valor1}/{valor2}")
	public Calculo getDivide(@PathParam("valor1") int valor1, @PathParam("valor2") int valor2,  @Context HttpHeaders header, @Context UriInfo Uri   ){
	
		
	Calculo calculo = new Calculo(valor1,valor2);	
	calculo.Dividir();	
	Historico historico = new Historico(header.getHeaderString("host"),header.getRequestHeader("User-Agent").toString(),Uri.getAbsolutePath().toString() );

	servico.gravarCalculo(calculo, historico);
	return calculo;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/todos")
	public List<Calculo> getTodos(){
		return servico.getCalculos();
	}
	
}
