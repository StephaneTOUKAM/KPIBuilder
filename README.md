# __KPIBuilder__ 🤖

KPIBuilder est un module permettant de generer des statistiques dans les projets Java Spring Boot

## __En quoi il consite ?__

Lors du developpement de backend, de temps en temps, les clients demandent des pages affichant des statistiques des donnees enregistrees dans la base de donnees, notamment:

- Nombre de commande par jour (pour un e-commerce)
- Nombre d'utilisateurs inscrits par jour
- Evolution sur le temps des inscriptions ou requetes sur le site
- etc...

Tres souvent, apres le developpement, le developpeur doit encore integre un module d'affichage graphique des statistiques et ensuite coder toute la logique des statistiques.  
En integrant #__KPIBuilder__ il sera en mesure de faire des KPIs en quelques clics.

## __Comment ca marche ?__

### __Installation__

Il suffit juste d'integrer la dependance dans votre pom.xml pour les projets maven. Vous pouvez faire comme ceci:

```java
<dependency>
    <groupId>org.stephtech</groupId>
    <artifactId>kpibuilder</artifactId>
    <optional>true</optional>
</dependency>
```  
Ensuite, vous aurez juste a lancer votre projet via cette URL:  

```bash
http://localhost:8080/admin/statistics
```  
### __Configuration__

Depuis cette interface, vous pourrez configurer le KPI que vous souhaitez generer:

#### __Choix du type de graphe__

Vous aurez la possibilite de choisir entre plusieurs types de graphes:
- Histogramme
- Pie chart
- Graphique a barres
- etc...

#### __Choix de la table__

A cette etape, vous devez choisir la table sur laquelle vous souhaitez faire le graphe, par exemple pour avoir le nombre de commande par jour, vous allez choisir la table __commande__  
> __NB__: *__KPIBuilder__ se chargera de recuperer l'ensemble de vos tables et de vous les proposer*

#### __Choix du champ ou de la fonction a afficher en abscisse ou ordonnee__

Ici, en prenant le cas d'exemple du nombre de commande par jour, l'utilisateur peut decider d'afficher en abscisse le champ __createdAt__ et en ordonnee la fonction __nbreParJour__ qui sera une fonction implementee par le __KPIBuilder__ et mise a la disposition de l'utilisateur.  
> __NB__: *__KPIBuilder__ se chargera de recuperer l'ensemble des attributs de vos tables et de vous proposer des fonctions preecrites pour vous faciliter la tache. Ces fonctions peuvent bien-sur etre overload ou override*

#### __Validation__

Dans cette derniere, l'utilisateur aura juste a cliquer sur le bouton `Valider` et la magie s'opere, le graphe est genere et affiche a l'utilisateur.
> __NB__: *L'utilisateur peur enregistrer son graphe dans la base de donnee ou le modifier plus tard*

## __Contributing__

Les Pull Requests sont les bienvenues. Pour les changements majeurs, veuillez d'abord ouvrir une issue pour discuter de ce que vous souhaitez modifier.

Veillez à mettre à jour les tests le cas échéant.

## __License__

[MIT](https://choosealicense.com/licenses/mit/)