package com.example.springboottest.Controller;

import com.example.springboottest.Model.Demo;
import com.example.springboottest.Request.DemoRequest;
import com.example.springboottest.Service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
@RequiredArgsConstructor
public class DemoController {

    private final DemoService demoService;

    @PostMapping
    public ResponseEntity<Demo> createDemo(@RequestBody DemoRequest request) {
        return new ResponseEntity<>(
                demoService.createDemo(request.getValue()),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<Demo> getDemoById(@PathVariable String id) {
        return new ResponseEntity<>(
                demoService.getDemo(id),
                HttpStatus.OK
        );
    }

    @GetMapping
    public ResponseEntity<List<Demo>> getDemosByValue(@RequestParam String value) {
        return new ResponseEntity<>(
                demoService.getDemos(value),
                HttpStatus.OK
        );
    }

    @GetMapping("/spring-data")
    public ResponseEntity<List<Demo>> getDemosBySpringData(@RequestParam String value) {
        return new ResponseEntity<>(
                demoService.getDemosBySpringData(value),
                HttpStatus.OK
        );
    }


}
