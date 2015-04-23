package dao;


import entites.Style;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public interface StyleDAO {

    /**
     * Получить весь справочник стилей
     * @return
     * @throws java.sql.SQLException
     */
    public List<Style> getAllStyles() throws SQLException;

}
