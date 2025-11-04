package com.eazybaniking.accounts.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDTO {

    @NotEmpty(message = "Account number can not be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account number",
            example = "2568123571"
    )
    private Long accountNumber;

    @NotEmpty(message = "Account Type can not be null or empty")
    @Schema(
            description = "Account Type",
            example = "SAVINGS"
    )
    private String accountType;

    @NotEmpty(message = "Branch Address can not be null or empty")
    @Schema(
            description = "Easy Bank branch address",
            example = "123 New York"
    )
    private String branchAddress;
}
