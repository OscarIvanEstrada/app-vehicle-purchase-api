package com.example.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "CustomerRequestDTO Description")
public class CustomerRequestDTO {

    @ApiModelProperty(value = "Data Exmaple for CustomerRequestDTO", required = true, example = "customerId")
    private String customerId;
	
    @ApiModelProperty(value = "Data Exmaple for CustomerRequestDTO", required = true, example = "name")
    private String name;
	
    @ApiModelProperty(value = "Data Exmaple for CustomerRequestDTO", required = true, example = "email")
    private String email;
	
    @ApiModelProperty(value = "Data Exmaple for CustomerRequestDTO", required = true, example = "phoneNumber")
    private String phoneNumber;
	
}
