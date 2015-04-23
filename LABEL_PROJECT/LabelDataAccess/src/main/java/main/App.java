package main;

import dao.ReleaseDAO;
import dao.ReleaseTypeDAO;
import dao.ReleasesStylesDAO;
import dao.StyleDAO;
import entites.Release;
import entites.ReleaseType;
import entites.ReleasesStyles;
import entites.Style;
import entrypoint.LabelDataAccess;
import entrypoint.LabelDirectoriesAccess;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by Jack on 21.04.2015.
 */
public class App {

    public static void main(String[] args) {
        ReleasesStylesDAO releaseDAO = LabelDataAccess.getInstance().getReleasesStylesDAO();
        ReleasesStyles releasesStyles2 = new ReleasesStyles(2, "METAL");
        try {
            releaseDAO.addStyleToRelease(releasesStyles2);

//            List<Release> releasesByBand = releaseDAO.getReleasesByBand();
//            for ( Release rel : releasesByBand) {
//                System.out.println(rel.toString());
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
