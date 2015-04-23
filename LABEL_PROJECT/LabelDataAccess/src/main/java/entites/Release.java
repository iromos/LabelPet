package entites;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Jack on 14.04.2015.
 */
@Entity
@Table(name = "releases")
public class Release {
    private Integer bandId;
    private Integer releaseId;
    private String title;
    private Integer year;
    private String type;

    public Release() {
    }

    public Release(Integer bandId, Integer releaseId,  String title, Integer year, String type) {
        setBandId(bandId);
        setTitle(title); ;
        setYear(year);
        setType(type);
        setReleaseId(releaseId);
    }

    @Column(name = "band_id")
    public Integer getBandId() {
        return bandId;
    }

    public void setBandId(Integer bandId) {
        this.bandId = bandId;
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "release_id")
    public Integer getReleaseId() {
        return releaseId;
    }

    @Id
    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @Column(name = "title")
    public void setTitle(String title) {
        if(title == null){return;}
        this.title = title.toUpperCase();
    }

    @Column(name = "year")
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type == null){return;}
        this.type = type.toUpperCase();
    }

    @Override
    public String toString() {
        return "Release{" +
                "bandId=" + bandId +
                ", releaseId=" + releaseId +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", type='" + type + '\'' +
                '}';
    }
}
