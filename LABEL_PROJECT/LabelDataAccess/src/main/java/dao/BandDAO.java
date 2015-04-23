package dao;

import entites.Band;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 14.04.2015.
 */
public interface BandDAO {
    /**
     * Добавить группу
     *
     * @param band
     * @throws SQLException
     */
    public void addBand(Band band) throws SQLException;

    /**
     * Изменить группу
     *
     * @param band
     * @throws SQLException
     */
    public void updateBand(Band band) throws SQLException;

    /**
     * Найти группу по id
     *
     * @param id
     * @return
     * @throws SQLException
     */
    public Band getBandById(Integer id) throws SQLException;

    /**
     * Найти группы по имени
     *
     * @param name
     * @return
     * @throws SQLException
     */
    public List<Band> getBandsByName(String name) throws SQLException;

    /**
     * Получить все группы по стране
     *
     * @param country
     * @return
     * @throws SQLException
     */
    public List<Band> getBandsByCountry(String country) throws SQLException;

    /**
     * Получить все группы по стране
     *
     * @param name
     * @return
     * @throws SQLException
     */
    public List<Band> getBandsByNameAndCountry(String name, String country) throws SQLException;


    /**
     * Получить все группы
     *
     * @return
     * @throws SQLException
     */
    public List<Band> getAllBands() throws SQLException;

    /**
     * Удалить группу
     *
     * @param band
     * @throws SQLException
     */
    public void deleteBand(Band band) throws SQLException;
}
