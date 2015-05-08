package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlRootElement(name = "style")
public class StylePOJO {

    private String style;

    private String descr;

    @XmlElement(name = "style_id")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
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
        return "StylePOJO{" +
                "style=" + style +
                ", descr=" + descr +
                '}';
    }
}
