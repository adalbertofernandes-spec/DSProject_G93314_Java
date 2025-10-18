package com.example.Aula1710.dto;

import com.example.Aula1710.model.EnderecoModel;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClienteResquestDTO {
    
    //Valida a entrada de dados do cliente conforme os criterios.
    //A api aceitará os daods somente se atender os criterios.
    // Casa contrario retorna em jsonn uma das mensagens abaixo.

    @NotBlank(message = "O nome é obrigatorio")
    @Size(min = 3, message = "O nome deve ter no minimo 3 caracteres")
    private String nome;

    @NotBlank(message = "O email é obrigatorio")
    private String email;

    @NotBlank(message = "O telefone é obrigatorio")
    @Size(min = 11, message = "O telefone deve conter 11 digitos")
    private String telefone;

    @NotBlank(message = "Escolha a forma da forma de pagamento é obrigatoria")
    @Pattern(regexp = "CARTAO | DINHEIRO", message =  "O status deve ser um dos seguintes valores: CARTAO , DINHEIRO" )
    private String FormaPagamento;

    @NotBlank(message = "O campo de endereço é obrigatário")
    private EnderecoModel enderecoModel;
    
}
