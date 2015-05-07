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
    @XmlElement(name = "band_id")
    private Integer bandId;
    @XmlAttribute(name = "return_mode")
    private ReturnMode returnMode;
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "country")
    private String country;
    @XmlElement(name = "releases")
    @XmlElementWrapper
    private List<ReleasePOJO> releases;

    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<ReleasePOJO> getReleases() {
        return releases;
    }

    public void setReleases(List<ReleasePOJO> releases) {
        this.releases = releases;
    }

    public ReturnMode getReturnMode() {
        return returnMode;
    }

    public void setReturnMode(ReturnMode returnMode) {
        this.returnMode = returnMode;
    }
}
