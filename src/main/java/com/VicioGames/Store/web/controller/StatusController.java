package com.VicioGames.Store.web.controller;
import com.VicioGames.Store.domain.endpointdto.StatusDto;
import com.VicioGames.Store.domain.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    private StatusService statusService;

    @GetMapping("/all")
    public List<StatusDto> findAll(){
        return statusService.getAll();
    }
}
