package pe.mil.ejercito.microservice.controllers.implementations;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.WebExchangeBindException;
import pe.mil.ejercito.lib.repository.dtos.BrigadeDto;
import pe.mil.ejercito.lib.repository.services.contracts.IBrigadeDomainService;
import pe.mil.ejercito.lib.utils.controllers.base.ReactorControllerBase;
import pe.mil.ejercito.lib.utils.dto.*;
import pe.mil.ejercito.microservice.controllers.contracts.IBrigadeController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

import static pe.mil.ejercito.microservice.constants.LoggerConstant.*;
import static pe.mil.ejercito.microservice.constants.ProcessConstant.*;

/**
 * BrigadeController
 * <p>
 * BrigadeController class.
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
@RequestMapping(path = MICROSERVICE_PATH_CONTEXT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class BrigadeController extends ReactorControllerBase implements IBrigadeController {

    private final IBrigadeDomainService service;

    public BrigadeController(final Response response, IBrigadeDomainService service) {
        super(response, "BrigadeController");
        this.service = service;
    }

    @Override
    @GetMapping(path = FIND_ALL_BRIGADE_PATH,
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnFindAllExecute(@RequestParam(required = false) String division,
                                                           @RequestParam(required = false) String status,
                                                           @RequestParam(required = false, defaultValue = "10") String limit,
                                                           @RequestParam(required = false, defaultValue = "1") String page) {

        final PageableDto pageableBrigade = PageableDto.builder().build();
        return this.service.getAllEntities(division, status, limit, page, pageableBrigade)
                .flatMap(current -> super.response(ProcessResponse.success(new PageableResponse<>(current, MetadataDto.builder()
                        .pageable(pageableBrigade)
                        .build()))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_FIND_ALL_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @GetMapping(path = FIND_BY_ID_BRIGADE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnFindByIdExecute(@PathVariable(value = "id") Long id) {
        return this.service.getByIdEntity(id)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_FIND_BY_ID_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));

    }

    @Override
    @GetMapping(path = FIND_BY_UUID_BRIGADE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnFindByUuIdExecute(@PathVariable(value = "uuid") String uuid) {
        return this.service.getByUuIdEntity(uuid)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_FIND_BY_UUID_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @PostMapping(path = CREATE_BRIGADE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnCreateExecute(@RequestBody @Valid BrigadeDto dto) {
        return this.service.saveEntity(dto)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_CREATE_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @PutMapping(path = UPDATE_BRIGADE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnUpdateExecute(@RequestBody @Valid BrigadeDto dto) {
        return this.service.updateEntity(dto)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_UPDATE_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }

    @Override
    @DeleteMapping(path = DELETE_BRIGADE_PATH, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ResponseEntity<Object>> doOnDeleteExecute(@PathVariable(value = "uuid") String uuid) {
        return this.service.deleteByUuIdEntity(uuid)
                .flatMap(current -> super.response(ProcessResponse.success(new GenericResponse<>(current))))
                .onErrorResume(WebExchangeBindException.class, Mono::error)
                .doOnSuccess(success -> log.debug(MICROSERVICE_CONTROLLER_DOMAIN_ENTITY_DELETE_FORMAT_SUCCESS))
                .doOnError(throwable -> log.error(throwable.getMessage()));
    }
}