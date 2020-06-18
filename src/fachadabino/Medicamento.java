
package fachadabino;

/**
 *
 * @author Kayky
 */
public class Medicamento {
    
    private String nome;
    private String cod_medicamento;

    public Medicamento(String nome, String cod_medicamento) {
        this.nome = nome;
        this.cod_medicamento = cod_medicamento;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod_medicamento() {
        return cod_medicamento;
    }

    public void setCod_medicamento(String cod_medicamento) {
        this.cod_medicamento = cod_medicamento;
    }
    
    
    
}
