package dao;

import entites.Style;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public class StyleDAOImpl implements StyleDAO {
    /**
     * Получить весь справочник стилей
     *
     * @return
     * @throws java.sql.SQLException
     */
    @Override
    public List<Style> getAllStyles() throws SQLException {
        Session session = null;
        List<Style> styles = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            styles = (List<Style>) session.createCriteria(Style.class).list();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return styles;
    }
}
