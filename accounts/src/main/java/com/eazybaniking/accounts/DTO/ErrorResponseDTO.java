package com.eazybaniking.accounts.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "ErrorResponse",
        description = "Schema to hold error response information"
)
@Data
@AllArgsConstructor
public class ErrorResponseDTO {

    @Schema(
            description = "API path invoke by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error that happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message representing the error that happened"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing when the error happened"
    )
    private LocalDateTime errorDate;
}
