package cl.inacap.publicidadModel.dao;

import java.util.List;

import javax.ejb.Local;

import cl.inacap.publicidadModel.dto.Asistente;

@Local
public interface AsistenteDAOLocal {

	void save(Asistente asistente);
	List<Asistente> getAll();
	void delete(Asistente asistente);
	List<Asistente> filterByName(String nombre);
}
