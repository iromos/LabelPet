package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlRootElement(name = "release_type")
public class ReleaseTypePOJO {

    private String type;
    private String descr;

    @XmlElement(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "description")
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "ReleaseTypePOJO{" +
                "type=" + type +
                ", descr=" + descr +
                '}';
    }
}
