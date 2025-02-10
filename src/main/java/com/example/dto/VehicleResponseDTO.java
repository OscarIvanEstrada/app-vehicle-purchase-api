package com.example.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "VehicleResponseDTO Description")
public class VehicleResponseDTO {

    @ApiModelProperty(value = "Data Exmaple for VehicleResponseDTO", required = true, example = "vin")
    private String vin;

    @ApiModelProperty(value = "Data Exmaple for VehicleResponseDTO", required = true, example = "make")
    private String make;

    @ApiModelProperty(value = "Data Exmaple for VehicleResponseDTO", required = true, example = "model")
    private String model;

    @ApiModelProperty(value = "Data Exmaple for VehicleResponseDTO", required = true, example = "year")
    private String year;

    @ApiModelProperty(value = "Data Exmaple for VehicleResponseDTO", required = true, example = "price")
    private String price;

}
