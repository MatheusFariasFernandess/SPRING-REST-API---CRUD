package com.example.demo.database;

import com.example.demo.model.RestauranteModel;
import org.springframework.data.jpa.repository.*;

public interface RestauranteRepositorio extends JpaRepository<RestauranteModel,Long>{
    
}
