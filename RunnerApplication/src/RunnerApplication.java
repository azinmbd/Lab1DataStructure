/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Azinm
 */
public class RunnerApplication {
    public static void main(String[] args) {
        Runner machine = new Machine();
        Runner athlete = new Athlete();
        Runner candidate = new PoliticalCandidate();

        machine.run();
        athlete.run();
        candidate.run();
    }
}

