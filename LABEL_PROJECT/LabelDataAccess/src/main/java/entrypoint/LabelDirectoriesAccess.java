package entrypoint;

import dao.ReleaseTypeDAO;
import dao.ReleaseTypeDAOImpl;
import dao.StyleDAO;
import dao.StyleDAOImpl;

/**
 * Created by Jack on 21.04.2015.
 */
public class LabelDirectoriesAccess {
    private static LabelDirectoriesAccess ourInstance = new LabelDirectoriesAccess();

    public static LabelDirectoriesAccess getInstance() {
        return ourInstance;
    }

    private ReleaseTypeDAO releaseTypeDAO;
    private StyleDAO styleDAO;

    private LabelDirectoriesAccess() {
    }

    /**
     * Работа со справочником типов релизов
     * @return
     */
    public ReleaseTypeDAO getReleaseTypeDAO() {
        if (releaseTypeDAO == null) {
            releaseTypeDAO = new ReleaseTypeDAOImpl();
        }
        return releaseTypeDAO;
    }

    /**
     * Работа со справочником стилей
     * @return
     */
    public StyleDAO getStyleDAO() {
        if (styleDAO == null) {
            styleDAO = new StyleDAOImpl();
        }
        return styleDAO;
    }
}
