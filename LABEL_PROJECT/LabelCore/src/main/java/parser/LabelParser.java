package parser;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Jack on 07.05.2015.
 */
public interface LabelParser {
    /**
     * Получение заполненного объекта из запроса
     * @param request - пришедший запрос
     * @param neededClass - класс в который преобразовать
     * @return
     * @throws Exception
     */
    Object getObject(InputStream request, Class neededClass) throws Exception;

    /**
     * Формирование ответа нужного формата
     * @param pojo - обьект из которого будем формировать ответ
     * @return
     * @throws Exception
     */
    void formAnswer(Object pojo, OutputStream outputStream) throws Exception;
}
