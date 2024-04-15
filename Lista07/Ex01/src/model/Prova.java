package model;

public class Prova {
    private int numeroQuestoes;
    private float mediaNotas;

    public Prova() {
        super();
    }

    public int getNumeroQuestoes() {
        return numeroQuestoes;
    }
    public void setNumeroQuestoes(int numeroQuestoes) {
        this.numeroQuestoes = numeroQuestoes;
    }
    public float getMediaNotas() {
        return mediaNotas;
    }
    public void setMediaNotas(float mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    @Override
    public String toString() {

        return String.format("Número de questões: %d\nMédia de notas: %.1f", numeroQuestoes, mediaNotas);
    }
}
