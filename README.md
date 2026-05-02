📦 Gestion de Stock - Application Java (NetBeans / JDK 1.8)

🧾 Description du projet

Cette application est un système de gestion de stock complet développé en Java (Swing) avec NetBeans (JDK 1.8) et une base de données MySQL (phpMyAdmin).

Elle permet de gérer :

les utilisateurs (login / mot de passe)

les fournisseurs et clients

les achats et ventes

le stock de produits

les factures

les statistiques de l’activité


🔐 Authentification

L’application commence par une interface de connexion :

Login

Mot de passe

<img width="613" height="332" alt="Login" src="https://github.com/user-attachments/assets/9e66ff67-fdc9-4b3e-bdd9-ee096a680cc4" />

Après connexion, l’utilisateur peut :

modifier ses informations (login + mot de passe)

<img width="718" height="287" alt="Modification_Login" src="https://github.com/user-attachments/assets/57b2e3ef-0399-4f7a-ade7-c045d16c30de" />


<img width="507" height="67" alt="Change_Information" src="https://github.com/user-attachments/assets/831370ba-e01b-47a4-ba7c-6a2bd08afa03" />

🏠 Interface principale (Accueil)

Après authentification, l’utilisateur accède à un menu principal qui permet de naviguer entre les modules :

<img width="852" height="537" alt="Main" src="https://github.com/user-attachments/assets/44b5d3ba-342c-49c1-90a5-ca2c9cd8a9cf" />

👥 Module Fournisseurs / Clients

Gestion complète des partenaires :

Fournisseurs / Clients:

Ajouter un fournisseur / client

Modifier un fournisseur / client

Supprimer un fournisseur / client

Afficher la liste / client 

<img width="1350" height="710" alt="Fournisseur Client" src="https://github.com/user-attachments/assets/aee9e861-c993-4f41-8c74-fcfb6a601d08" />

🛒 Module Achat

Ce module permet :

d’enregistrer des achats

d’afficher la liste des achats

de calculer les totaux (quantité + prix)

de filtrer les achats

d’imprimer un reçu d’achat

<img width="1041" height="717" alt="Achat_Détails" src="https://github.com/user-attachments/assets/86763f2a-fbdf-48ce-9efd-22a194f72b75" />

<img width="502" height="430" alt="Print" src="https://github.com/user-attachments/assets/48e4575c-1442-4a2a-a3a1-f1898a6ee394" />

📦 Module Stock

Gestion des produits en stock :

Affichage des produits disponibles

Mise à jour automatique des quantités

Gestion des produits archivés


Suivi des entrées et sorties

<img width="1207" height="810" alt="Stock" src="https://github.com/user-attachments/assets/ae37a010-65bd-432c-a2de-f7c611724e6d" />

<img width="867" height="480" alt="Archives" src="https://github.com/user-attachments/assets/74216199-0cc4-4cbf-8ae5-d7677d1456fa" />

🧾 Module Vente

Ce module permet :

d’ajouter une vente

de calculer automatiquement le prix et le bénéfice

d’afficher l’historique des ventes

d’imprimer un ticket de vente

<img width="1057" height="725" alt="entes" src="https://github.com/user-attachments/assets/916a40ca-7d41-4239-8ce8-43ae58c040b0" />

🧾 Module Facturation

Gestion des factures clients :

Création de facture

Suivi des paiements

Montant à payer / versé / reste

Historique des factures

<img width="1192" height="762" alt="Factures" src="https://github.com/user-attachments/assets/151381e5-4463-4fae-af7d-45eb5b4c36d6" />

📊 Module Statistiques

Une interface dédiée permet de visualiser :

chiffre d’affaires total

bénéfices

nombre de ventes

produits les plus vendus

statistiques générales du système

<img width="642" height="467" alt="Statistiques" src="https://github.com/user-attachments/assets/50d26425-4dce-4f4d-8618-841a71bbd1d1" />

🗄️ Base de données


SGBD : MySQL

Gestion via phpMyAdmin

<img width="186" height="172" alt="DB" src="https://github.com/user-attachments/assets/013b4efe-7f84-470f-b73e-e88743e8ba1e" />

Technologies utilisées
Java (JDK 1.8)

Swing (interface graphique)

JDBC (connexion base de données)

MySQL

NetBeans IDE
