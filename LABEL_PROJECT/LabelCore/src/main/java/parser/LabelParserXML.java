package parser;

import exception.LabelParserException;
import exception.LabelParserXMLException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Jack on 07.05.2015.
 */
public class LabelParserXML implements LabelParser {
    /**
     * Получение заполненного объекта из запроса
     *
     * @param request     - пришедший запрос
     * @param neededClass - класс в который преобразовать
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject(InputStream request, Class neededClass) throws Exception {
        try {
            JAXBContext context = JAXBContext.newInstance(neededClass);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Object object = unmarshaller.unmarshal(request);
            return object;
        } catch (JAXBException ex) {
            handleJAXBException(ex);
        }
        throw new LabelParserXMLException("Unknown XML Parser Exception", new Exception());
    }

    /**
     * Формирование ответа нужного формата
     *
     * @param pojo - обьект из которого будем формировать ответ
     * @return
     * @throws Exception
     */
    @Override
    public void formAnswer(Object pojo, OutputStream outputStream) throws Exception {
        try {
            JAXBContext context = JAXBContext.newInstance(pojo.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.marshal(pojo,outputStream);
        } catch (JAXBException ex) {
            handleJAXBException(ex);
        }
    }

    private void handleJAXBException(JAXBException ex) throws LabelParserException{
        String message = ex.getMessage();
        if (message == null) {
            message = ex.getCause().getMessage();
            if (message == null) {
                message = "Unidentified JAXB error";
            }

        }
        throw new LabelParserXMLException(message, ex);
    }
}
