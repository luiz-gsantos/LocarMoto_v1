package br.edu.infnet.locadorademotos.model.repository;


import br.edu.infnet.locadorademotos.model.domain.Trail;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TrailRepository {

    private static Integer id = 1;
    private static Map<Integer, Trail> mapaTrail = new HashMap<Integer, Trail>();

    public static boolean incluir(Trail trail) {
        trail.setId(id++);
            mapaTrail.put(trail.getId(), trail);
            return true;
    }
    public static Collection<Trail> chamarLista(){
        System.out.println(mapaTrail.toString());
        return mapaTrail.values();
    }
    public static Trail excluir(Integer key) {
        return mapaTrail.remove(key);
    }

}