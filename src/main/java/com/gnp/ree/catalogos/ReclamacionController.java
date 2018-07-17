package com.gnp.ree.catalogos;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
//import com.howtodoinjava.demo.model.Employee;
 
@RestController
public class ReclamacionController
{
    @RequestMapping("/padecimientos")
    public List<Reclamacion> getReclamaciones()
    {
        List<Reclamacion> reclamacionesList = new ArrayList<Reclamacion>();
        reclamacionesList.add(new Reclamacion("1","HERNIA UMBILICAL"));
        reclamacionesList.add(new Reclamacion("2","HERNIA DE OMBLIGO"));
        reclamacionesList.add(new Reclamacion("3","COLELITIASIS"));
        reclamacionesList.add(new Reclamacion("4","APENDICITIS AGUDA"));
        reclamacionesList.add(new Reclamacion("5","MIOMAS"));
        reclamacionesList.add(new Reclamacion("6","APENDICITIS AGUDA"));
        reclamacionesList.add(new Reclamacion("7","FIBROSIS QUISTICA"));
        return reclamacionesList;
    }
}