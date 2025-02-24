package med.voll.api.controller;

import med.voll.api.medico.DadosCadastrarMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastrarMedico dados) {
        System.out.println(dados);
    }
}