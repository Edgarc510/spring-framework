package com.myproject.controller;

import com.myproject.model.Organization;
import com.myproject.service.OrganizationService;
import jakarta.annotation.security.RolesAllowed;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/organization")
public class OrganizationController {

    private final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @RolesAllowed({"ADMIN","USER"})
    @GetMapping("/{organizationId}")
    public ResponseEntity<Organization> getOrganization(@PathVariable("organizationId") Long organizationId) throws Exception {
        return ResponseEntity.ok(organizationService.findById(organizationId));
    }

    @RolesAllowed({"ADMIN","USER"})
    @PostMapping
    public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
        return ResponseEntity.status(HttpStatus.CREATED).body(organizationService.create(organization));
    }

    @RolesAllowed({"ADMIN"})
    @DeleteMapping("/{organizationId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLicense(@PathVariable("organizationId") Long organizationId) {
        organizationService.delete(organizationId);
    }

}
