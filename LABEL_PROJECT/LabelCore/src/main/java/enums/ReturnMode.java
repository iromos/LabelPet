package enums;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Jack on 07.05.2015.
 */
@XmlType(name = "return_mode")
@XmlEnum
public enum ReturnMode {
    NONE, RELEASES;

    public String value() {
        return name();
    }

    public static ReturnMode fromValue(String value) {
        return valueOf(value);
    }
}
