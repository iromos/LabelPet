package dao;

import entites.Band;
import entites.Release;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public interface ReleaseDAO {
    /**
     * Добавить релиз группе
     * @param release
     * @throws java.sql.SQLException
     */
    public Integer addRelease(Release release) throws SQLException;

    /**
     * Изменить релиз
     * @param release
     * @throws SQLException
     */
    public void updateRelease(Release release) throws SQLException;

    /**
     * Найти релиз по id
     * @param id
     * @return
     * @throws SQLException
     */
    public Release getReleaseById(Integer id) throws SQLException;

    /**
     * Найти релиз по части названия
     * @param partOfTitle
     * @return
     * @throws SQLException
     */
    public List<Release> getReleasesByTitlePart(String partOfTitle) throws SQLException;

    /**
     * Найти релиз по названию
     * @param title
     * @return
     * @throws SQLException
     */
    public List<Release> getReleasesByTitle(String title) throws SQLException;

    /**
     * Найти релизы группы
     * @param bandId
     * @return
     * @throws SQLException
     */
    public List<Release> getReleasesByBand(Integer bandId) throws SQLException;

    /**
     * Найти релизы группы определенного типа
     * @param bandId
     * @param type
     * @return
     * @throws SQLException
     */
    public List<Release> getReleasesByBandAndType(Integer bandId, String type) throws SQLException;

    /**
     * Получить все релизы
     * @return
     * @throws SQLException
     */
    public List<Release> getAllReleases() throws SQLException;

    /**
     * Удалить релиз
     * @param release
     * @throws SQLException
     */
    public void deleteRelease(Release release) throws SQLException;
}
