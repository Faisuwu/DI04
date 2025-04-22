# DI04 - README - Antoni Maqueda Bestard

## A. Problemes Inicials

Per fer aquest projecte, he utilitzat es projecte que vaig lliurar a DI-01.
Es problema és que era un poc desastre, aixi que he hagut de, primer, arreglar algunes coses:

1. Primer he intentat arreglat es problema de la base de dades utilitzant Azure. Com ja vaig dir, faig servir un ordinador amb macOS, on SQL Server ja no està disponible de forma nativa. Per intentar arreglar-ho, vaig seguir les teves recomanacions i vaig intentar pujar la base de dades a Azure, per manejar-ho desde allá. Al entregar originalment el DI04 no ho havia conseguit, però amb el DI06 ja está tot en ordre.

2. El projecte que vaig entregar a DI01 no utilitzava el designer de netbeans, per lo que he fet desde 0 l'interficie de l'aplicació utilitzant-ho. Cal destacar que degut al problema inicial de la base de dades, coses com les llistes i les taules no funcionen, però están creades i posicionades segons el disseny de l'interficie

## B. Descripció de l'aplicació

L'aplicació ja està terminada. Quan se obri s'aplicació te trobes la finestra d'inici, que t'envia a fer login. Una vegada fet login correctament, se tanca "l'iniciador" i s'obri el JFrame de "l'aplicació", deixant-te a es menú, on pots accedir a les funcionalitats més importants a través de botóns amb icones representatius.
A través d'aquests icones o en el seu defecte, del menú superior es pot accedir a les diferents funcionalitats de l'aplicació. Está estructurat perque sigui sencill i eficient.
Per fer login, tenim 3 usuaris al JSON. El mes sencill d'utilitzar és: User: "usuari", Password: "contrasenya".

## C. Criteris introduits a l'aplicació

A continuació enumero les funcionalitats noves introduides a l'aplicació segons els criteris establerts a l'enunciat

1. Les finestres tenen una estructura senzilla i clara, fàcil de comprendre. Utilitzen de color un fons blau sutil, amb una transició personalitzada desde el menú principal.

2. Se han afegit icones representatius a la pàgina principal, i cal destacar la transició personalitzada. També se ha afegit un menú superior

3. Es texte és sencill, de tipografia estàndar i fàcil de comprendre

4. Tots els components apareixen al menú superior, i quan se entra a l'aplicació es condueix a la pàgina principal, que conta amb accesos directes als components principals i més utilitzats. A cada pàgina, es components se troben al centre de la mateixa, no te pèrdua.

5. Aqui he tengut problemes perquè no m'havia adonat que havia d'utilitzar MigLayout desde un inici, sino que rellegint l'enunciat quan havia fet es projecte. Malgrat aixó, la usabilitat de la interfície no es veu afectada en cas de redimensionament de les finestres principals, gràcies a la public void "componentResized(ComponentEvent e)". Amb aquesta void, els JPanels es dimensionen amb la pantalla quan es fa mes gran, deixant centrat el contingut de dintre. 

6. A la página de login, es programa utilitza una validació per saber si el introduit es correcte. Si no es correcte o passa qualsevol error intern, notifica al usuari. Amés, al "Feedback", no deixa "enviar" el texte sense que hagis aceptat les condicions

7. He afegit es menú superior per millorar l'interfaç. També he afegit un JavaBean a la pàgina "Horari", l'idea era utilitzar el meu CalendariComponent de DI03, pero no s'implementava correctament al projecte, aixi que he fet una reserca i he implementat aquest javabean desde https://sourceforge.net/projects/jcalendar/. També he afegit un formulari de feedback, que no es plantejava al projecte inicial DI01.

8. Codi amb comentaris. Classes estructurades en paquets segons funcionalitat. Commits sovints.





------------------------------------------------------------------------------------------------------

# DI06 - README - Antoni Maqueda Bestard

Primer faré un resum general d'aquesta entrega. Després pasaré a repasarla punt per punt.

## Descripció General

Aquest projecte ha suposat un repte, perque el que vaig entregar a la DI04 no tenia base de dades incorporada. Aixó ve d'enrera, ja que a la DI01 no vaig poder instalar la base de dades degut a que el meu mac no admét PostgreSQL.

A la DI04 vaig intentar afegirla amb Azure, però sense éxit. Ara amb les creedencials per fi he pogut afegir-la, aunque aixó ha significat feina extra i afegir noves funcionalitats.

Es per aixó que l'apartat A m'ha costat moltes més hores que els altres. Però al final els he completat tots, generant el javadoc, l'user manual i reportant els github issues amb éxit.

Estic content de tot el que he millorat desde la primera entrega


## Apartat per Apartat

### A. ACTUALITZACIÓ ABRIL: BASE DE DADES

He actualitzat sa aplicació per incloir la base de dades remota. El codi funciona perfectament.
També he fet canvis a l'interficie, ja que abans com no tenia BBDD afegida, no tenia tot el necessari.
L'interficie ha sofrit una gran ampliació desde la darrera entrega, degut a la implementació de la base de dades, que ja hauria d'haver-se fet a la entrega 1 però que no vaig poder...

### B. GENERACIÓ DEL JAVADOC

He canviat tots els comentaris i afegit el plugin de javadoc per generar el javadoc correctament.
La web de documentació, per tant está realitzada i es bastant útil per entendre el codi.

### C. USER MANUAL

L'user manual se ha creat a l'apartat de "Wiki" del repositori. És un manual bastant complet que cobreix tots els aspectes de l'aplicació

### D. GITHUB ISSUES

Se han fet dos reports de issues de github al repositori a l'apartat de "Issues".
Consisteixen en dos millores de usabilitat, ja que bugs no he trobat cap (millor!), però les millores me les he plantejat gairebé acabant l'aplicació, i crec que son molt acertades.





------------------------------------------------------------------------------------------------------

# DI07 - README - Antoni Maqueda Bestard

Primer faré un resum general d'aquesta entrega. Després pasaré a repasarla punt per punt.

## Descripció General

Aquesta entrega es més sencilla que les altres, però he hagut de afrontar varis problemes:
Ja per començar, he tengut que modificar el .jar creat perque tenia una firma digital corrupta o desactualitzada, cosa que provocava error.
Manualment he eliminat les firmes, peró m'he trobat amb que el jdk de windows no em funcionaba correctament. Cercant a la web he trobat una versió que m'ha anat be
 
Les proves les he fetes amb una máquina virtual de Windows 11, degut a que macOS no era la plataforma per la cuál haviem de desenvolupar el instalador

Després de tot, el projecte, es a dir l'instalador de l'aplicació funciona correctament complint els punts de l'enunciat.

## Apartat per Apartat


### A. Carpeta Target

La carpeta target ha estat pujada exitosament amb un pull.
Hi ha, entre altres coses, el .jar normal i després un .jar "shaved" amb totes les dependéncies corresponent.

A Aquest pull també he afegit el manual en pdf que posaré a l'instalador, juntament amb el .jar del projecte final per desplegament.

### B. Instalable amb Install4j

L'instalable está afegit al repositori com a release, i se ha creat exitosament. El funcionament está comprobat.

### C. Llicéncia i documentació

Es necessari aceptar una llicéncia per instal.lar l'aplicació quan executes l'instalador. Ademés, l'instalador et demanará quina documentació vols instal.lar (User Manual i/o Documentació de l'App).

### D. Look del instalador

Se ha posat un icone del executable .exe personalitzat amb el Gimnás Pau, i se ha editat la font , el color de la lletra i el contingut de texte de l'instalador per afegir-hi personalització.

### E. Video

El video ha estat afegit a la carpeta "DI07-Resources". En ell, explic el procés que he seguit en Install4j per generar el instalador.





------------------------------------------------------------------------------------------------------

# CONCLUSIÓ

En aquestes darreres setmanes, he anat fent els tres projectes. Ha acabat amb una aplicació estética, funcional, amb un instal.lador propi i amb dues documentacions propies (Usermanual, Documentació de l'App) ademés de afegir l'informació pertinent al github.
He aprés totes les pases de dissenyar una aplicació d'escriptori, ademés de desplegar l'aplicació mitjançant un instal.lador.
Qualsevol cosa sobre l'aplicació, em dius.