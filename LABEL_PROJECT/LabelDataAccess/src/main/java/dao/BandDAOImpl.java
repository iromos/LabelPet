package dao;

import entites.Band;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import utils.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public class BandDAOImpl implements BandDAO {
    /**
     * Добавить группу
     *
     * @param band
     * @throws java.sql.SQLException
     */
    @Override
    public void addBand(Band band) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(band);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    /**
     * Изменить группу
     *
     * @param band
     * @throws java.sql.SQLException
     */
    @Override
    public void updateBand(Band band) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(band);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    /**
     * Найти группу по id
     *
     * @param id
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public Band getBandById(Integer id) throws SQLException {
        Session session = null;
        Band band = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            band = (Band) session.load(Band.class, id);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return band;
    }

    /**
     * Найти группы по имени
     *
     * @param name
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Band> getBandsByName(String name) throws SQLException {
        Session session = null;
        List<Band> bands = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            bands = (List<Band>) session.createCriteria(Band.class).add(Restrictions.eq("name", name)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return bands;
    }

    /**
     * Получить все группы по стране
     *
     * @param country
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Band> getBandsByCountry(String country) throws SQLException {
        Session session = null;
        List<Band> bands = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            bands = (List<Band>) session.createCriteria(Band.class).add(Restrictions.eq("country", country)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return bands;
    }

    /**
     * Получить все группы по стране
     *
     * @param name
     * @param country
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Band> getBandsByNameAndCountry(String name, String country) throws SQLException {
        Session session = null;
        List<Band> bands = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            bands = (List<Band>) session.createCriteria(Band.class).add(Restrictions.eq("name", name)).add(Restrictions.eq("country", country)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return bands;
    }

    /**
     * Получить все группы
     *
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Band> getAllBands() throws SQLException {
        Session session = null;
        List<Band> bands = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            bands = (List<Band>) session.createCriteria(Band.class).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return bands;
    }

    /**
     * Удалить группу
     *
     * @param band
     * @throws java.sql.SQLException
     */
    @Override
    public void deleteBand(Band band) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(band);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
