
package fachadabino;

import java.util.ArrayList;

/**
 *
 * @author Kayky
 */
public class ServicosFarmacia {
    
    private ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();

    public void receberMedicamento(ReceitaMedica receita) {

        for (int i = 0; i < listaMedicamentos.size(); i++) {
            if (receita.getMedicamento() == this.listaMedicamentos.get(i)) {
                System.out.println("\n Medicação entregue.");

            } else
                System.out.println("\n Medicação não disponível.");   
            }        
        }
    
    
    public void addMedicamento(Medicamento medic){
        listaMedicamentos.add(medic);
    }

    
    public ArrayList<Medicamento> getListaMedicamentos() {
        return listaMedicamentos;
    }

    
    public void setListaMedicamentos(ArrayList<Medicamento> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }
    
    
    
    
}
    

