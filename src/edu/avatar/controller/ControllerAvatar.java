package edu.avatar.controller;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import edu.avatar.dto.PokemonDTO;


public class ControllerAvatar {
	
	
	
	public static void main(String[] args) {
		
		
		String endpoint = "https://pokeapi.co/api/v2/pokemon-species";
		
		Client cliente = ClientBuilder.newClient();
		
		
		PokemonDTO pok = cliente.target(endpoint).
		request(MediaType.APPLICATION_JSON)
		.get(PokemonDTO.class);
		
		
		System.out.println("COUNT: "+pok.getCount());
		System.out.println("NEXT: "+pok.getNext());
		System.out.println("PREVIUS:" + pok.getPrevious());
		System.out.println("RESULTS:" + pok.getLstResults());
		
		
	}

}
