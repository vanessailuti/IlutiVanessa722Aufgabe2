import java.util.HashMap;
import java.util.List;

public class PatientenRepository {
    private HashMap<Integer,Patienten> patientenData = new HashMap<Integer, Patienten>();

    public void addPatienten(Patienten patienten) {patientenData.putIfAbsent(patienten.getPatientenID(), patienten);
    }

    public  void deletePatienten(int id) {
        patientenData.remove(id);
    }

    public void updatePatienten(Patienten patienten) {patientenData.replace(patienten.getPatientenID(), patienten);
    }

    public Patienten getPatientenById(int id) {return patientenData.get(id);
    }

    public List<Patienten> getAllPatienten() {return patientenData.values().stream().toList();
    }
}
