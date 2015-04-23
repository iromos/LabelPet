package entites;

import keys.ReleaseStylesPK;

import javax.persistence.*;

/**
 * Created by Jack on 14.04.2015.
 */
@Entity
@IdClass(ReleaseStylesPK.class)
@Table(name = "releases_styles")
public class ReleasesStyles {
    @Id
    private Integer releaseId;
    @Id
    private String style;

    public ReleasesStyles() {
    }

    public ReleasesStyles(Integer releaseId, String style) {
        this.releaseId = releaseId;
        setStyle(style);
    }

    @Column(name = "release_id")
    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    @Column(name = "style")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        if (style == null) {
            return;
        }
        this.style = style.toUpperCase();
    }

    @Override
    public String toString() {
        return "ReleasesStyles{" +
                "releaseId='" + releaseId + '\'' +
                ", style='" + style + '\'' +
                '}';
    }
}
