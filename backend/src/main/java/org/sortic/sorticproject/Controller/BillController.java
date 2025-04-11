package org.sortic.sorticproject.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bill")
public class BillController {

    @PostMapping("/getAllBill")
    public ResponseEntity<String> receiveSum(@RequestBody SumRequest request){

        return ResponseEntity.ok("");
    }

}
