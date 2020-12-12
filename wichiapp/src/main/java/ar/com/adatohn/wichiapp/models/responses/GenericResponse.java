package ar.com.adatohn.wichiapp.models.responses;

import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
public class GenericResponse {

    public boolean isOk;
    public int id;
    public String message;
    
}
