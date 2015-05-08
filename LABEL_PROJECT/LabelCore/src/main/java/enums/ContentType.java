package enums;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Jackson on 08.05.2015.
 */
public enum ContentType {
    XML("text/xml;charset=UTF-8"),
    JSON("application/json");

    private String type;

    private ContentType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static ContentType parseContentType(HttpServletRequest request) {
        if (ContentType.JSON.getType().equals(request.getContentType())) {
            return ContentType.JSON;
        }
        return ContentType.XML;
    }
}
