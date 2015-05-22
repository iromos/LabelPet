package directories.storage;

import adapter.POJOAdapter;
import data.StylePOJO;
import directories.Directory;
import directories.DirectoryLoader;
import entites.Style;
import entrypoint.LabelDirectoriesAccess;
import exception.LabelException;
import utils.DataUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jackson on 22.05.2015.
 */
public class StyleDirectory extends Directory<StylePOJO> {
    @Override
    public void load() throws SQLException {
        List<Style> allStyles = LabelDirectoriesAccess.getInstance().getStyleDAO().getAllStyles();
        data = POJOAdapter.getStylesFromEntities(allStyles);
    }

    @Override
    public StylePOJO getDataByCode(String code) throws LabelException {
        if (DataUtils.isStringEmpty(code)) {
            return null;
        }
        for (StylePOJO pojo : data) {
            if (code.equals(pojo.getStyle())) {
                return pojo;
            }
        }
        throw new LabelException("Style: " + code + " is not exist!");
    }

    public static StyleDirectory getInstance() {
        return (StyleDirectory) DirectoryLoader.getDirectory(StyleDirectory.class.getSimpleName());
    }
}
