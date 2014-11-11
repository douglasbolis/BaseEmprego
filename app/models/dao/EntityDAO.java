package models.dao;

import models.Entity;
import play.db.jpa.JPA;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

/**
 * Created by clayton on 30/10/14.
 */
public class EntityDAO<T extends Entity> {


    protected final Class<T> classType;
    protected final T metaclass;
    protected final EntityManager em;
    protected final CriteriaBuilder cb;


    protected EntityDAO(Class<T> classType) {

        this.em = JPA.em();
        this.cb = em.getCriteriaBuilder();
        this.classType = classType;
        try {
            this.metaclass = classType.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




    public List<T> all() {
        CriteriaQuery<T> cq = cb.createQuery(classType);
        return em.createQuery(cq).getResultList();
    }

    public T save(T o) {
        if (o.uuid != null) {
            return em.merge(o);
        } else {
            em.persist(o);
            return o;
        }


    }

    public T findOne(UUID id) {
        CriteriaQuery<T> cq = cb.createQuery(classType);
        Root<T> root = cq.from(classType);
        cq.where(cb.equal(root.get("uuid"),id.toString().toUpperCase()));
        try {
            return em.createQuery(cq).getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            return null;
        }
    }


    public <A> List<T> findMany(String field, A value) {
        CriteriaQuery<T> cq = cb.createQuery(classType);
        Root<T> root = cq.from(classType);
        cq.where(cb.equal(root.get(field), value));
        return em.createQuery(cq).getResultList();
    }




    public void delete(UUID id) {
        T o = findOne(id);
        if (o != null) {
            em.remove(o);
            em.flush();
        }

    }
}
