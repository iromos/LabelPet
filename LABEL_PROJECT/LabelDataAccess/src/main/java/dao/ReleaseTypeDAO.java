package dao;

import entites.ReleaseType;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public interface ReleaseTypeDAO {

    /**
     * Получить весь справочник типов релизов
     *
     * @return
     * @throws java.sql.SQLException
     */
    public List<ReleaseType> getAllReleaseTypes() throws SQLException;
}
