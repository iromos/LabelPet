package adapter;

import data.BandPOJO;
import data.ReleasePOJO;
import data.StylePOJO;
import entites.Band;
import entites.Release;
import entites.ReleasesStyles;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jackson on 19.05.2015.
 */
public class EntitiesAdapter {

    public static Band getBandFromPOJO(BandPOJO pojo) {
        Band band = new Band();
        band.setName(pojo.getName());
        band.setCountry(pojo.getCountry());
        if (pojo.getBandId() != null) {
            band.setId(pojo.getBandId());
        }
        return band;
    }

    public static List<Band> getBandsFromPOJO(List<BandPOJO> pojoList) {
        List<Band> bands = new ArrayList<Band>(pojoList.size() * 2);
        for (BandPOJO pojo : pojoList) {
            bands.add(getBandFromPOJO(pojo));
        }
        return bands;
    }


    public static Release getReleaseFromPOJO(ReleasePOJO pojo, Integer bandId) {
        Release release = new Release();
        release.setTitle(pojo.getTitle());
        release.setType(pojo.getType());
        release.setYear(pojo.getYear());
        release.setBandId(chooseId(pojo.getBandId(), bandId));
        if (pojo.getReleaseId() != null) {
            release.setReleaseId(pojo.getReleaseId());
        }
        return release;
    }

    public static List<Release> getReleasesFromPOJO(List<ReleasePOJO> pojoList, Integer bandId) {
        List<Release> releases = new ArrayList<Release>(pojoList.size() * 2);
        for (ReleasePOJO pojo : pojoList) {
            releases.add(getReleaseFromPOJO(pojo, bandId));
        }
        return releases;
    }

    public static List<ReleasesStyles> getReleaseStylesFromPOJO(ReleasePOJO pojo, Integer releaseId) {
        List<ReleasesStyles> styles = new ArrayList<ReleasesStyles>();
        Integer id = chooseId(pojo.getReleaseId(), releaseId);
        for (StylePOJO stylePOJO : pojo.getStyles()) {
            styles.add(formStyle(stylePOJO.getStyle(), id));

        }
        return styles;
    }

    public static ReleasesStyles formStyle(String style, Integer releaseId) {
        ReleasesStyles releasesStyle = new ReleasesStyles();
        releasesStyle.setStyle(style);
        releasesStyle.setReleaseId(releaseId);
        return releasesStyle;
    }

    private static Integer chooseId(Integer fromPojo, Integer standalone) {
        if (standalone == null) {
            return fromPojo;
        }
        return standalone;
    }

}
