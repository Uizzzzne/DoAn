package com.app.service.impl;

import com.app.dto.BrandDto;
import com.app.entity.Brand;
import com.app.repository.BrandRepository;
import com.app.service.BrandService;
import com.app.transfer.BrandTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private BrandTransfer brandTransfer;

    @Override
    public List<BrandDto> findAll() {
        return brandRepository.findAll()
                .stream()
                .map(brand -> brandTransfer.toDto(brand))
                .collect(Collectors.toList());
    }

    @Override
    public BrandDto findById(Integer id) {
        return null;
    }

    @Override
    public BrandDto insert(BrandDto brandDto) {
        return null;
    }

    @Override
    public BrandDto update(BrandDto brandDto) {
        return null;
    }

    @Override
    public boolean deleteById(Integer id) {
        return false;
    }
}
