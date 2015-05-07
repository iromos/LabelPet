package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlRootElement(name = "release_type")
public class ReleaseTypePOJO {
    @XmlElement(name = "type")
    private String type;
    @XmlElement(name = "description")
    private String descr;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
