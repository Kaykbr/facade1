package fachadabino;


public class FachadaBino {

    
    public static void main(String[] args) {
    
        Medico medico = new Medico();
        medico.setNome("Jaylson Matos");
        medico.setRegistro_medico("666");
        Paciente paciente = new Paciente();
        paciente.setNome("Kayky Bezeraa");
        paciente.setTelefone("12344567");
        
        
        ServicosFarmacia farmacia = new ServicosFarmacia();
        
        Medicamento medic1 = new Medicamento("trembolona", "1");
        Medicamento medic2 = new Medicamento("rivotril", "2");
        Medicamento medic3 = new Medicamento("apevitim",  "3");
        Medicamento medic4 = new Medicamento("dipirona",  "4");
        farmacia.addMedicamento(medic1);
        farmacia.addMedicamento(medic2);
        farmacia.addMedicamento(medic3);
        farmacia.addMedicamento(medic4);
       
        
        FachadaClinica fachada = new FachadaClinica(medico, paciente);
        fachada.marcarConsulta(paciente, medico, "23/09/2020", "20h40");  
        fachada.obterReceita(paciente, medico, medic1);
        fachada.receberMedicacao(fachada.retornarReceita(paciente, medico, medic1));
    }
    
}