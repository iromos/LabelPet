package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlRootElement(name = "band")
public class ReleasePOJO {
    @XmlElement(name = "band_id")
    private Integer bandId;
    @XmlElement(name = "release_id")
    private Integer releaseId;
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "year")
    private Integer year;
    @XmlElement(name = "type")
    private String type;
    @XmlElement(name = "styles")
    @XmlElementWrapper
    private List<StylePOJO> styles;

    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<StylePOJO> getStyles() {
        return styles;
    }

    public void setStyles(List<StylePOJO> styles) {
        this.styles = styles;
    }
}
