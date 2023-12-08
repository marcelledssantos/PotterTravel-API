package com.PotterTravelAPI.PotterTravelAPI.servicesImpl;

import com.PotterTravelAPI.PotterTravelAPI.entities.Viagem;
import com.PotterTravelAPI.PotterTravelAPI.repositories.ViagemRepository;
import com.PotterTravelAPI.PotterTravelAPI.services.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViagemServiceImpl implements ViagemService {

    @Autowired
    private ViagemRepository viagemRepository;

    @Override
    public List<Viagem> getAllViagens() {
        return viagemRepository.findAll();
    }

    @Override
    public Viagem getViagemById(Long id) {
        return viagemRepository.findById(id).orElseThrow(() -> new RuntimeException("ID: " + id + "Não encontrado!"));
    }

    @Override
    public Viagem saveViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

    @Override
    public Viagem updateViagem(Long id, Viagem viagemUpdated) {
        Viagem viagemCadastrada = getViagemById(id);
        return viagemRepository.save(viagemCadastrada);
    }

    @Override
    public void deleteById(Long id) {
        viagemRepository.deleteById(id);
    }
}
