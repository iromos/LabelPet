package data;

import exception.LabelException;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by Jackson on 08.05.2015.
 */
@XmlRootElement(name = "doc")
public class Bands {

    private List<BandPOJO> bands;
    private List<LabelException> exceptions;

    @XmlElement(name = "band")
    @XmlElementWrapper(name = "bands")
    public List<BandPOJO> getBands() {
        return bands;
    }

    public void setBands(List<BandPOJO> bands) {
        this.bands = bands;
    }


    @XmlElement(name = "LabelError")
    @XmlElementWrapper(name = "Errors")
    public List<LabelException> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<LabelException> exceptions) {
        this.exceptions = exceptions;
    }

    @Override
    public String toString() {
        return "Bands=" + bands;
    }
}
