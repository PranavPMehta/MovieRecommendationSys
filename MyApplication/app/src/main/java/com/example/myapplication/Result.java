package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    String Name, Gender, Mood, oldFilms, gendre, timeAvail, englishCine;
    String gendre_temp;
    TextView movie,helloTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        movie = (TextView) findViewById(R.id.movietext);
        helloTxt=(TextView)findViewById(R.id.hello_text);
        Name = intent.getStringExtra("Name");
        Gender = intent.getStringExtra("Gender");
        Mood = intent.getStringExtra("Mood");
        oldFilms = intent.getStringExtra("OldFilms");
        gendre = intent.getStringExtra("Gendre");
        timeAvail = intent.getStringExtra("TimeAvail");
        englishCine = intent.getStringExtra("EnglishCinema");

        System.out.println(" " + Name + " " + Gender + " " + Mood + " " + oldFilms + " " + gendre + " " + timeAvail + " " + englishCine);

        if (Gender.equals("Female")) {
            if (Mood.equals("Happy")) {
                helloTxt.setText("Hello, "+Name+" You can also choose for this genre Comedy,Adventure,Romance");
            } else if (Mood.equals("Sad")) {
                helloTxt.setText("Hello, "+Name+" You can also choose for this genre Drama,Animation");
            } else if (Mood.equals("Normal")) {
                helloTxt.setText("Hello, "+Name+" You can also choose for this genre Horror,Animation,Romance");
            }
        } else {
            if (Mood.equals("Happy")) {
                helloTxt.setText("Hello, "+Name+" You can also choose for this genre Comedy,Adventure,Thriller");
            } else if (Mood.equals("Sad")) {
                helloTxt.setText("Hello, "+Name+" You can also choose for this genre Comedy,Drama");
            } else if (Mood.equals("Normal")) {
                helloTxt.setText("Hello, "+Name+" You can also choose for this genre Horror,Animation,Thriller");
            }
        }

        if (oldFilms.equals("Yes") && gendre.equals("Animation") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result1--");
            movie.setText(" Andrew Adamson (2001) \n" + "Up (2009)\n" + "Finding Nemo (2003)");

        } else if (oldFilms.equals("Yes") && gendre.equals("Animation") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result2");
            movie.setText("Ramayana – The Legend of Prince Rama (1992)\n" +
                    "Hanuman (2005)\n" +
                    "Bal Ganesh (2007)\n" +
                    "Roadside Romeo (2008)\n" +
                    "Jumbo (2008)\n" +
                    "Ghatothkach (2008)\n" +
                    "Bal Ganesh 2(2009)");

        } else if (oldFilms.equals("Yes") && gendre.equals("Animation") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result3");
            movie.setText("Toy Story (1995)\n" +
                    "South Park (1999)");

        } else if (oldFilms.equals("Yes") && gendre.equals("Animation") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result4");
            movie.setText("Mahabharat (2013)\n" +
                    "Ramayana- The epic (2010)\n" +
                    "Return of Hanuman (2007)\n" +
                    "Krishna aur Kans (2012)\n" +
                    "Dashavatar (2008)\n" +
                    "Toonpur ka Superhero(2010)");

        } else if (oldFilms.equals("No") && gendre.equals("Animation") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result5");
            movie.setText("The Lion King (1994)\n" +
                    "Space Jam (1996)\n" +
                    "Tarzan (1999)");


        } else if (oldFilms.equals("No") && gendre.equals("Animation") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result6");
            movie.setText("Choota Bheem Kung Fu Dhamal (2019)\n" +
                    "Hanuman vs Mahiravana (2018)\n" +
                    "Shiva:The secret world of vedas city (2018)\n" +
                    "Himalayan Adventure (2016)\n" +
                    "MOtu Patlu in the city of Gold (2019)");

        } else if (oldFilms.equals("No") && gendre.equals("Animation") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result7");
            movie.setText("Ice Age (2002)\n" +
                    "Madagaskar (2005)");

        } else if (oldFilms.equals("No") && gendre.equals("Animation") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result8");
            movie.setText("Mahayoddha Rama(2014)\n" +
                    "Mahabharat(2013)\n" +
                    "Chotta Bheem Himalayan Adventure (2016)\n" +
                    "Hanuman Da Damdaar (2017)");

        } else if (oldFilms.equals("Yes") && gendre.equals("Horror") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result9");
            movie.setText("Alien (1979)\n" +
                    "The Rite (2011)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Horror") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result10");
            movie.setText("Ghost(2012)\n" +
                    "Haunted(2011)\n" +
                    "1920Evil Returns (2012)\n" +
                    "Bhoot Returns (2012)\n" +
                    "Haunted Child (2013)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Horror") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result11");
            movie.setText("The Ninth Gate (1999)\n" +
                    "The Shining (1980)\n" +
                    "Interview with the Vampire (1994)");


        } else if (oldFilms.equals("Yes") && gendre.equals("Horror") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result12");
            movie.setText("2 Night in Soul Valley (2012)\n" +
                    "Horror Story (2013)\n" +
                    "Darr @the Mall (2014)\n" +
                    "Neighbours (2014)");

        } else if (oldFilms.equals("No") && gendre.equals("Horror") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result13");
            movie.setText("I Am Legend (2007)\n" +
                    "Saw (2004)\n" +
                    "Final Destination (2000)\n" +
                    "The Orphanage (2007)");

        } else if (oldFilms.equals("No") && gendre.equals("Horror") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result14");
            movie.setText("Bhoot (2020)\n" +
                    "3 AM (2014)\n" +
                    "The house next door(2017)\n" +
                    "Pari(2018)\n" +
                    "Tumbbad(2018)");

        } else if (oldFilms.equals("No") && gendre.equals("Horror") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result15");
            movie.setText("The Rite (2011)\n" +
                    "The Conjuring (2013)\n" +
                    "The Ring (2002)");
        } else if (oldFilms.equals("No") && gendre.equals("Horror") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result16");
            movie.setText("Ghost (2019)\n" +
                    "  Lupt (2018)\n" +
                    "  The Past (2018)\n" +
                    "  Ghost House (2018)\n" +
                    "  The final Exit (2017)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Drama") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result17");
            movie.setText("Requiem for a Dream (2000)\n" +
                    "Gladiator (2000)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Drama") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result18");
            movie.setText("Manikarnika (2019)\n" +
                    "  THackeray(2019)\n" +
                    "  THe Lift Boy (2019)\n" +
                    "  URI (2019)\n" +
                    "  Zero (2019)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Drama") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result19");
            movie.setText("The Green Mile (1999)\n" +
                    "Schindler''s List (1993)");

        } else if (oldFilms.equals("Yes") && gendre.equals("Drama") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result20");
            movie.setText("Article 15 (2019)\n" +
                    "  The Tashkent File (2019)\n" +
                    "  PM NArendra Modi (2019)\n" +
                    "  Kesari (2019)\n" +
                    "  Badla (2019)");

        } else if (oldFilms.equals("No") && gendre.equals("Drama") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result21");
            movie.setText("Detachment (2011)\n" +
                    "Bang Bang! You''re Dead! (2002)\n" +
                    "Black Swan (2010)\n" +
                    "Day of the Wacko (2002)");

        } else if (oldFilms.equals("No") && gendre.equals("Drama") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result22");
            movie.setText("Make in India (2019)\n" +
                    "  HouseFull 4 (2019)\n" +
                    "  The sky is Pink(2019)\n" +
                    "  Section 375(2019)\n" +
                    "  Chhichhore(2019)");
        } else if (oldFilms.equals("No") && gendre.equals("Drama") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result23");
            movie.setText("The Pianist (2002)\n" +
                    "Gladiator (2000)\n" +
                    "Biutiful (2010)\n" +
                    "Dogville (2003)");
        } else if (oldFilms.equals("No") && gendre.equals("Drama") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result24");
            movie.setText("Tanhaji: The Unsung Warrior (2020)\n" +
                    "Panga(2020)\n" +
                    "Street Dancer (2020)\n" +
                    "Chappak (2020)\n" +
                    "Panipat (2019)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Comedy") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result25");
            movie.setText("Forrest Gump (1994)\n" +
                    "The Truman Show (1998)\n" +
                    "Kiler (1997)\n" +
                    "Home Alone (1990)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Comedy") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result26");
            movie.setText("Firangi (2017)\n" +
                    "  Chef (2017)\n" +
                    "  Newton (2017)\n" +
                    "  Simran (2017)\n" +
                    "  Poster Boys (2017)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Comedy") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result27");
            movie.setText("Teddy Bear (1980)\n" +
                    "How I Unleashed World War II (1969)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Comedy") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result28");
            movie.setText("102 not out (2018)\n" +
                    "  Veerey Ki Weeding (2018)\n" +
                    "  SOne Ke Titu ki Sweety (2018)\n" +
                    "  Fukrey Returns (2017)");
        } else if (oldFilms.equals("No") && gendre.equals("Comedy") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result29");
            movie.setText("The Hangover (2009)");
        } else if (oldFilms.equals("No") && gendre.equals("Comedy") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result30");
            movie.setText("Luka Chuppi (2019)\n" +
                    "  Simmba (2019(\n" +
                    "  Namaste England (2018)\n" +
                    "  Andhadhun (2019)\n" +
                    "  Karwaan (2018)");
        } else if (oldFilms.equals("No") && gendre.equals("Comedy") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result31");
            movie.setText("The Untouchables (2011)\n" +
                    "The Devil Wears Prada (2006)");
        } else if (oldFilms.equals("No") && gendre.equals("Comedy") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result32");
            movie.setText("Dabangg 3(2019)\n" +
                    "  PagalPanti (2019)\n" +
                    "  Bala (2019)\n" +
                    "  Chhichhore (2019)\n" +
                    "  Dream Girl(2019)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Romance") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result33");
            movie.setText("Something''s Gotta Give (2003)\n" +
                    "Amélie (2001)\n" +
                    "Love Actually (2003)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Romance") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result34");
            movie.setText("The Zoya Factor (2018)\n" +
                    "  Motichoor Chaknachoor (2019)\n" +
                    "  Sifar (2019)");

        } else if (oldFilms.equals("Yes") && gendre.equals("Romance") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result35");
            movie.setText("Bridget Jones''s Diary (2001)\n" +
                    "Nigdy w zyciu! (2004)\n" +
                    "Chocolat (2000)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Romance") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result36");
            movie.setText("Notebook (2018)\n" +
                    "  Malal (2019)\n" +
                    "  Photograph (2019)\n" +
                    "  Happy Hardy (2020)");
        } else if (oldFilms.equals("No") && gendre.equals("Romance") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result37");
            movie.setText("500 Days of Summer (2009)\n" +
                    "Just Love Me (2006)");
        } else if (oldFilms.equals("No") && gendre.equals("Romance") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result38");
            movie.setText("Kalank (2019)\n" +
                    "Never Give Up (2019)\n" +
                    "Luka Chuppi (2019)\n" +
                    "Kabir Singh (2019)\n" +
                    "Saaho (2019)");
        } else if (oldFilms.equals("No") && gendre.equals("Romance") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result39");
            movie.setText("Step Up (2006)\n" +
                    "About Time (2013)");
        } else if (oldFilms.equals("No") && gendre.equals("Romance") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result40");
            movie.setText("Love Aaj Kal (2020)\n" +
                    "  Malang (2020)\n" +
                    "  Panga (2020)\n" +
                    "  The Sky is Pink(2019)\n" +
                    "  Dream Girl (2019)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Thriller") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result41");
            movie.setText("The Silence of the Lambs (1991)\n" +
                    "The Sixth Sense (1999)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Thriller") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result42");
            movie.setText("Satyamev Jayate (2018)\n" +
                    "  Delhi 47 Km (2018)\n" +
                    "  Raazi (2018)\n" +
                    "  Raid (2018)   \n" +
                    "  3 Storeys (2018)");
            /*----------------------------------------------------------------        */
        } else if (oldFilms.equals("Yes") && gendre.equals("Thriller") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result43");
            movie.setText("Fight Club(1999)\n" +
                    "    Se7en (1995)\n" +
                    "    The Devil''s Advocate (1997)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Thriller") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result44");
            movie.setText("Romeo Akbar Walter(2019)\n" +
                    "  India's Most Wanted (2019)\n" +
                    "  Pihu (2018)\n" +
                    "  Dasshera (2018)\n" +
                    "  Genius (2018)");

        } else if (oldFilms.equals("No") && gendre.equals("Thriller") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result45");
            movie.setText("Suicide Room (2011)\n" +
                    "American Psycho (2000)\n" +
                    "The Others (2001)");
        } else if (oldFilms.equals("No") && gendre.equals("Thriller") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result46");
            movie.setText("Unfriends (2019)\n" +
                    "  Run ZIndagi Run (2019)\n" +
                    "  The Journey Weekend Night (2019)\n" +
                    "  Bypass Road(2019)\n" +
                    "  Ghost (2019)");
        } else if (oldFilms.equals("No") && gendre.equals("Thriller") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result47");
            movie.setText("The Da Vinci Code (2006)\n" +
                    "Shutter Island (2010)");
        } else if (oldFilms.equals("No") && gendre.equals("Thriller") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result48");
            movie.setText("WAR (2019)\n" +
                    "  Batla House (2019)\n" +
                    "  Commando 3 (2019)\n" +
                    "  Hacked (2020)\n" +
                    "  The Body (2019)");
        }
        if (oldFilms.equals("Yes") && gendre.equals("Adventure") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result49");
            movie.setText("Back to the Future (1985)\n" +
                    "In Desert and Wilderness (2001)\n" +
                    "The Witcher (2001)\n" +
                    "Star Wars: Episode IV - A New Hope (1977)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Adventure") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result50");
            movie.setText("Thor (2011)\n" +
                    "  Zokkommon (2011)\n" +
                    "  Kingdom of gladiators (2011)\n" +
                    "  Dungeons and Dragons (2012)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Adventure") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result51");
            movie.setText("'The Lord of the Rings: The Fellowship of the Ring (2001)\n" +
                    "Harry Potter and the Philosopher''s Stone (2001)\n" +
                    "The Matrix (1999)");
        } else if (oldFilms.equals("Yes") && gendre.equals("Adventure") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result52");
            movie.setText("Mohenjo Daro(2016)\n" +
                    "  Sniff (2017)\n" +
                    "  Ra One (2011)\n" +
                    "  Zindagi Na Milegi Dobara (2011)");
        } else if (oldFilms.equals("No") && gendre.equals("Adventure") && timeAvail.equals("Little") && englishCine.equals("Yes")) {
            System.out.println("result53");
            movie.setText("Sherlock Holmes (2009)");
        } else if (oldFilms.equals("No") && gendre.equals("Adventure") && timeAvail.equals("Little") && englishCine.equals("No")) {
            System.out.println("result54");
            movie.setText("Raabta (2017)\n" +
                    "Jagga Jasoos (2017)\n" +
                    "Madaari (2016)\n" +
                    "Dishoom (2016)");
        } else if (oldFilms.equals("No") && gendre.equals("Adventure") && timeAvail.equals("Many") && englishCine.equals("Yes")) {
            System.out.println("result55");
            movie.setText("The Hobbit: An Unexpected Journey (2012)\n" +
                    "Pirates of the Caribbean: Dead Man''s Chest (2006)");

        } else if (oldFilms.equals("No") && gendre.equals("Adventure") && timeAvail.equals("Many") && englishCine.equals("No")) {
            System.out.println("result56");
            movie.setText("Thugs of Hindustan (2018)\n" +
                    "  Yeh Hai India (2019)\n" +
                    "  Adventure Kids (2020)\n" +
                    "  The great Indian Escape (2019)");
        }
    }
}
