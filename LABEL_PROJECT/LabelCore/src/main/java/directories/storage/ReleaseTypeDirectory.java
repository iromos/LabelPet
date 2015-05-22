package directories.storage;

import adapter.POJOAdapter;
import data.ReleaseTypePOJO;
import directories.Directory;
import directories.DirectoryLoader;
import entites.ReleaseType;
import entrypoint.LabelDirectoriesAccess;
import exception.LabelException;
import utils.DataUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jackson on 22.05.2015.
 */
public class ReleaseTypeDirectory extends Directory<ReleaseTypePOJO> {
    @Override
    public void load() throws SQLException {
        List<ReleaseType> allReleaseTypes = LabelDirectoriesAccess.getInstance().getReleaseTypeDAO().getAllReleaseTypes();
        data = POJOAdapter.getReleaseTypesFromEntities(allReleaseTypes);
    }

    @Override
    public ReleaseTypePOJO getDataByCode(String code) throws LabelException {
        if (DataUtils.isStringEmpty(code)) {
            return null;
        }
        for (ReleaseTypePOJO pojo : data) {
            if (code.equals(pojo.getType())) {
                return pojo;
            }
        }
        throw new LabelException("ReleaseTyp: " + code + " is not exist!");
    }

    public static ReleaseTypeDirectory getInstance() {
        return (ReleaseTypeDirectory) DirectoryLoader.getDirectory(ReleaseTypeDirectory.class.getSimpleName());
    }
}
