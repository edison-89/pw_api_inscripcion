package uce.edu.ec.negocio.repository;

import java.util.List;

import uce.edu.ec.negocio.repository.modelo.Estudiante;

public interface IEstudianteRepo {
    public void insertar(Estudiante e);

    public List<Estudiante> seleccionarTodos();

    public Estudiante seleccionarCedula(String cedula);

}