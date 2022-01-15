package com.qik.challenge.service.impl;

import com.qik.challenge.model.Promotion;
import com.qik.challenge.repository.PromotionBaseRepository;
import com.qik.challenge.repository.PromotionRepository;
import com.qik.challenge.service.PromotionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PromotionServiceImpl implements PromotionService {

    private Logger LOGGER = LoggerFactory.getLogger(PromotionServiceImpl.class);

    @Autowired
    private PromotionRepository promotionRepository;

    @Override
    public List<Promotion> findAll() {
        List<Promotion> promotions = new ArrayList<>();
        promotionRepository.findAll().forEach(promotions::add);
        return promotions;
    }

    @Override
    public Promotion findById(Long id) {
        return promotionRepository.findById(id).orElse(null);
    }
}
