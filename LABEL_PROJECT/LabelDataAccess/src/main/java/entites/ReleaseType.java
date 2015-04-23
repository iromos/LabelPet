package entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jack on 14.04.2015.
 */
@Entity
@Table(name = "release_type")
public class ReleaseType {
    private String type;
    private String descr;

    public ReleaseType() {
    }

    @Id
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "ReleaseType{" +
                "type='" + type + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
