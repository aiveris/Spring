package sda.modelling.app;

import sda.modelling.entities.BallPlayer;
import sda.modelling.objects.Football;
import sda.modelling.objects.Footballer;
import sda.modelling.objects.NationalTeamPlayer;
import sda.modelling.objects.NationalTeamTshirt;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

// No Spring yet. But some Dependency Injection and polymorphism.
public class Match {

    public static void main(String[] args) {

        Footballer johnny = new Footballer( "Johnny from the courtyard league");

        johnny.run( 75 );
        johnny.jump( 30 );
        johnny.score();

        System.out.printf("\n\n");

        Footballer goetze = new NationalTeamPlayer( "Mario Götze");
        NationalTeamTshirt tShirt = new NationalTeamTshirt("Bayern München");

        // OLD style cast if needed to show the TShirt: Spring solves that too
        System.out.println( ((NationalTeamPlayer) goetze).wears( tShirt ) );

        // Add to the "collection" of players - a team
        final Set< Footballer > team = new HashSet< Footballer>( 10 );
        team.add( goetze );

        System.out.println( team.stream().findFirst().get() );

        goetze.run( 50 );

        // "Default" Götze shoot: shoots like a Sportsman
        goetze.shoot(new Football());

        //
        goetze.shoot(new Football() {
            @Override
            public long move(long meters) {
                System.out.println( "Out!" );
                // Note, we do change the defaulted print "Ball moves" for now
                return 0;
            }
        });


        // Runs like a MovingMan
        goetze.run( 10 );

        // Scores like a Footballer
        goetze.score( 3 );

        // Jumps as a MovingMan
        goetze.jump( 56 );
        goetze.run( 120 );

        // Scores as a Sportsman
        goetze.score( 2 );

    }
}
