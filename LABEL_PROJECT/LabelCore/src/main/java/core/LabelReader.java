package core;

import data.Bands;
import data.ReleaseTypes;
import data.Releases;
import data.Styles;

/**
 * Created by Jackson on 08.05.2015.
 */
public interface LabelReader  extends LabelHandler{

    public Bands getBands(Bands input) throws Exception;
    public Releases getReleases(Releases input) throws Exception;
    public ReleaseTypes getReleaseTypes(ReleaseTypes input) throws Exception;
    public Styles getStyles(Styles input) throws Exception;
}
