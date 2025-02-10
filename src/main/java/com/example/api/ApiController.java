package com.example.api;


import com.example.util.*;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.business.ControllerBusiness;

import com.example.dto.*;
import com.example.model.*;
import java.util.List;

@RestController
@ApiResponses(value = {
        @ApiResponse(code = 200, message = "Accion exitosa"),
        @ApiResponse(code = 500, message = "Internal Server Error")
})
@Api(value = "app-vehicle-purchase-api ApiController", description = "Application for purchasing vehicles.",  tags = {"",""})
public class ApiController {

    @Autowired
    ControllerBusiness controllerBusiness;

	@Value("${spring.application.version}")
	private String version;

	@GetMapping("version")
    public ResponseEntity<String> version() {
        return new ResponseEntity(version, HttpStatus.OK);
    }




	@ApiOperation(value = "Obtener lista de Vehicle", notes = "Retorna listado de Vehicle del sistema xxxxx")
	@GetMapping("vehicle")
    public List<VehicleResponseDTO> getVehicle() {
       return MapperUtil.mapAll(controllerBusiness.getDataVehicle(),VehicleResponseDTO.class);
    }

	@PostMapping("vehicle")
    public ResponseEntity<VehicleRequestDTO> putVehicle(@RequestBody VehicleRequestDTO dto) {
		
		VehicleEntity data = MapperUtil.map(dto,VehicleEntity.class);
	    controllerBusiness.addDataVehicle(data);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

	@ApiOperation(value = "Obtener lista de Customer", notes = "Retorna listado de Customer del sistema xxxxx")
	@GetMapping("customer")
    public List<CustomerResponseDTO> getCustomer() {
       return MapperUtil.mapAll(controllerBusiness.getDataCustomer(),CustomerResponseDTO.class);
    }

	@PostMapping("customer")
    public ResponseEntity<CustomerRequestDTO> putCustomer(@RequestBody CustomerRequestDTO dto) {
		
		CustomerEntity data = MapperUtil.map(dto,CustomerEntity.class);
	    controllerBusiness.addDataCustomer(data);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

	@ApiOperation(value = "Obtener lista de Order", notes = "Retorna listado de Order del sistema xxxxx")
	@GetMapping("order")
    public List<OrderResponseDTO> getOrder() {
       return MapperUtil.mapAll(controllerBusiness.getDataOrder(),OrderResponseDTO.class);
    }

	@PostMapping("order")
    public ResponseEntity<OrderRequestDTO> putOrder(@RequestBody OrderRequestDTO dto) {
		
		OrderEntity data = MapperUtil.map(dto,OrderEntity.class);
	    controllerBusiness.addDataOrder(data);
        return new ResponseEntity(dto, HttpStatus.OK);
    }

















}
