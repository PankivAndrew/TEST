package SKIPASS;

/**
 * Created by Pankiv on 28.11.2016.
 */
public class Skipass_office {
    private Ski_pass[] cards = new Ski_pass[10];
    private int insertindex = 0;
    public void addSkipass(Ski_pass new_Skipass){
        if (cards[cards.length - 1] != null){
            double_size();
        }
        cards[insertindex] = new_Skipass;
        insertindex++;
    }
    public void double_size(){
        Ski_pass[] new_cards = new Ski_pass[cards.length * 2];
        for (int i = 0; i < cards.length; i++){
            new_cards[i] = cards[i];
        }
        cards = new_cards;
    }
    public void removeSkipass(int Number){
        Ski_pass[] new_cards = new Ski_pass[cards.length];
        for (int i = 0; i < cards.length;i++){
            if (cards[i].getNumber() == Number){
                cards[i] = null;
                break;
            }
        }
        int index = 0;
        for(int i =0; i < new_cards.length;i++){
            if(cards[i] != null){
                new_cards[index] = cards[i];
            }
        }
        cards = new_cards;
        insertindex--;
    }
    public void OneDescentOut(Ski_pass card){
        int a = card.getAmount_of_passes();
        card.setAmount_of_passes(a-1);
    }
    public void OneDayOut(Ski_pass card){
        int a = card.getAmount_of_days();
        card.setAmount_of_days(a-1);
    }
    public boolean CardIsActive(Ski_pass card){
        boolean cardIsActive = false;
        for (int i = 0; i < cards.length;i++){
            if (cards[i] == card){
                cardIsActive = true;
                break;
            }
        }
        return cardIsActive;
    }
    public void check(Ski_pass card){
        if (card.isCard_for_days() == true) {
            if (card.getAmount_of_days() > 0 && CardIsActive(card)) {
                System.out.println("Green Light");

            }
            else{
                System.out.println("Red Light");
            }
        }else{
            if(card.getAmount_of_passes() > 0 && CardIsActive(card)){
                OneDescentOut(card);
                System.out.println("Green Light");
            }
            else{
                System.out.println("Red Light");
            }
        }


    }


}
