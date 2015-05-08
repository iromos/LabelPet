package core;

import data.Bands;
import data.Releases;

/**
 * Created by Jackson on 08.05.2015.
 */
public interface LabelModifier extends LabelHandler {

    public Bands editBandsWithReturn(Bands input) throws Exception;

    public void editBands(Bands input) throws Exception;

    public Bands deleteBandsWithReturn(Bands input) throws Exception;

    public void deleteBands(Bands input) throws Exception;

    public Bands editReleasesWithReturn(Releases input) throws Exception;

    public void editReleases(Releases input) throws Exception;

    public Bands deleteReleasesWithReturn(Releases input) throws Exception;

    public void deleteReleases(Releases input) throws Exception;
}
