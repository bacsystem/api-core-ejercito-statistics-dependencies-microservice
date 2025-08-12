package pe.mil.ejercito.microservice.controllers.contracts;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import pe.mil.ejercito.lib.repository.dtos.BrigadeDto;
import pe.mil.ejercito.lib.utils.constants.CategoryRestConstant;
import pe.mil.ejercito.lib.utils.dto.base.ResponseBase;
import reactor.core.publisher.Mono;

/**
 * IBrigadeController
 * <p>
 * IBrigadeController interface.
 * <p>
 * THIS COMPONENT WAS BUILT ACCORDING TO THE DEVELOPMENT STANDARDS
 * AND THE EJERCITO DEL PERÚ APPLICATION DEVELOPMENT PROCEDURE AND IS PROTECTED
 * BY THE LAWS OF INTELLECTUAL PROPERTY AND COPYRIGHT...
 *
 * @author ejercito
 * @author cbaciliod@ejercito.mil.pe
 * @since 25/02/2024
 */
public interface IBrigadeController {

    @Operation(summary = "Returns the status Brigade iterable", description = CategoryRestConstant.CATEGORY_GENERAL_DESCRIPTION, tags = {CategoryRestConstant.CATEGORY_GENERAL})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = BrigadeDto.class))),
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = ResponseBase.class), examples = {
                            @ExampleObject(description = "This successful response"),
                            @ExampleObject(description = "This error response")
                    })),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = HttpHeaders.ACCEPT, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE),
            @ApiImplicitParam(name = HttpHeaders.CONTENT_TYPE, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE)
    })
    Mono<ResponseEntity<Object>> doOnFindAllExecute(String division, String status, String limit, String page);

    @Operation(summary = "Returns the status Brigade by id", description = CategoryRestConstant.CATEGORY_GENERAL_DESCRIPTION, tags = {CategoryRestConstant.CATEGORY_GENERAL})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = BrigadeDto.class))),
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = ResponseBase.class), examples = {
                            @ExampleObject(description = "This successful response"),
                            @ExampleObject(description = "This error response")
                    })),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = HttpHeaders.ACCEPT, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE),
            @ApiImplicitParam(name = HttpHeaders.CONTENT_TYPE, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE)
    })
    Mono<ResponseEntity<Object>> doOnFindByIdExecute(Long id);

    @Operation(summary = "Returns the status Brigade by uuId", description = CategoryRestConstant.CATEGORY_GENERAL_DESCRIPTION, tags = {CategoryRestConstant.CATEGORY_GENERAL})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = BrigadeDto.class))),
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = ResponseBase.class), examples = {
                            @ExampleObject(description = "This successful response"),
                            @ExampleObject(description = "This error response")
                    })),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = HttpHeaders.ACCEPT, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE),
            @ApiImplicitParam(name = HttpHeaders.CONTENT_TYPE, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE)
    })
    Mono<ResponseEntity<Object>> doOnFindByUuIdExecute(String uuid);

    @Operation(summary = "Returns the status Brigade created", description = CategoryRestConstant.CATEGORY_GENERAL_DESCRIPTION, tags = {CategoryRestConstant.CATEGORY_GENERAL})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = BrigadeDto.class))),
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = ResponseBase.class), examples = {
                            @ExampleObject(description = "This successful response"),
                            @ExampleObject(description = "This error response")
                    })),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = HttpHeaders.ACCEPT, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE),
            @ApiImplicitParam(name = HttpHeaders.CONTENT_TYPE, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE)
    })
    Mono<ResponseEntity<Object>> doOnCreateExecute(BrigadeDto dto);

    @Operation(summary = "Returns the status Brigade updated", description = CategoryRestConstant.CATEGORY_GENERAL_DESCRIPTION, tags = {CategoryRestConstant.CATEGORY_GENERAL})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = BrigadeDto.class))),
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = ResponseBase.class), examples = {
                            @ExampleObject(description = "This successful response"),
                            @ExampleObject(description = "This error response")
                    })),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = HttpHeaders.ACCEPT, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE),
            @ApiImplicitParam(name = HttpHeaders.CONTENT_TYPE, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE)
    })
    Mono<ResponseEntity<Object>> doOnUpdateExecute(BrigadeDto dto);

    @Operation(summary = "Returns true to deleted", description = CategoryRestConstant.CATEGORY_GENERAL_DESCRIPTION, tags = {CategoryRestConstant.CATEGORY_GENERAL})
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = BrigadeDto.class))),
            @ApiResponse(
                    responseCode = "200",
                    description = "Successful operation",
                    content = @Content(schema = @Schema(implementation = ResponseBase.class), examples = {
                            @ExampleObject(description = "This successful response"),
                            @ExampleObject(description = "This error response")
                    })),
    })
    @ApiImplicitParams({
            @ApiImplicitParam(name = HttpHeaders.ACCEPT, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE),
            @ApiImplicitParam(name = HttpHeaders.CONTENT_TYPE, value = MediaType.APPLICATION_JSON_VALUE, required = true, paramType = "header", dataTypeClass = String.class, defaultValue = MediaType.APPLICATION_JSON_VALUE)
    })
    Mono<ResponseEntity<Object>> doOnDeleteExecute(String uuid);
}