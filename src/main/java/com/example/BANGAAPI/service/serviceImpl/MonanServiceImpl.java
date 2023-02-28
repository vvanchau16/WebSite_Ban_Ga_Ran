package com.example.BANGAAPI.service.serviceImpl;

import com.example.BANGAAPI.entity.Monan;
import com.example.BANGAAPI.repository.MonanRepository;
import com.example.BANGAAPI.service.MonanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonanServiceImpl implements MonanService {
    @Autowired
    MonanRepository monanRepository;
    @Override
    public List<Monan> getMonan(){
        return monanRepository.findAll();
    }

    @Override
    public void createMonAn(Monan monan){
        monanRepository.save(monan);
    }
}
