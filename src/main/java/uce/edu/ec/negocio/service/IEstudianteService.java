package uce.edu.ec.negocio.service;

import java.util.List;

import uce.edu.ec.negocio.repository.modelo.Estudiante;
import uce.edu.ec.negocio.service.to.EstudianteTO;

public interface IEstudianteService {
    public void guardar(Estudiante e);

    public List<EstudianteTO> consultarTodos();

    public EstudianteTO consultarCedula(String cedula);
}
