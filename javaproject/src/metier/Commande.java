package metier;




public class Commande {
    private int idCommande;
    private int idClient;
    private String etat;  
    public Commande() {
    	super();
    }
 

    public Commande(int idCommande, int idC) {
        this.idCommande = idCommande;
        this.idClient = idC;
        this.etat = "à faire";
       
    }


    public int getIdCommande() {
        return idCommande;
    }


    public void setIdCommande(int idCommande) {
        this.idCommande = idCommande;
    }

    public int getIdClient() {
        return idClient;
    }


    public void setIdClient(int idC) {
        this.idClient = idC;
    }


    public String getEtat() {
        return etat;
    }


    public void setEtat(String enCours) {
        this.etat = enCours;
    }
   

    
}

