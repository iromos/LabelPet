package adapter;

import data.BandPOJO;
import data.ReleasePOJO;
import data.ReleaseTypePOJO;
import data.StylePOJO;
import entites.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jackson on 20.05.2015.
 */
public class POJOAdapter {

    public static BandPOJO getBandFromEntity(Band entity) {
        BandPOJO band = new BandPOJO();
        band.setName(entity.getName());
        band.setCountry(entity.getCountry());
        band.setBandId(entity.getId());
        return band;
    }


    public static List<BandPOJO> getBandsFromEntity(List<Band> entities) {
        List<BandPOJO> pojoList = new ArrayList<BandPOJO>(entities.size() * 2);
        for (Band band : entities) {
            pojoList.add(getBandFromEntity(band));
        }
        return pojoList;
    }


    public static ReleasePOJO getReleaseFromEntity(Release entity) {
        ReleasePOJO release = new ReleasePOJO();
        release.setTitle(entity.getTitle());
        release.setType(entity.getType());
        release.setYear(entity.getYear());
        release.setBandId(entity.getBandId());
        release.setReleaseId(entity.getReleaseId());
        return release;
    }

    public static List<ReleasePOJO> getReleasesFromEntity(List<Release> entities) {
        List<ReleasePOJO> releases = new ArrayList<ReleasePOJO>();
        for (Release release : entities) {
            releases.add(getReleaseFromEntity(release));
        }
        return releases;
    }

    public static List<StylePOJO> getReleaseStylesFromEntity(List<ReleasesStyles> entities) {
        List<StylePOJO> styles = new ArrayList<StylePOJO>();
        for (ReleasesStyles style : entities) {
            StylePOJO releasesStyle = new StylePOJO();
            releasesStyle.setStyle(style.getStyle());
            styles.add(releasesStyle);
        }
        return styles;
    }

    public static List<StylePOJO> getStylesFromEntities(List<Style> entities) {
        List<StylePOJO> styles = new ArrayList<StylePOJO>();
        for (Style style : entities) {
            StylePOJO releasesStyle = new StylePOJO();
            releasesStyle.setStyle(style.getStyle());
            releasesStyle.setDescr(style.getDescr());
            styles.add(releasesStyle);
        }
        return styles;
    }

    public static List<ReleaseTypePOJO> getReleaseTypesFromEntities(List<ReleaseType> entities) {
        List<ReleaseTypePOJO> types = new ArrayList<ReleaseTypePOJO>();
        for (ReleaseType type : entities) {
            ReleaseTypePOJO releasesType = new ReleaseTypePOJO();
            releasesType.setType(type.getType());
            releasesType.setDescr(type.getDescr());
            types.add(releasesType);
        }
        return types;
    }

}
