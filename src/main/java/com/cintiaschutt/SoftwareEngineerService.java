package com.cintiaschutt;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepo;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepo) {
        this.softwareEngineerRepo = softwareEngineerRepo;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers() {
        return softwareEngineerRepo.findAll();
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepo.save(softwareEngineer);
    }

    public SoftwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepo.findById(id)
                .orElseThrow(() -> new IllegalStateException(id + " not found"));
    }
}
