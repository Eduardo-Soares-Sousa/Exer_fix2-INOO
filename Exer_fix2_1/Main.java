package Exer_fix2_1;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Candidato primCandidato = null;
        Candidato segCandidato = null;
        Candidato terCandidato = null;

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do candidato " + (i+1) + ": ");
            String nome = scanner.nextLine();

            System.out.println("Digite a nota teórica do candidato " + (i+1) + ": ");
            float teorica = scanner.nextFloat();

            System.out.println("Digite a nota prática do candidato " + (i+1) + ": ");
            float pratica = scanner.nextFloat();

            System.out.println("Digite a nota da entrevista do candidato " + (i+1) + ": ");
            float entrevista = scanner.nextFloat();

            scanner.nextLine();

            Candidato candidato = new Candidato(nome, teorica, pratica, entrevista);

            if (primCandidato == null || candidato.notaFinal() > primCandidato.notaFinal()) {
                terCandidato = segCandidato;
                segCandidato = primCandidato;
                primCandidato = candidato;
            } else if (segCandidato == null || candidato.notaFinal() > segCandidato.notaFinal()) {
                terCandidato = segCandidato;
                segCandidato = candidato;
            } else if (terCandidato == null || candidato.notaFinal() > terCandidato.notaFinal()) {
                terCandidato = candidato;
            }
        }


        System.out.println("Classificação dos candidatos:");

        System.out.println("1. " + primCandidato.getNome() + " - Nota Final: " + primCandidato.notaFinal());
        System.out.println("2. " + segCandidato.getNome() + " - Nota Final: " + segCandidato.notaFinal());
        System.out.println("3. " + terCandidato.getNome() + " - Nota Final: " + terCandidato.notaFinal());
    }
}
