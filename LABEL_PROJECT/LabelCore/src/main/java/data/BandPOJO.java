package data;

import enums.ReturnMode;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlRootElement(name = "band")
public class BandPOJO {

    private Integer bandId;
    private ReturnMode returnMode;
    private String key;
    private String name;
    private String country;
    private List<ReleasePOJO> releases;

    @XmlElement(name = "band_id")
    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    @XmlElement(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @XmlElement(name = "release")
    @XmlElementWrapper(name = "releases")
    public List<ReleasePOJO> getReleases() {
        return releases;
    }

    public void setReleases(List<ReleasePOJO> releases) {
        this.releases = releases;
    }

    @XmlAttribute(name = "return_mode")
    public ReturnMode getReturnMode() {
        return returnMode;
    }

    public void setReturnMode(ReturnMode returnMode) {
        this.returnMode = returnMode;
    }

    @XmlAttribute(name = "key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "BandPOJO{" +
                "bandId=" + bandId +
                ", returnMode=" + returnMode +
                ", name=" + name +
                ", country=" + country +
                ", releases=" + releases +
                "}";
    }
}
