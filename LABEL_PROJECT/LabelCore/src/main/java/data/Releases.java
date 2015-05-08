package data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jackson on 08.05.2015.
 */
@XmlRootElement(name = "doc")
public class Releases {
    private List<ReleasePOJO> releases;
    @XmlElement(name = "release")
    @XmlElementWrapper(name = "releases")
    public List<ReleasePOJO> getReleases() {
        return releases;
    }

    public void setReleases(List<ReleasePOJO> releases) {
        this.releases = releases;
    }
    @Override
    public String toString() {
        return "Releases=" + releases;
    }
}
