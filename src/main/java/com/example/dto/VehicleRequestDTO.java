package com.example.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "VehicleRequestDTO Description")
public class VehicleRequestDTO {

    @ApiModelProperty(value = "Data Exmaple for VehicleRequestDTO", required = true, example = "vin")
    private String vin;
	
    @ApiModelProperty(value = "Data Exmaple for VehicleRequestDTO", required = true, example = "make")
    private String make;
	
    @ApiModelProperty(value = "Data Exmaple for VehicleRequestDTO", required = true, example = "model")
    private String model;
	
    @ApiModelProperty(value = "Data Exmaple for VehicleRequestDTO", required = true, example = "year")
    private String year;
	
    @ApiModelProperty(value = "Data Exmaple for VehicleRequestDTO", required = true, example = "price")
    private String price;
	
}
