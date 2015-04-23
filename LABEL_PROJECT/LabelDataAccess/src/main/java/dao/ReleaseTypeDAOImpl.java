package dao;

import entites.ReleaseType;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public class ReleaseTypeDAOImpl implements ReleaseTypeDAO {
    /**
     * Получить весь справочник типов релизов
     *
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<ReleaseType> getAllReleaseTypes() throws SQLException {
        Session session = null;
        List<ReleaseType> releaseTypes = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            releaseTypes = (List<ReleaseType>) session.createCriteria(ReleaseType.class).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return releaseTypes;
    }
}
