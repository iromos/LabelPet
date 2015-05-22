package exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jackson on 22.05.2015.
 */
@XmlRootElement(name = "doc")
public class ExceptionAnswer {
    private List<LabelException> exceptions;

    @XmlElement(name = "LabelError")
    @XmlElementWrapper(name = "Errors")
    public List<LabelException> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<LabelException> exceptions) {
        this.exceptions = exceptions;
    }

    public void addException(LabelException ex) {
        if (exceptions == null) {
            exceptions = new ArrayList<LabelException>();
        }
        exceptions.add(ex);
    }
}
