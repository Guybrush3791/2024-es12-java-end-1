import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // testPrenotazioni();
        // testStudenti();
        // testContoBancario();
        // testElencoTelefonico();
        // testVotazione();
        // testHotel1();
        // testImpiegato();

        testAlbergo();
    }

    public static void testPrenotazioni() {

        try {
            Prenotazioni p = new Prenotazioni();
            System.out.println(p.toString());

            p.prenota(3);
            System.out.println(p.toString());

            p.prenota(2);
            System.out.println(p.toString());

            p.annulla(2);
            System.out.println(p.toString());

            p.annulla(4);
            System.out.println(p.toString());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testStudenti() {

        Studente s = new Studente("Mario", "123456");
        s.printDetails();

        // s.addGrade(30);
        // s.printDetails();

        // s.addGrade(25);
        // s.printDetails();

        // s.addGrades(List.of(18, 20, 25, 30));
        // s.printDetails();

        // s.addGrades(List.of(18, 20, 25, 30));
        s.printDetails();
    }

    public static void testContoBancario() {

        try {
            ContoBancario cb = new ContoBancario();
            System.out.println(cb);

            cb.deposita(100);
            System.out.println(cb);

            cb.preleva(50);
            System.out.println(cb);

            cb.preleva(100);
            System.out.println(cb);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testElencoTelefonico() {

        ElencoTelefonico et = new ElencoTelefonico();
        System.out.println(et);

        try {
            et.aggiungiContatto(new Contatto("Mario", "123456"));
            System.out.println(et);

            et.aggiungiContatto(new Contatto("Luigi", "654321"));
            System.out.println(et);

            et.aggiungiContatto(new Contatto("Paolo", "123456"));
            System.out.println(et);

            et.aggiungiContatto(new Contatto("Luca", "654321"));
            System.out.println(et);

            System.out.println(et.findContact("lu"));
            System.out.println(et.findContact("123"));

            et.rimuoviContatto(new Contatto("Mario", "12345a"));
            System.out.println(et);

            System.out.println(et.findContact("lu"));
            System.out.println(et.findContact("123"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    // ---------------------------------------------------------------------------

    public static void testVotazione() {

        try {
            Elezione e = new Elezione();
            System.out.println(e);

            Candidato c1 = new Candidato("Guybrush", "Threepwood", "123456");
            Candidato c2 = new Candidato("Elaine", "Marley", "654321");

            Elettore e1 = new Elettore("LeChuck", "Il Terribile", "abcdef");
            Elettore e2 = new Elettore("Stan", "Il Venditore", "ghijkl");
            Elettore e3 = new Elettore("Carla", "La Spada", "mnopqr");
            Elettore e4 = new Elettore("Herman", "Il Barbiere", "stuvwx");
            Elettore e5 = new Elettore("Otis", "Il Guardiano", "yz1234");

            System.out.println("-------------------------------------------------------------------");
            System.out.println("c1: " + c1);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("c2: " + c2);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("e1: " + e1);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("e2: " + e2);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("e3: " + e3);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("e4: " + e4);
            System.out.println("-------------------------------------------------------------------");
            System.out.println("e5: " + e5);
            System.out.println("-------------------------------------------------------------------");

            System.out.println(e);
            System.out.println("-------------------------------------------------------------------");
            e.vota(e1, c2);
            System.out.println(e);
            System.out.println("-------------------------------------------------------------------");
            e.vota(e2, c2);
            System.out.println(e);
            System.out.println("-------------------------------------------------------------------");
            e.vota(e3, c1);
            System.out.println(e);
            System.out.println("-------------------------------------------------------------------");
            e.vota(e4, c1);
            System.out.println(e);
            System.out.println("-------------------------------------------------------------------");
            e.vota(e5, c1);
            System.out.println(e);
            System.out.println("-------------------------------------------------------------------");

            System.out.println("Eletto: " + e.getEletto());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void testHotel1() {

        Camera c1 = new Camera(1, "101");
        Camera c2 = new Camera(1, "102");
        Camera c3 = new Camera(2, "201");
        Camera c4 = new Camera(2, "202");
        Camera c5 = new Camera(3, "301");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);

        System.out.println("-------------------------------------------------------------------");

        // Cliente cl1 = new Cliente("Guybrush", "Threepwood");
        // Cliente cl2 = new Cliente("Elaine", "Marley");
        // Cliente cl3 = new Cliente("LeChuck", "Il Terribile");

        // System.out.println(cl1);
        // System.out.println(cl2);
        // System.out.println(cl3);

        Cliente cl1 = new Cliente("Guybrush", "Threepwood", "123456");
        Cliente cl2 = new Cliente("Elaine", "Marley", "654321");
        Cliente cl3 = new Cliente("LeChuck", "Il Terribile", "abcdef");

        System.out.println(cl1);
        System.out.println(cl2);
        System.out.println(cl3);

        System.out.println("-------------------------------------------------------------------");

        Prenotazione p1 = new Prenotazione(c1, cl1);
        Prenotazione p2 = new Prenotazione(c5, cl3);
        Prenotazione p3 = new Prenotazione(c2, cl2);
        Prenotazione p4 = new Prenotazione(c3, cl1);
        Prenotazione p5 = new Prenotazione(c4, cl3);

        System.out.println(p1);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(p2);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(p3);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(p4);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(p5);
        System.out.println("-------------------------------------------------------------------");
    }

    public static void testImpiegato() {

        Impiegato i1 = new Impiegato("Guybrush", "Threepwood", "123456", 1000);
        Impiegato i2 = new Impiegato("Elaine", "Marley", "654321", 2000);
        Impiegato i3 = new Impiegato("LeChuck", "Il Terribile", "abcdef", 3000);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        System.out.println("-------------------------------------------------------------------");

        Manager m1 = new Manager("Otis", "Il Guardiano", "ghijkl", 4000, 10000);
        Manager m2 = new Manager("Stan", "Il Venditore", "mnopqr", 5000, 20000);
        Manager m3 = new Manager("Carla", "La Spada", "stuvwx", 6000, 30000);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("-------------------------------------------------------------------");

        Impiegato[] impiegati = { i1, i2, i3, m1, m2, m3 };
        for (Impiegato i : impiegati) {
            System.out.println(i);
            i.incSalary(10);
            System.out.println(i);
            System.out.println("-------------------------------------------------------------------");
        }
    }

    public static void testAlbergo() {

        CameraAlbergo c1 = new CameraSingola(1);
        CameraAlbergo c2 = new CameraSingola(2);
        CameraAlbergo c3 = new CameraDoppia(3);
        CameraAlbergo c4 = new CameraDoppia(4);
        CameraAlbergo c5 = new Suite(5);

        Suite s1 = new Suite(6);
        CameraAlbergo c6 = s1;

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4: " + c4);
        System.out.println("c5: " + c5);
        System.out.println("c6: " + c6);

        s1.setVasca(true);
        System.out.println("c6: " + c6);

        System.out.println("-------------------------------------------------------------------");

        Albergo a = new Albergo();

        a.addCamera(c1);
        a.addCamera(c2);
        a.addCamera(c3);
        a.addCamera(c4);
        a.addCamera(c5);
        a.addCamera(c6);

        System.out.println("Albergo:\n" + a);
    }
}

/**
 * TODO:
 * 
 * ES0: Creare un repository su GitHub con il seguente nome:
 * 2024-06-26-java-end-1
 * 
 * Caricare tutti gli esercizi in un unico progetto sulla stessa repo
 * 
 * 
 * ES1: Sistema di Prenotazioni
 * 
 * Crea una classe Prenotazione che possa essere utilizzata da un teatro per
 * tenere traccia delle prenotazioni dei posti. Utilizza un array di booleani
 * per rappresentare i posti: true se il posto è prenotato, false altrimenti.
 * Implementa metodi per prenotare un posto, annullare la prenotazione e
 * verificare se un o piu' posti sono disponibili
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES2: Registro Studenti
 * 
 * Crea una classe Studente con attributi come nome, matricola, e voti (usa un
 * ArrayList). Aggiungi metodi per aggiungere voti, calcolare la media dei voti,
 * e stampare i dettagli dello studente. Implementa la gestione delle eccezioni
 * per evitare errori nell'inserimento dei voti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES3: Simulatore di Banca
 * 
 * Definisci una classe ContoBancario con metodi per depositare denaro,
 * prelevare denaro e ottenere il saldo. Assicurati di gestire il caso in cui si
 * tenta di prelevare più denaro di quanto disponibile con un'eccezione.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES4: Elenco Telefonico
 * 
 * Implementa una classe Contatto che rappresenti un contatto telefonico con
 * nome e numero di telefono (stringa). Crea una classe ElencoTelefonico che
 * gestisca una lista di contatti.
 * Includi metodi per aggiungere, rimuovere e cercare contatti. Gestisci
 * eventuali eccezioni relative all'inserimento di numeri di telefono non
 * validi.
 * 
 * ---------------------------------------------------------------------------
 * 
 * POMERIGGIO
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES5: Sistema di Votazione
 * 
 * Crea classi per Candidato e Elettore, dove ogni Elettore può votare per un
 * Candidato. Implementa un meccanismo usando mappe per tenere traccia dei voti
 * ricevuti da ogni candidato. Assicurati di gestire le eccezioni per casi come
 * doppi voti o voti a candidati non esistenti.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES6: Sistema di Prenotazione Hotel
 * 
 * Definisci classi per Camera, Cliente, e Prenotazione. Utilizza una mappa per
 * associare clienti a prenotazioni e una lista di camere disponibili.
 * Implementa metodi per effettuare, modificare e cancellare prenotazioni,
 * assicurandoti di gestire eccezioni come camere non disponibili o
 * cancellazioni tardive.
 * 
 * ---------------------------------------------------------------------------
 * 
 * ES7: Impiegato e Manager
 * 
 * Crea una classe Impiegato con attributi come nome, salario e metodi per
 * aumentaSalario(int percentuale). Deriva da questa una classe Manager che
 * aggiunge l'attributo bonus. Il metodo aumentaSalario del manager dovrebbe
 * considerare anche il bonus nell'aumento. Mostra come puoi utilizzare il
 * polimorfismo per gestire diversi tipi di impiegati in un array di tipo
 * Impiegato.
 * 
 * ------------------------`---------------------------------------------------
 * 
 * ES8: Sistema di Prenotazione Alberghiera
 * 
 * Progetta una classe astratta CameraAlbergo con metodi come calcolaCosto() e
 * numeroLetti(). Deriva da questa diverse classi specifiche come CameraSingola,
 * CameraDoppia e Suite. Implementa calcolaCosto in modo diverso per ogni tipo
 * di camera. Utilizza una collezione per gestire tutte le camere disponibili in
 * un albergo.
 * 
 * ---------------------------------------------------------------------------
 */