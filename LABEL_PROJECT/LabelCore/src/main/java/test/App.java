package test;

import data.BandPOJO;
import data.Bands;
import data.ReleasePOJO;
import data.StylePOJO;
import enums.ReturnMode;
import parser.LabelParser;
import parser.LabelParserXML;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jackson on 08.05.2015.
 */
public class App {


    public static void main(String[] args) {
        String print = print();
        parse(print);
    }

    private static String print() {
        List<BandPOJO> list = new ArrayList<BandPOJO>();
        list.add(formingBandAria());
        list.add(formingBandPriest());
        Bands bands = new Bands();
        bands.setBands(list);
        LabelParser parser = new LabelParserXML();
        OutputStream outputStream = new ByteArrayOutputStream();
        String answer = null;
        try {
            parser.formAnswer(bands, outputStream);
            answer = outputStream.toString();
            System.out.println(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return answer;
    }

    private static void parse(String string) {
        InputStream inputStream = new ByteArrayInputStream(string.getBytes());
        LabelParser parser = new LabelParserXML();
        try {
            Bands bands = (Bands) parser.getObject(inputStream, Bands.class);

            System.out.println(bands.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static BandPOJO formingBandAria() {
        BandPOJO aria = new BandPOJO();
        aria.setBandId(2);
        aria.setCountry("RU");
        aria.setName("ARIA");
        aria.setReturnMode(ReturnMode.RELEASES);
        List<ReleasePOJO> rel = new ArrayList<ReleasePOJO>();
        ReleasePOJO majesty = new ReleasePOJO();
        majesty.setReleaseId(2);
        majesty.setBandId(2);
        majesty.setTitle("Mania of majesty");
        majesty.setType("LP");
        majesty.setStyles(new ArrayList<StylePOJO>());
        rel.add(majesty);
        ReleasePOJO game = new ReleasePOJO();
        game.setReleaseId(2);
        game.setBandId(2);
        game.setTitle("Play with fire");
        game.setType("LP");
        rel.add(game);
        aria.setReleases(rel);
        return aria;
    }

    private static BandPOJO formingBandPriest() {
        BandPOJO priest = new BandPOJO();
        priest.setBandId(2);
        priest.setCountry("UK");
        priest.setName("JUDAS PRIEST");
        priest.setReturnMode(ReturnMode.NONE);
        List<ReleasePOJO> rel = new ArrayList<ReleasePOJO>();
        ReleasePOJO majesty = new ReleasePOJO();
        majesty.setReleaseId(2);
        majesty.setBandId(2);
        majesty.setTitle("Painkiller");
        majesty.setType("LP");
        majesty.setStyles(new ArrayList<StylePOJO>());
        rel.add(majesty);
        ReleasePOJO game = new ReleasePOJO();
        game.setReleaseId(2);
        game.setBandId(2);
        game.setTitle("Jugulator");
        game.setType("LP");
        game.setStyles(new ArrayList<StylePOJO>());
        rel.add(game);
        priest.setReleases(rel);
        return priest;
    }
}
