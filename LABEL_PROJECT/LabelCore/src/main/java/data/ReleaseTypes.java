package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jack on 07.05.2015.
 */
public class ReleaseTypes {

    private List<ReleaseTypePOJO> releaseTypes;

    @XmlElement(name = "release_type")
    @XmlElementWrapper(name = "release_types")
    public List<ReleaseTypePOJO> getReleaseTypes() {
        return releaseTypes;
    }

    public void setReleaseTypes(List<ReleaseTypePOJO> releaseTypes) {
        this.releaseTypes = releaseTypes;
    }

    @Override
    public String toString() {
        return "ReleaseTypes=" + releaseTypes;
    }
}
