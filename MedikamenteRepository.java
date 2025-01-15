import java.util.HashMap;
import java.util.List;

public class MedikamenteRepository {
    private HashMap<Integer,Medikamente> medikamenteData = new HashMap<Integer, Medikamente>();

    public void addMedikamente(Medikamente medikamente) {medikamenteData.putIfAbsent(medikamente.getId(), medikamente);}

    public  void deleteMedikamente(int id) {
        medikamenteData.remove(id);
    }

    public void updateMedikamente(Medikamente medikamente) {medikamenteData.replace(medikamente.getId(), medikamente);}

    public Medikamente getMedikamenteById(int id) {return medikamenteData.get(id);
    }

    public List<Medikamente> getAllMedikamente() {
        return medikamenteData.values().stream().toList();
    }

}