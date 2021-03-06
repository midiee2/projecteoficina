/**
 * NOTE: This class is auto generated by the swagger code generator program (1.0.11).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Lloc;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-02-22T16:17:54.505Z")

@Api(value = "lloc", description = "the lloc API")
public interface LlocApi {

    @ApiOperation(value = "afegeix un lloc a la base de dades", nickname = "addLloc", notes = "Afegeix un lloc al sistema", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "item creat"),
        @ApiResponse(code = 400, message = "dades invalides, objecte invalides"),
        @ApiResponse(code = 409, message = "aquest lloc ja existeix") })
    @RequestMapping(value = "/lloc",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addLloc(@ApiParam(value = "Instancia de lloc afegit"  )  @Valid @RequestBody Lloc objecteLloc);


    @ApiOperation(value = "Cerca lloc per ID", nickname = "getLlocById", notes = "Retorna un unic lloc", response = Lloc.class, tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Tot correcte", response = Lloc.class),
        @ApiResponse(code = 400, message = "Id invalida"),
        @ApiResponse(code = 404, message = "Lloc no trobat") })
    @RequestMapping(value = "/lloc/{idLloc}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Lloc> getLlocById(@ApiParam(value = "ID del lloc a retornar",required=true) @PathVariable("idLloc") Integer idLloc);


    @ApiOperation(value = "cerca tots els llocs", nickname = "getLlocs", notes = "Retorna tots els llocs de la base de dades ", response = Lloc.class, responseContainer = "List", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retorna correctament tots els llocs", response = Lloc.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "Error de conexio") })
    @RequestMapping(value = "/lloc",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Lloc>> getLlocs();


    @ApiOperation(value = "Actualitza un lloc", nickname = "updateLloc", notes = "", tags={ "admins", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Id no valida"),
        @ApiResponse(code = 404, message = "Lloc no trobat"),
        @ApiResponse(code = 405, message = "Excepcio de validacio") })
    @RequestMapping(value = "/lloc",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateLloc(@ApiParam(value = "Objecte Lloc que sha de modificar" ,required=true )  @Valid @RequestBody Lloc body);

}
