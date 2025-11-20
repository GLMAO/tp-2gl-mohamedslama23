package com.polytech.tp;

public class CoursBuilder {

    // ✔ Attributs identiques à ceux de Cours
    String matiere;
    String enseignant;
    String salle;
    String date;
    String heureDebut;
    boolean estOptionnel;
    String niveau;
    boolean necessiteProjecteur;

    // ---- Méthodes fluentes (chaining) ----
    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }

    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }

    public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }

    public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }

    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }

    public CoursBuilder setOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }

    public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }

    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }

    // ---- Construction finale ----
    public Cours build() {
        return new Cours(this.matiere,this.enseignant,this.salle,this.date,this.heureDebut,this.estOptionnel,this.niveau,this.necessiteProjecteur);
    }
}
