package dao;

import entites.ReleasesStyles;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import utils.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public class ReleasesStylesDAOImpl implements ReleasesStylesDAO {
    /**
     * Получить стили релиза
     *
     * @param releaseId
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<ReleasesStyles> getStylesByRelease(String releaseId) throws SQLException {
        Session session = null;
        List<ReleasesStyles> releases = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releases = (List<ReleasesStyles>) session.createCriteria(ReleasesStyles.class).add(Restrictions.eq("release_id", releaseId)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releases;
    }

    /**
     * Получить все релизы по стилю
     *
     * @param style
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<ReleasesStyles> getReleasesByStyle(String style) throws SQLException {
        Session session = null;
        List<ReleasesStyles> releases = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releases = (List<ReleasesStyles>) session.createCriteria(ReleasesStyles.class).add(Restrictions.eq("style", style)).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releases;
    }

    /**
     * Добавить стиль релизу
     *
     * @param style
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public void addStyleToRelease(ReleasesStyles style) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(style);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    /**
     * Добавить стиль релизу
     *
     * @param style
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public void removeStyleFromRelease(ReleasesStyles style) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(style);
            session.getTransaction().commit();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
