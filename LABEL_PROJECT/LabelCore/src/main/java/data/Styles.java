package data;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

/**
 * Created by Jack on 07.05.2015.
 */
public class Styles {
    @XmlElement(name = "styles")
    @XmlElementWrapper
    private List<StylePOJO> styles;
}
