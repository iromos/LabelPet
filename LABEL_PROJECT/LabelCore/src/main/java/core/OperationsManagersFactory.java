package core;

import enums.ContentType;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Jackson on 08.05.2015.
 */
public class OperationsManagersFactory {

    private ConcurrentLinkedQueue<LabelHandler> handlersPool = new ConcurrentLinkedQueue<LabelHandler>();

    private static OperationsManagersFactory ourInstance = new OperationsManagersFactory();

    public static OperationsManagersFactory getInstance() {
        return ourInstance;
    }

    private OperationsManagersFactory() {
    }

    public LabelCreator getCreator() {
        return getHandler();
    }

    public LabelReader getReader() {
        return getHandler();
    }

    public LabelModifier getModifier() {
        return getHandler();
    }

    public void returnHandlerToPool(LabelHandler handler) {
        handlersPool.add(handler);
    }

    private OperationsManager getHandler() {
        LabelHandler handler = handlersPool.poll();
        if (handler == null) {
            return new OperationsManager();
        }
        try {
            OperationsManager manager = (OperationsManager) handler;
            return manager;
        } catch (ClassCastException e) {
            return getHandler();
        }
    }
}
