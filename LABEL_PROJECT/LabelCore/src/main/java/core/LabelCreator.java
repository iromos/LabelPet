package core;

import data.Bands;
import data.Releases;

/**
 * Created by Jackson on 08.05.2015.
 */
public interface LabelCreator extends LabelHandler{

    public Bands addBandsWithReturn(Bands input) throws Exception;

    public void addBands(Bands input) throws Exception;

    public Bands addReleasesWithReturn(Releases input) throws Exception;

    public void addReleases(Releases input) throws Exception;
}
