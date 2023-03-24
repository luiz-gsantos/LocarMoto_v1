package br.edu.infnet.locadorademotos.model.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import br.edu.infnet.locadorademotos.model.domain.Custom;


public class CustomRepository {

    private static Integer id = 1;
    private static Map<Integer, Custom> mapaCustom = new HashMap<Integer, Custom>();
    public static boolean incluir(Custom custom) {
        custom.setId(id++);
            mapaCustom.put(custom.getId(), custom);
            return true;
    }
    public static Collection<Custom> chamarLista(){
        System.out.println(mapaCustom.toString());
        return mapaCustom.values();
    }
    public static Custom excluir(Integer key) {
        return mapaCustom.remove(key);
    }

}