package Utils.CommonApproach;

import Elements.UIElement;
import Pages.BasePage;
import lombok.extern.log4j.Log4j;

import java.lang.reflect.Method;

@Log4j
public class IdentificatorReader {

    private final BasePage page;

    public IdentificatorReader(String page) throws Exception {
        this.page = Pages.getCachedPageObject(page);
    }

    /**
     * @param idAnnotation Element annotation provided in page object for each element
     * @return method which can be useed
     * @throws NoSuchMethodException if no method is found by idAnnotation
     */
    private Method getMethod(String idAnnotation) throws NoSuchMethodException {
        Class<? extends BasePage> pageClass = page.getClass();
        return getMethod(idAnnotation, pageClass);
    }

    private Method getMethod(String idAnnotation, Class<?> pageClass) throws NoSuchMethodException {
        for (Method method : pageClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Identificator.class)) {
                Identificator annotation = method.getAnnotation(Identificator.class);
                log.debug("Annotation is " + annotation.id());

                if (annotation.id().equals(idAnnotation)) {
                    log.debug("Method name " + method.getName());
                    log.debug("Method name " + method.getReturnType());
                    return method;
                }
            }
        }

        Class<?> pageSuperClass = pageClass.getSuperclass();
        if (pageSuperClass != null && !pageSuperClass.equals(BasePage.class)) {
            log.debug("Wil look into Superclass " + pageSuperClass.getName() + "for method annotated with " + idAnnotation);
            return getMethod(idAnnotation, pageSuperClass);
        }

        Class<?>[] interfaces = pageClass.getInterfaces();
        for (Class<?> pageInterface : interfaces) {
            log.debug("Will look into interfaces " + pageInterface.getName() + "for method annotated with " + idAnnotation);
            try {
                return getMethod(idAnnotation, pageInterface);
            } catch (NoSuchMethodException e) {
                log.debug("Element by annotation '" + idAnnotation + "' is not found in interface " + pageInterface.getName());
            }
        }
        throw new NoSuchMethodException("Desired method by annotation '" + idAnnotation + " is not found");
    }


    public <T extends UIElement> T getUIElement(String annotation, Class<T> elementType) throws Exception {
        Method method = getMethod(annotation);
        //noinspection unchecked
        return (T) method.invoke(page);
    }

    public <V, T extends UIElement> T getUIElementWithVariables(String annotation, Class<T> elementType, Object variableType) throws Exception {
        Method method = getMethod(annotation);
        //noinspection unchecked
        return (T) method.invoke(page, variableType);
    }

    public String getElementType(String annotation) throws Exception {
        Method method = getMethod(annotation);
        log.debug("Element type");
        return method.getReturnType().toString();
    }

    public void executeMethod(String annotation) throws Exception {
        Method method = getMethod(annotation);
        method.invoke(page);
    }

}