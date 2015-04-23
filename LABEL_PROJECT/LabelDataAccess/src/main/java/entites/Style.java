package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jack on 14.04.2015.
 */
@Entity
@Table(name="styles")
public class Style {

    private String style;
    private String descr;

    public Style() {
    }

    @Id
    @Column(name = "style")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
    @Column(name = "descr")
    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Style{" +
                "style='" + style + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
