package net.itinajero.service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import net.itinajero.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacantesService {
	
	List<Vacante> lista = null;
	
	public VacantesServiceImpl() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		lista = new LinkedList<Vacante>();
		try {
			// Creamos las ofertas de trabajo
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero 	civil");
			vacante1.setDescripcion("Se solicita ingeniero para diseñar puente");
			vacante1.setFecha(sdf.parse("08-08-2019"));
			vacante1.setSalario(9700.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");
			
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador publico");
			vacante2.setDescripcion("Se solicita contador con 5 años de experiencia");
			vacante2.setFecha(sdf.parse("09-02-2019"));
			vacante2.setSalario(1200.0);
			vacante2.setDestacado(0);
			
			lista.add(vacante1);
			lista.add(vacante2);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	@Override
	public List<Vacante> buscarTodas() {
		return lista;
	}

	@Override
	public Vacante buscarPorId(Integer idVacante) {

for (Vacante v : lista) {
	if (v.getId() == idVacante) {
		return v;
	}
}
		return null;
	}

}
