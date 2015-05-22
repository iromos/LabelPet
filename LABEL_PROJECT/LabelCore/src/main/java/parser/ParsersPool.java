package parser;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Jackson on 22.05.2015.
 */
public class ParsersPool {

    private static ConcurrentLinkedQueue<LabelParserXML> handlersPool = new ConcurrentLinkedQueue<LabelParserXML>();

    public static LabelParser getXMLParser() {
        LabelParserXML parser = handlersPool.poll();
        if (parser == null) {
            return new LabelParserXML();
        }
        return parser;
    }

    public static void putXMLParser(LabelParserXML parserXML) {
        handlersPool.add(parserXML);
    }

}
