package priv.study.arduinospringcomm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import priv.study.arduinospringcomm.repository.AirConditionRepository;

@Service
public class AirConditionService {

    private final AirConditionRepository airConditionRepository;

    @Autowired
    public AirConditionService(AirConditionRepository airConditionRepository) {
        this.airConditionRepository = airConditionRepository;
    }
}
