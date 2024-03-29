package com.siddartha.primesservices.controller;

import com.siddartha.primesservices.services.IPrimeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/primes")
@AllArgsConstructor
public class PrimeController {

    IPrimeService primeService;

    @GetMapping("/{n}")
    public boolean isPrime(@PathVariable long n) {
        return primeService.isPrime(n);
    }

}
