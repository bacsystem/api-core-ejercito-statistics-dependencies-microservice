package pe.mil.ejercito.microservice.components.configuration;

import lombok.experimental.UtilityClass;
import lombok.extern.log4j.Log4j2;

/**
 * DataBaseContextHolder
 * <p>
 * DataBaseContextHolder class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil.pe
 * @since 25/02/2024
 */
@UtilityClass
@Log4j2
public class DataBaseContextHolder {

    private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

    public static String getCurrentDatabase() {
        log.debug("init get current database");
        return contextHolder.get();
    }

    public static void setCurrentDatabase(String key) {
        log.debug("init set current database");
        contextHolder.set(key);
    }

    public static void removeCurrentDatabase() {
        log.debug("init remove current database");
        contextHolder.remove();
    }
}


