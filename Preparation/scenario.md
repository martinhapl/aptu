Aplikace pro tajemnika ustavu
APTU

a) Studijní plány 
b) Zaměstnanci ústavu 
c) Úvazkový list
d) Počty studentů


operace pridej:
 - zamestnance
 - stitek
 - studijni obor
 - predmet

Subject 
    private Long id;   // PK
    private String shortcut;
    private String name;
    private int hoursOfLectures;
    private int hoursOfSeminars;
    private int hoursOfExercises;
    private int numberOfWeeks;
    private Enums.Lang language;  // en, cs
    private Enums.SubjectTermination termination; // z, kz, zk
    private int credits;
    private int groupSize;

CREATE TABLE subject
(
  id bigint NOT NULL,
  credits integer NOT NULL,
  groupsize integer NOT NULL,
  hoursofexercises integer NOT NULL,
  hoursoflectures integer NOT NULL,
  hoursofseminars integer NOT NULL,
  language integer NOT NULL,
  name character varying(255) NOT NULL,
  numberofweeks integer NOT NULL,
  shortcut character varying(20) NOT NULL,
  termination integer NOT NULL,
  CONSTRAINT subject_pkey PRIMARY KEY (id)
)


Employee
    private Long id;     // Pk
    private String name;
    private String surname;
    private String phone;
    private String mobile;
    private String email;       // unique
    private boolean doctoralStudent;
    private double workingTime;  // roizsah 0 az 1

CREATE TABLE employee
(
  id bigint NOT NULL,
  doctoral_student boolean NOT NULL,
  email character varying(255) NOT NULL,
  mobile character varying(255) NOT NULL,
  name character varying(255) NOT NULL,
  phone character varying(255) NOT NULL,
  surname character varying(255) NOT NULL,
  working_time double precision NOT NULL,
  CONSTRAINT employee_pkey PRIMARY KEY (id)
)




? pracovni stitek prirazeni zamenstnaci ale v ramci definice predmetu je zamestnanec ?!

? zakladani 14:50 ma zalozit treba 6 to je ok, ale pak musim mit pro kazdou sadu voleb taky polozku pocet studentu 
Studijni skupinka GUI:
zadam:  zkratka, nazev, form P/K, jaszyk, Bc/Mgr
rocnik, semestr: se predgeneruje a zadam :  pocet studentu
pro BC se zalozi 6 zaznamu pro Mgr se zalozi 4 zaznamy

Predmet
 - zkratka
 - nazev
 - pocet hodin prednasek
 - pocet hodin seminaru
 - pocet hodin cviceni
 - pocet tydnu v ketry cse prednasi
 - jazik cestina/ en
 - zpusob ukoncenui (zlasifikovany zapocet, klasifikovany zapocet, zkouska) z, kz, zk
 - kredity
 - velikost skupiny

vazba predmet - stitek
 - presencni / kombinovane
 - obory: N:M vazba na Studijni skupinka ?
 - vyucujici: vazba zamestnanec pres stitek


Zamestnanec
 - jmeno
 - prijmeni
 - mobilni tel
 - telefon work
 - email
 - doktorant Ano/ne
 - uvazek  0 az 1  (0 dohoda, 0.8 - 80%, 1= 100%

 - vbyuka - pracovnich bodu
 - vyuka s anglictinou - pracovnich bodu


Studijni skupinka
 - zkratka  KYB
 - nazev   Kyberneticka bezpecnost
 - presencni / kombinobvany   P/K
 - cesky/anglicky 
 - bakalarske / mgr 
 - rocnik  1,2,3
 - semestr  LS / ZS
 - pocet studentu



pracovni stitek
 vazba kupinka - 
 zkouseni - 


? vezmou jednotlive sklupinky a zjisti se ktera je navazane na ktery predmet

Pracovni Stitek

500 bodu uvazku
