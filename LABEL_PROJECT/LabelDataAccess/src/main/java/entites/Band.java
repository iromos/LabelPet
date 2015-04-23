package entites;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Jack on 14.04.2015.
 */
@Entity
@Table(name = "band")
public class Band {
    private Integer bandId;
    private String name;
    private String country;

    public Band() {

    }

    public Band(Integer bandId, String name, String country) {
        this.bandId = bandId;
        setName(name);
        setCountry(country);
    }

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "band_id")
    public Integer getId() {
        return bandId;
    }


    @Id
    public void setId(Integer bandId) {
        this.bandId = bandId;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "name")
    public void setName(String name) {
        if (name == null) {
            return;
        }
        this.name = name.toUpperCase();
    }

    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    @Column(name = "country")
    public void setCountry(String country) {
        if (country == null) {
            return;
        }
        this.country = country.toUpperCase();
    }

    @Override
    public String toString() {
        return "Band{" +
                "bandId=" + bandId +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
