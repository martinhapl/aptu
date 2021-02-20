Aplikace pro tajemnika ustavu
APTU

a) Studijní plány
     Sprava predmetu
        atributy:
            - zkratka
            - nazev
            - pocet hodin prednasek
            - pocet hodin seminaru
            - pocet hodin cviceni
            - pocet tydnu v ketrych se prednasi
            - jazyk   cs / en
            - zpusob ukoncenui (zlasifikovany zapocet, klasifikovany zapocet, zkouska) zap, kl, zk (muze byt kombinace)
            - kredity
            - max. velikost skupiny
        operace:
            - pridej predmet
            - edituj predmet
            - smaz predmet
            - zobraz prehled predmetu

b) Zaměstnanci ústavu
     Sprava zamestnancu
        atributy:
            - jmeno
            - prijmeni
            - mobilni tel
            - telefon work
            - email
            - doktorant ano/ne
            - uvazek  0 az 1  (0 dohoda, 0.8 - 80%, 1= 100%
        operace:
            - pridej zamestnance
            - edituj zamestnance
            - smaz zamestnance
            - zobraz prehled zamestnancu

c) Úvazkový list
    Pracovni stitek je prirazeni predmetu do skupinky
        - predmet muze byt ve vice skupinkach
        - v ruznych spupinkach muze byt v rozdilnych semestrech a rocnicich
        - podle poctu studentu v rocniku a semestru je potreba generovat prislusny pocet stiku v zavislosti na maximalni velikost skupiny "subject.groupsize", 
          rozdeleni na vice stitku podle poctu se provede pro cviceni a seminar pro prednasdku vznika vzdy jen jeden stitek pokud

    zobrazeni planu vyuky
     - vbyuka - pracovnich bodu
     - vyuka s anglictinou - pracovnich bodu
     - zkouseni

d) Počty studentů - studijni skupinka
    Sprava studijnich skupinek
        atributy:
            - zkratka   (KYB)
            - nazev     (Kyberneticka bezpecnost)
            - forma     (P presencni, K kombinovana)
            - jazyk vyuky (cesky/anglicky)
            - studijni program (bc / mgr)
       operace:
            - pridej skuopinku (zalozi se detail skupinky, podle "studijni program" se zalozi rocniky)
            - edituj skuopinku (pokud se zmeni "studijni program" musi se upgeradovat detaily (bc > mgr = smaz 3. rocnik), (mgt > bc = pridej 3. rocnik)

            - smaz skuopinku (smazat vazane detaiuly)
            - zobraz prehled skupinek

    Sprava detailu studijnich skupinek
        atributy
            - rocnik    (1,2,3,,...)
            - semestr   (LS / ZS)
            - pocet studentu
        operace:
            - editace poctu studentu
            - vlozeni predmetu do skupinky > generuji se stitky


Technologie: 
 - JavaEE (EJB, JSF)
 - Widfly
 - PostgresSQL
