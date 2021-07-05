package cl.inacap.publicidadModel.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import cl.inacap.publicidadModel.dto.Asistente;

/**
 * Session Bean implementation class AsistenteDAO
 */
@Stateless
@LocalBean
public class AsistenteDAO implements AsistenteDAOLocal {

    private static List<Asistente> asistentes = new ArrayList<>();
	
    
	@Override
	public void save(Asistente asistente) {
		asistentes.add(asistente);
		
	}

	@Override
	public List<Asistente> getAll() {
		// TODO Auto-generated method stub
		return asistentes;
	}

	@Override
	public void delete(Asistente asistente) {
		asistentes.remove(asistente);
		
	}

	@Override
	public List<Asistente> filterByName(String nombre) {
		// TODO Auto-generated method stub
		return asistentes.stream().filter(c->c.getNombre().contains(nombre)).collect(Collectors.toList());
	}

}
