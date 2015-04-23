package entrypoint;

import dao.*;

/**
 * Created by Jack on 21.04.2015.
 */
public class LabelDataAccess {


    private BandDAO bandDAO;
    private ReleaseDAO releaseDAO;
    private ReleasesStylesDAO releasesStylesDAO;
    private static LabelDataAccess ourInstance = new LabelDataAccess();

    public static LabelDataAccess getInstance() {
        return ourInstance;
    }

    private LabelDataAccess() {
    }

    /**
     * Класс для работы с группой
     * @return
     */
    public BandDAO getBandDAO() {
        if (bandDAO == null) {
            bandDAO = new BandDAOImpl();
        }
        return bandDAO;
    }

    /**
     * Класс для работы с релизом
     * @return
     */
    public ReleaseDAO getReleaseDAO() {
        if (releaseDAO == null) {
            releaseDAO = new ReleaseDAOImpl();
        }
        return releaseDAO;
    }

    /**
     * Класс для работы со связкой релиза и стиля
     * @return
     */
    public ReleasesStylesDAO getReleasesStylesDAO() {
        if (releasesStylesDAO == null) {
            releasesStylesDAO = new ReleasesStylesDAOImpl();
        }
        return releasesStylesDAO;
    }
}
