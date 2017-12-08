    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package Utils;

    import Modele.Fruit;
    import Modele.ListeFruit;

    /**
     *
     * @author FARID
     */
    public class Utilitaire {

        public static double calculCoutTotal(ListeFruit maListe){
            double total=0;

        for (Fruit fruit : maListe){
            total+=fruit.getPrixFruit();
        }
        return total;
        }


    }
