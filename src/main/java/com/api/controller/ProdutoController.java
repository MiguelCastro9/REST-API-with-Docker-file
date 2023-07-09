package com.api.controller;

import com.api.dto.ProdutoDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel Castro
 */
@RestController
@RequestMapping("/produto")
@Tag(name = "Produto controller")
public class ProdutoController {

    @PostMapping
    @Operation(description = "Enviar produto")
    public ResponseEntity<ProdutoDto> enviar(@RequestBody ProdutoDto produtoDto) {
        System.out.println(produtoDto);
        return new ResponseEntity(HttpStatus.OK);
    }
}
