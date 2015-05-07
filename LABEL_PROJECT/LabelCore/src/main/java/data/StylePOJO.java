package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlRootElement(name = "style")
public class StylePOJO {
    @XmlElement(name = "style_id")
    private String style;
    @XmlElement(name = "description")
    private String descr;

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}
