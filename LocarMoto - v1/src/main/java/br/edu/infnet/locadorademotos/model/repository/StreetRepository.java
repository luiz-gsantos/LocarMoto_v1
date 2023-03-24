package br.edu.infnet.locadorademotos.model.repository;

import br.edu.infnet.locadorademotos.model.domain.Street;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class StreetRepository {

    private static Integer id = 1;
    private static Map<Integer, Street> mapaStreet = new HashMap<Integer, Street>();
    public static boolean incluir(Street street) {
        street.setId(id++);
            mapaStreet.put(street.getId(), street);
            return true;
    }
    public static Collection<Street> chamarLista(){
        System.out.println(mapaStreet.toString());
        return mapaStreet.values();
    }
    public static Street excluir(Integer key) {
        return mapaStreet.remove(key);
    }


}