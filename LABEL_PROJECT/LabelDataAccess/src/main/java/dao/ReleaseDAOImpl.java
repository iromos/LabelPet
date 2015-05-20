package dao;

import entites.Release;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import utils.HibernateUtil;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public class ReleaseDAOImpl implements ReleaseDAO {
    /**
     * Добавить релиз группе
     *
     * @param release
     * @throws java.sql.SQLException
     */
    @Override
    public Integer addRelease(Release release) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Serializable releaseId = session.save(release);
            session.getTransaction().commit();
            return (Integer)releaseId;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    /**
     * Изменить релиз
     *
     * @param release
     * @throws java.sql.SQLException
     */
    @Override
    public void updateRelease(Release release) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(release);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    /**
     * Найти релиз по id
     *
     * @param id
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public Release getReleaseById(Integer id) throws SQLException {
        Session session = null;
        Release band = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            band = (Release) session.load(Release.class, id);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return band;
    }

    /**
     * Найти релиз по части названия
     *
     * @param partOfTitle
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Release> getReleasesByTitlePart(String partOfTitle) throws SQLException {
        Session session = null;
        List<Release> releases = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releases = (List<Release>) session.createCriteria(Release.class).add(Restrictions.like("title", partOfTitle, MatchMode.ANYWHERE)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releases;
    }

    /**
     * Найти релиз по названию
     *
     * @param title
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Release> getReleasesByTitle(String title) throws SQLException {
        Session session = null;
        List<Release> releases = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releases = (List<Release>) session.createCriteria(Release.class).add(Restrictions.eq("title", title)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releases;
    }

    /**
     * Найти релизы группы
     *
     * @param bandId
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Release> getReleasesByBand(Integer bandId) throws SQLException {
        Session session = null;
        List<Release> releases = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releases = (List<Release>) session.createCriteria(Release.class).add(Restrictions.eq("bandId", bandId)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releases;
    }

    /**
     * Найти релизы группы определенного типа
     *
     * @param bandId
     * @param type
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Release> getReleasesByBandAndType(Integer bandId, String type) throws SQLException {
        Session session = null;
        List<Release> releases = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releases = (List<Release>) session.createCriteria(Release.class).add(Restrictions.eq("bandId", bandId)).
                    add(Restrictions.eq("type", type)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releases;
    }

    /**
     * Получить все релизы
     *
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Release> getAllReleases() throws SQLException {
        Session session = null;
        List<Release> releases = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releases = (List<Release>) session.createCriteria(Release.class).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releases;
    }

    /**
     * Удалить релиз
     *
     * @param release
     * @throws java.sql.SQLException
     */
    @Override
    public void deleteRelease(Release release) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(release);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
