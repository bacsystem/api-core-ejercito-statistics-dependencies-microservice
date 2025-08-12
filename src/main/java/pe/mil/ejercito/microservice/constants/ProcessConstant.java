package pe.mil.ejercito.microservice.constants;

import lombok.experimental.UtilityClass;

/**
 * ProcessConstant
 * <p>
 * ProcessConstant class.
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
public class ProcessConstant {
    public static final String MICROSERVICE_PATH_CONTEXT = "";
    public static final String FIND_ALL_DIVISION_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/division-status";
    public static final String FIND_BY_ID_DIVISION_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/division-status/id/{id}/status";
    public static final String FIND_BY_UUID_DIVISION_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/division-status/uuid/{uuid}/status";
    public static final String CREATE_DIVISION_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/division-status/create";
    public static final String UPDATE_DIVISION_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/division-status/update";
    public static final String DELETE_DIVISION_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/division-status/delete/uuid/{uuid}/status";


    public static final String FIND_ALL_BRIGADE_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/brigade-status";
    public static final String FIND_BY_ID_BRIGADE_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/brigade-status/id/{id}/status";
    public static final String FIND_BY_UUID_BRIGADE_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/brigade-status/uuid/{uuid}/status";
    public static final String CREATE_BRIGADE_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/brigade-status/create";
    public static final String UPDATE_BRIGADE_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/brigade-status/update";
    public static final String DELETE_BRIGADE_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/brigade-status/delete/uuid/{uuid}/status";


    public static final String FIND_ALL_UNIT_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/unit-status";
    public static final String FIND_BY_ID_UNIT_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/unit-status/id/{id}/status";
    public static final String FIND_BY_UUID_UNIT_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/unit-status/uuid/{uuid}/status";
    public static final String CREATE_UNIT_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/unit-status/create";
    public static final String UPDATE_UNIT_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/unit-status/update";
    public static final String DELETE_UNIT_STATUS_PATH = MICROSERVICE_PATH_CONTEXT + "/unit-status/delete/uuid/{uuid}/status";


    public static final String FIND_ALL_DIVISION_PATH = MICROSERVICE_PATH_CONTEXT + "/divisions";
    public static final String FIND_BY_ID_DIVISION_PATH = MICROSERVICE_PATH_CONTEXT + "/divisions/id/{id}/division";
    public static final String FIND_BY_UUID_DIVISION_PATH = MICROSERVICE_PATH_CONTEXT + "/divisions/uuid/{uuid}/division";
    public static final String CREATE_DIVISION_PATH = MICROSERVICE_PATH_CONTEXT + "/divisions/create";
    public static final String UPDATE_DIVISION_PATH = MICROSERVICE_PATH_CONTEXT + "/divisions/update";
    public static final String DELETE_DIVISION_PATH = MICROSERVICE_PATH_CONTEXT + "/divisions/delete/uuid/{uuid}/division";


    public static final String FIND_ALL_BRIGADE_PATH = MICROSERVICE_PATH_CONTEXT + "/brigades";
    public static final String FIND_BY_ID_BRIGADE_PATH = MICROSERVICE_PATH_CONTEXT + "/brigades/id/{id}/brigade";
    public static final String FIND_BY_UUID_BRIGADE_PATH = MICROSERVICE_PATH_CONTEXT + "/brigades/uuid/{uuid}/brigade";
    public static final String CREATE_BRIGADE_PATH = MICROSERVICE_PATH_CONTEXT + "/brigades/create";
    public static final String UPDATE_BRIGADE_PATH = MICROSERVICE_PATH_CONTEXT + "/brigades/update";
    public static final String DELETE_BRIGADE_PATH = MICROSERVICE_PATH_CONTEXT + "/brigades/delete/uuid/{uuid}/brigade";


    public static final String FIND_ALL_UNIT_PATH = MICROSERVICE_PATH_CONTEXT + "/units";
    public static final String FIND_BY_ID_UNIT_PATH = MICROSERVICE_PATH_CONTEXT + "/units/id/{id}/unit";
    public static final String FIND_BY_UUID_UNIT_PATH = MICROSERVICE_PATH_CONTEXT + "/units/uuid/{uuid}/unit";
    public static final String CREATE_UNIT_PATH = MICROSERVICE_PATH_CONTEXT + "/units/create";
    public static final String UPDATE_UNIT_PATH = MICROSERVICE_PATH_CONTEXT + "/units/update";
    public static final String DELETE_UNIT_PATH = MICROSERVICE_PATH_CONTEXT + "/units/delete/uuid/{uuid}/unit";
}
