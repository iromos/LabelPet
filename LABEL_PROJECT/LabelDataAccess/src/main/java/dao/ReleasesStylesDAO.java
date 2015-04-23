package dao;

import entites.ReleasesStyles;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public interface ReleasesStylesDAO {

    /**
     * Получить стили релиза
     *
     * @return
     * @throws java.sql.SQLException
     */
    public List<ReleasesStyles> getStylesByRelease(String releaseId) throws SQLException;

    /**
     * Получить все релизы по стилю
     *
     * @return
     * @throws java.sql.SQLException
     */
    public List<ReleasesStyles> getReleasesByStyle(String style) throws SQLException;

    /**
     * Добавить стиль релизу
     *
     * @return
     * @throws java.sql.SQLException
     */
    public void addStyleToRelease(ReleasesStyles style) throws SQLException;

    /**
     *
     * Добавить стиль релизу
     *
     * @return
     * @throws java.sql.SQLException
     */
    public void removeStyleFromRelease(ReleasesStyles style) throws SQLException;
}
