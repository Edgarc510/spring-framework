package com.myproject.service.impl;

import com.myproject.model.Organization;
import com.myproject.repository.OrganizationRepository;
import com.myproject.service.OrganizationService;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl implements OrganizationService {

    private final OrganizationRepository organizationRepository;

    public OrganizationServiceImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Organization create(Organization organization) {
        return organizationRepository.save(organization);
    }

    public Organization findById(Long organizationId) throws Exception {
        return organizationRepository.findById(organizationId).orElseThrow(() -> new Exception("No organization found"));
    }

    public void delete(Long organizationId) {
        organizationRepository.deleteById(organizationId);
    }

}
