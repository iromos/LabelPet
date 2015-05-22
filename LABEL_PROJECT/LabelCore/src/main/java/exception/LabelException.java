package exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Jackson on 22.05.2015.
 */
@XmlRootElement(name = "LabelException")
public class LabelException extends Exception {

    public LabelException(String message) {
        super(message);
    }

    public LabelException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    @XmlElement(name = "Message")
    public String getMessage() {
        return super.getMessage();
    }
}
