package Exer_fix2_1;

public class Candidato {

    private String nome;
    private float teorica;
    private float pratica;
    private float entrevista;

    public Candidato(String nome, float teorica, float pratica, float entrevista){
        this.nome = nome; 
        this.teorica = teorica;
        this.pratica = pratica;
        this.entrevista = entrevista; 
    }

    public float notaFinal(){
        return (0.3f * teorica) + (0.4f * pratica) + (0.3f * entrevista);
    }

    public String getNome() {
        return nome;
    }
}