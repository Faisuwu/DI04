# DI04 - Antoni Maqueda Bestard

#A.Problemes Inicials

Per fer aquest projecte, he utilitzat es projecte que vaig lliurar a DI-01.
Es problema és que era un poc desastre, aixi que he hagut de, primer, arreglar algunes coses:

1. Primer he intentat arreglat es problema de la base de dades utilitzant Azure. Com ja vaig dir, faig servir un ordinador amb macOS, on SQL Server ja no està disponible de forma nativa. Per intentar arreglar-ho, vaig seguir les teves recomanacions i vaig intentar pujar la base de dades a Azure, per manejar-ho desde allá.
    Després d'intentar-ho un parell de vegades, no me ha anat bé i he considerat que com no entra explicitament dins aquesta tasca, ho substituiria per un arxiu JSON. Aixi, la verificació dels usuaris se fá mitjançant "baseSimulada.json".
    El codi d'error que m'ha donat Azure un parell de vegades: The ImportExport operation with Request Id '708127f1-1890-46be-a298-3cd611a0fc78' failed due to 'An unexpected error was returned by SQL. Error number: 0, State: 0, Message: Failed to authenticate the user antonimaqueda@paucasesnovescifp.cat in Active Directory (Authentication=ActiveDirectoryPassword). Error code 0xinvalid_grant AADSTS50126: Error validating credentials due to invalid username or password. Trace ID: f73771b6-d4d3-4128-ab23-9f88770e3a00 Correlation ID: 1533d010-9dd9-46c6-b72e-5bf488f3943d Timestamp: 2025-01-27 20:38:19Z.'.

2. El projecte que vaig entregar a DI01 no utilitzava el designer de netbeans, per lo que he fet desde 0 l'interficie de l'aplicació utilitzant-ho. Cal destacar que degut al problema inicial de la base de dades, coses com les llistes i les taules no funcionen, però están creades i posicionades segons el disseny de l'interficie

#B.Descripció de l'aplicació

L'aplicació ja està terminada. Quan se obri s'aplicació te trobes la finestra d'inici, que t'envia a fer login. Una vegada fet login correctament, se tanca "l'iniciador" i s'obri el JFrame de "l'aplicació", deixant-te a es menú, on pots accedir a les funcionalitats més importants a través de botóns amb icones representatius.
A través d'aquests icones o en el seu defecte, del menú superior es pot accedir a les diferents funcionalitats de l'aplicació. Está estructurat perque sigui sencill i eficient.
Per fer login, tenim 3 usuaris al JSON. El mes sencill d'utilitzar és: User: "usuari", Password: "contrasenya".

#C.Criteris introduits a l'aplicació

A continuació enumero les funcionalitats noves introduides a l'aplicació segons els criteris establerts a l'enunciat

1. Les finestres tenen una estructura senzilla i clara, fàcil de comprendre. Utilitzen de color un fons blau sutil, amb una transició personalitzada desde el menú principal.

2. Se han afegit icones representatius a la pàgina principal, i cal destacar la transició personalitzada. També se ha afegit un menú superior

3. Es texte és sencill, de tipografia estàndar i fàcil de comprendre

4. Tots els components apareixen al menú superior, i quan se entra a l'aplicació es condueix a la pàgina principal, que conta amb accesos directes als components principals i més utilitzats. A cada pàgina, es components se troben al centre de la mateixa, no te pèrdua.

5. Aqui he tengut problemes perquè no m'havia adonat que havia d'utilitzar MigLayout desde un inici, sino que rellegint l'enunciat quan havia fet es projecte. Malgrat aixó, la usabilitat de la interfície no es veu afectada en cas de redimensionament de les finestres principals, gràcies a la public void "componentResized(ComponentEvent e)". Amb aquesta void, els JPanels es dimensionen amb la pantalla quan es fa mes gran, deixant centrat el contingut de dintre. 

6. A la página de login, es programa utilitza una validació per saber si el introduit es correcte. Si no es correcte o passa qualsevol error intern, notifica al usuari. Amés, al "Feedback", no deixa "enviar" el texte sense que hagis aceptat les condicions

7. He afegit es menú superior per millorar l'interfaç. També he afegit un JavaBean a la pàgina "Horari", l'idea era utilitzar el meu CalendariComponent de DI03, pero no s'implementava correctament al projecte, aixi que he fet una reserca i he implementat aquest javabean desde https://sourceforge.net/projects/jcalendar/. També he afegit un formulari de feedback, que no es plantejava al projecte inicial DI01.

8. Codi amb comentaris. Classes estructurades en paquets segons funcionalitat. Commits sovints.

# DI06 - Antoni Maqueda Bestard

#A. ACTUALITZACIÓ ABRIL: BASE DE DADES

He actualitzat sa aplicació per incloir la base de dades remota. El codi funciona perfectament.
També he fet canvis a l'interficie, ja que abans com no tenia BBDD afegida, no tenia tot el necessari.

#B. GENERACIÓ DEL JAVADOC

He canviat tots els comentaris i afegit el plugin de javadoc per generar el javadoc correctament.
La web de documentació, per tant está realitzada i es bastant útil per entendre el codi.

#C. USER MANUAL

-

#D. GITHUB ISSUES

-