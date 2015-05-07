package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jack on 07.05.2015.
 */
public class ReleaseTypes {
    @XmlElement(name = "release_types")
    @XmlElementWrapper
    private List<ReleaseTypePOJO> releaseTypes;
}
