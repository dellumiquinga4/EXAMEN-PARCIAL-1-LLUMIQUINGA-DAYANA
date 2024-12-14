package org.example.examen.examenllumiquinga.service;

public class SegUsuarioService {
}
import com.example.account.models.SegUsuario;
import com.example.account.repositories.SegUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SegUsuarioService {

    @Autowired
    private SegUsuarioRepository segUsuarioRepository;

    public SegUsuario saveUsuario(SegUsuario segUsuario) {
        return segUsuarioRepository.save(segUsuario);
    }


}

