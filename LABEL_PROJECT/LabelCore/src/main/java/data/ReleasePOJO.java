package data;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlRootElement(name = "release")
public class ReleasePOJO {

    private Integer bandId;
    private Integer releaseId;
    private String key;
    private String title;
    private Integer year;
    private String type;
    private List<StylePOJO> styles;

    @XmlElement(name = "band_id")
    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    @XmlElement(name = "release_id")
    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    @XmlElement(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @XmlElement(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @XmlElement(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name = "style")
    @XmlElementWrapper(name = "styles")
    public List<StylePOJO> getStyles() {
        return styles;
    }

    public void setStyles(List<StylePOJO> styles) {
        this.styles = styles;
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
        return "ReleasePOJO{" +
                "bandId=" + bandId +
                ", releaseId=" + releaseId +
                ", title=" + title +
                ", year=" + year +
                ", type=" + type +
                ", styles=" + styles +
                '}';
    }
}
