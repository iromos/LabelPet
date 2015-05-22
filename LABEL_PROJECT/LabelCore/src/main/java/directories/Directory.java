package directories;

import exception.LabelException;

import java.util.List;

/**
 * Created by Jackson on 21.05.2015.
 */
public abstract class Directory<T> {

    protected List<T> data;

    public abstract void load() throws Exception;

    public List<T> getDirectoryData() {
        return data;
    }

    public abstract T getDataByCode(String code) throws LabelException;

}
