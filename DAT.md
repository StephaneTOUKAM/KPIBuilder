# __KPIBuilder__ 🤖

Ceci est le Document d'Architecture Technique du projet __KPIBuilder__

## __Que mettre dans chacun des packages ?__

Plusieurs package ont ete cree dans le projet, avant d'y travailler, nous vous listons les objectifs de chacun de ces packages:

- __models__: Ici on mettra les modeles de l'application comme: Graphe qui va contenir les types de graphes pris en charge
- __models.enums__: Ce package se trouve dans le package enum et permettra d'enregistrer chacun des enumerations intervenant dans le projet
- __controllers__: Ici, on mettra chacun des endpoints du projet, ce sera le point d'entree des requetes et leur point de sortie
- __services__: Ici, on fera toutes les actions directement liees aux modeles
- __helpers__: Ici, on mettra les fonctions qui se repetent pour les reutiliser plus facilement dans le projet

## __Les flows cote Front__

### __Affichage Histogramme Graphe__  
![alt Histogramme Graphe](src/main/resources/static/modelisation/images/mermaid-front-get-histogramme-stats.png?raw=true "Histogramme Graphe")

### __Affichage Pie Chart Graphe__  
![alt Pie Chart Graphe](src/main/resources/static/modelisation/images/mermaid-front-get-pie-chart-stats.png?raw=true "Pie Chart Graphe")  

## __Les flows cote Back__

### __Affichage Tous les modeles__  
![alt Tous les modeles](src/main/resources/static/modelisation/images/mermaid-req-get-models.png?raw=true "Tous les modeles")

### __Affichage Modele Specifique__  
![alt Modele Specifique](src/main/resources/static/modelisation/images/mermaid-req-get-specific-model.png?raw=true "Modele Specifique")

### __Affichage Construction Stats Data__  
![alt Construction Stats Data](src/main/resources/static/modelisation/images/mermaid-req-build-stats.png?raw=true "Construction Stats Data")
