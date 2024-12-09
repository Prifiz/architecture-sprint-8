package com.architecture.sprint8.controller;

import com.architecture.sprint8.service.ReportServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequiredArgsConstructor
public class ReportController {

    private final ReportServiceImpl reportService;

    @GetMapping("/reports")
    @CrossOrigin("*")
    @PreAuthorize("hasRole('prothetic_user')")
    public ResponseEntity<?> getReports() {
        return ResponseEntity.ok(reportService.createReport());
    }
}
