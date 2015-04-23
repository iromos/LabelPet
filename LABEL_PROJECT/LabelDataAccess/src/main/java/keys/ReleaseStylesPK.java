package keys;

import javax.persistence.Column;
import java.io.Serializable;

/**
 * Created by Jack on 21.04.2015.
 */
public class ReleaseStylesPK  implements Serializable {
    @Column(name = "release_id")
    private Integer releaseId;
    private String style;

    public ReleaseStylesPK() {
    }

    public ReleaseStylesPK(Integer releaseId, String style) {
        this.releaseId = releaseId;
        this.style = style;
    }
}
