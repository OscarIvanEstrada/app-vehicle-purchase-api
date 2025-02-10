package com.example.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "CustomerResponseDTO Description")
public class CustomerResponseDTO {

    @ApiModelProperty(value = "Data Exmaple for CustomerResponseDTO", required = true, example = "customerId")
    private String customerId;

    @ApiModelProperty(value = "Data Exmaple for CustomerResponseDTO", required = true, example = "name")
    private String name;

    @ApiModelProperty(value = "Data Exmaple for CustomerResponseDTO", required = true, example = "email")
    private String email;

    @ApiModelProperty(value = "Data Exmaple for CustomerResponseDTO", required = true, example = "phoneNumber")
    private String phoneNumber;

}
