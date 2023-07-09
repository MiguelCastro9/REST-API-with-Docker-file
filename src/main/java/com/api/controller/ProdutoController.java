package com.api.controller;

import com.api.dto.ProdutoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel Castro
 */
@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @PostMapping
    public ResponseEntity<ProdutoDto> enviar() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
