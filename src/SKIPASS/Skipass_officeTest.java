package SKIPASS;

import static org.junit.Assert.*;

/**
 * Created by Pankiv on 28.11.2016.
 */
public class Skipass_officeTest {
    private Ski_pass[] cards = new Ski_pass[10];
    Ski_pass card1 = new Skipass_for_descent(10,false,0,100,1);
    Ski_pass card2 = new Skipass_for_descent(20,false,0,150,2);
    Ski_pass card3 = new Skipass_for_descent(50,false,0,300,3);
    Ski_pass card4 = new Skipass_for_descent(100,false,0,800,4);
    Ski_pass card5 = new Skipass_for_descent_WEEKEND(10,false,0,120,5);
    Ski_pass card6 = new Skipass_for_descent_WEEKEND(20,false,0,200,6);
    Ski_pass card7 = new Skipass_for_descent_WEEKEND(50,false,0,350,7);
    Ski_pass card8 = new Skipass_for_descent_WEEKEND(100,false,0,1000,8);
    Ski_pass card9 = new Skipass_for_days(0,true,1,200,9);
    Ski_pass card10 = new Skipass_for_days(0,true,2,350,10);
    Ski_pass card11 = new Skipass_for_days(0,true,5,800,11);
    Ski_pass card12 = new Skipass_for_days_WEEKEND(0,true,1,300,12);
    Ski_pass card13 = new Skipass_for_days_WEEKEND(0,true,2,550,13);
    Ski_pass card14 = new Skipass_for_days_WEEKEND(0,true,5,1000,14);
    Ski_pass card15 = new Skipass_for_season(0,true,100,10000,15);

    @org.junit.Test
    public void addSkipass() throws Exception {


    }

    @org.junit.Test
    public void double_size() throws Exception {

    }

    @org.junit.Test
    public void removeSkipass() throws Exception {

    }

    @org.junit.Test
    public void oneDescentOut() throws Exception {

    }

    @org.junit.Test
    public void oneDayOut() throws Exception {

    }

    @org.junit.Test
    public void cardIsActive() throws Exception {

    }

    @org.junit.Test
    public void check() throws Exception {

    }

}