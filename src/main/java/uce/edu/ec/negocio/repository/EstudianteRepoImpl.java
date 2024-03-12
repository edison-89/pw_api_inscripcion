package uce.edu.ec.negocio.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import uce.edu.ec.negocio.repository.modelo.Estudiante;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void insertar(Estudiante e) {
        this.em.persist(e);
    }

    @Override
    public List<Estudiante> seleccionarTodos() {

        TypedQuery<Estudiante> query = this.em
                .createQuery("SELECT e FROM Estudiante e ", Estudiante.class);

        return query.getResultList();
    }

    @Override
    public Estudiante seleccionarCedula(String cedula) {
    
        TypedQuery<Estudiante> query = this.em
                .createQuery("SELECT e FROM Estudiante e WHERE e.cedula = :cedula ", Estudiante.class)
                .setParameter("cedula", cedula);

        return query.getSingleResult();
    }

}