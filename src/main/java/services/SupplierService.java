package services;

import entities.Suplier;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public class SupplierService {

    @PersistenceContext
    private EntityManager em;


    public List<Suplier> getAll() {
        return em
                .createNamedQuery("Suplier.getAll", Suplier.class)
                .getResultList();

    }

    public Suplier getById(int id) {
        return em
                .createNamedQuery("Suplier.getById", Suplier.class)
                .setParameter("id", id)
                .getSingleResult();

    }

    public Suplier getById2(int id) {
        return em.find(Suplier.class, id);
    }

    @Transactional
    public void deleteSuplier(int id) {
        Suplier s = em.find(Suplier.class, id);
        em.remove(s);
    }

    @Transactional
    public void insert(Suplier s) {
        em.persist(s);
    }

    @Transactional
    public void update(int id, String companyName) {
        Suplier s = em.find(Suplier.class, id);
        s.setCompanyName(companyName);
        em.merge(s);
    }
}



