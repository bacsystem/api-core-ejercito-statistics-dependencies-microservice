package pe.mil.ejercito.microservice.controllers.implementations;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.WebExchangeBindException;
import pe.mil.ejercito.lib.repository.dtos.UnitStatusDto;
import pe.mil.ejercito.lib.repository.services.contracts.IUnitStatusDomainService;
import pe.mil.ejercito.lib.utils.controllers.base.ReactorControllerBase;
import pe.mil.ejercito.lib.utils.dto.GenericResponse;
import pe.mil.ejercito.lib.utils.dto.ProcessResponse;
import pe.mil.ejercito.lib.utils.dto.Response;
import pe.mil.ejercito.microservice.controllers.contracts.IUnitStatusController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

import static pe.mil.ejercito.microservice.constants.LoggerConstant.*;
import static pe.mil.ejercito.microservice.constants.ProcessConstant.*;

/**
 * UnitStatusController
 * <p>
 * UnitStatusController class.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil.pe
 * @since 25/02/2024
 */


@Log4j2
@RestController
@RequestMapping(path = MICROSERVICE_PATH_CONTEXT, produces = MediaType.APPLICATION_JSON_VALUE)
public class UnitStatusController extends ReactorControllerBase implements IUnitStatusController {

    private final IUnitStatusDomainService service;

    public UnitStatusController(final Response response, IUnitStatusDomainService service) {
        super(response, "UnitStatusController");

        this.service = service;
    }

    @Override
    @GetMapping(path = FIND_ALL_UNIT_STATUS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnFindAllExecute() {
        return this.service.getAllEntities()
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @GetMapping(path = FIND_BY_ID_UNIT_STATUS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnFindByIdExecute(@PathVariable(value = "id") Long id) {
        return this.service.getByIdEntity(id)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_FIND_BY_ID_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));

    }

    @Override
    @GetMapping(path = FIND_BY_UUID_UNIT_STATUS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnFindByUuIdExecute(@PathVariable(value = "uuid") String uuid) {
        return this.service.getByUuIdEntity(uuid)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_FIND_BY_UUID_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @PostMapping(path = CREATE_UNIT_STATUS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnCreateExecute(@RequestBody @Valid UnitStatusDto dto) {
        return this.service.saveEntity(dto)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_CREATE_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @PutMapping(path = UPDATE_UNIT_STATUS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnUpdateExecute(@RequestBody @Valid UnitStatusDto dto) {
        return this.service.updateEntity(dto)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_UPDATE_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @DeleteMapping(path = DELETE_UNIT_STATUS_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnDeleteExecute(@PathVariable(value = "uuid") String uuid) {
        return this.service.deleteByUuIdEntity(uuid)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_DELETE_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}