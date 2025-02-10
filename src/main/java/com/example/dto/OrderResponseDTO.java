package com.example.dto;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "OrderResponseDTO Description")
public class OrderResponseDTO {

    @ApiModelProperty(value = "Data Exmaple for OrderResponseDTO", required = true, example = "orderId")
    private String orderId;

    @ApiModelProperty(value = "Data Exmaple for OrderResponseDTO", required = true, example = "customerId")
    private String customerId;

    @ApiModelProperty(value = "Data Exmaple for OrderResponseDTO", required = true, example = "vin")
    private String vin;

    @ApiModelProperty(value = "Data Exmaple for OrderResponseDTO", required = true, example = "2023-01-15")
    private Date orderDate;

    @ApiModelProperty(value = "Data Exmaple for OrderResponseDTO", required = true, example = "totalPrice")
    private String totalPrice;

}
