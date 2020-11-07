-- Table client
INSERT INTO client (id) VALUES (1);
INSERT INTO client (name) VALUES ('Dupont');
INSERT INTO client (id_voiture) VALUES (1);

INSERT INTO client (id) VALUES (2);
INSERT INTO client (name) VALUES ('Chandonnet');
INSERT INTO client (id_voiture) VALUES (2);

INSERT INTO client (id) VALUES (3);
INSERT INTO client (name) VALUES ('Melanson');
INSERT INTO client (id_voiture) VALUES (3);

INSERT INTO client (id) VALUES (4);
INSERT INTO client (name) VALUES ('Leclair');
INSERT INTO client (id_voiture) VALUES (4);

INSERT INTO client (id) VALUES (5);
INSERT INTO client (name) VALUES ('Dagenais');
INSERT INTO client (id_voiture) VALUES (5);

INSERT INTO client (id) VALUES (6);
INSERT INTO client (name) VALUES ('Austin');
INSERT INTO client (id_voiture) VALUES (6);

INSERT INTO client (id) VALUES (7);
INSERT INTO client (name) VALUES ('Neufville');
INSERT INTO client (id_voiture) VALUES (7);

INSERT INTO client (id) VALUES (8);
INSERT INTO client (name) VALUES ('Bertrand');
INSERT INTO client (id_voiture) VALUES (8);

INSERT INTO client (id) VALUES (9);
INSERT INTO client (name) VALUES ('Gano');
INSERT INTO client (id_voiture) VALUES (9);

INSERT INTO client (id) VALUES (10);
INSERT INTO client (name) VALUES ('Lussier');
INSERT INTO client (id_voiture) VALUES (10);

-- Table voiture

INSERT INTO voiture (id) VALUES (1);
INSERT INTO voiture (name) VALUES ('208');
INSERT INTO voiture (id_marque) VALUES (1);

INSERT INTO voiture (id) VALUES (2);
INSERT INTO voiture (name) VALUES ('308');
INSERT INTO voiture (id_marque) VALUES (1);

INSERT INTO voiture (id) VALUES (3);
INSERT INTO voiture (name) VALUES ('Kangoo');
INSERT INTO voiture (id_marque) VALUES (2);

INSERT INTO voiture (id) VALUES (4);
INSERT INTO voiture (name) VALUES ('Captur');
INSERT INTO voiture (id_marque) VALUES (2);

INSERT INTO voiture (id) VALUES (5);
INSERT INTO voiture (name) VALUES ('944');
INSERT INTO voiture (id_marque) VALUES (3);

INSERT INTO voiture (id) VALUES (6);
INSERT INTO voiture (name) VALUES ('Macan');
INSERT INTO voiture (id_marque) VALUES (3);

INSERT INTO voiture (id) VALUES (7);
INSERT INTO voiture (name) VALUES ('C1');
INSERT INTO voiture (id_marque) VALUES (4);

INSERT INTO voiture (id) VALUES (8);
INSERT INTO voiture (name) VALUES ('C3');
INSERT INTO voiture (id_marque) VALUES (4);

INSERT INTO voiture (id) VALUES (9);
INSERT INTO voiture (name) VALUES ('A1');
INSERT INTO voiture (id_marque) VALUES (5);

INSERT INTO voiture (id) VALUES (10);
INSERT INTO voiture (name) VALUES ('A2');
INSERT INTO voiture (id_marque) VALUES (5);

-- Table marque

INSERT INTO marque (id) VALUES (1);
INSERT INTO marque (name) VALUES ('Peugeot');

INSERT INTO marque (id) VALUES (2);
INSERT INTO marque (name) VALUES ('Renault');

INSERT INTO marque (id) VALUES (3);
INSERT INTO marque (name) VALUES ('Porsche');

INSERT INTO marque (id) VALUES (4);
INSERT INTO marque (name) VALUES ('Citroën');

INSERT INTO marque (id) VALUES (5);
INSERT INTO marque (name) VALUES ('Audi');

-- Table marque_concessionnaire

INSERT INTO marque_concessionnaire (id_marque) VALUES (1);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (1);

INSERT INTO marque_concessionnaire (id_marque) VALUES (2);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (1);

INSERT INTO marque_concessionnaire (id_marque) VALUES (2);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (2);

INSERT INTO marque_concessionnaire (id_marque) VALUES (3);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (1);

INSERT INTO marque_concessionnaire (id_marque) VALUES (3);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (2);

INSERT INTO marque_concessionnaire (id_marque) VALUES (3);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (3);

INSERT INTO marque_concessionnaire (id_marque) VALUES (3);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (4);

INSERT INTO marque_concessionnaire (id_marque) VALUES (3);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (5);

INSERT INTO marque_concessionnaire (id_marque) VALUES (4);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (4);

INSERT INTO marque_concessionnaire (id_marque) VALUES (4);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (1);

INSERT INTO marque_concessionnaire (id_marque) VALUES (5);
INSERT INTO marque_concessionnaire (id_concessionnaire) VALUES (1);

-- Table concessionnaire

INSERT INTO concessionnaire (id) VALUES (1);
INSERT INTO concessionnaire (name) VALUES ('Automobile');
INSERT INTO concessionnaire (id_adresse) VALUES (1);

INSERT INTO concessionnaire (id) VALUES (2);
INSERT INTO concessionnaire (name) VALUES ('Car company');
INSERT INTO concessionnaire (id_adresse) VALUES (2);

INSERT INTO concessionnaire (id) VALUES (3);
INSERT INTO concessionnaire (name) VALUES ('Car seller');
INSERT INTO concessionnaire (id_adresse) VALUES (3);

INSERT INTO concessionnaire (id) VALUES (4);
INSERT INTO concessionnaire (name) VALUES ('Concession');
INSERT INTO concessionnaire (id_adresse) VALUES (4);

INSERT INTO concessionnaire (id) VALUES (5);
INSERT INTO concessionnaire (name) VALUES ('Vroom');
INSERT INTO concessionnaire (id_adresse) VALUES (5);

-- Table adresse

INSERT INTO concessionnaire (id) VALUES (1);
INSERT INTO concessionnaire (num_rue) VALUES (8)
INSERT INTO concessionnaire (rue) VALUES ("Rue bleue");
INSERT INTO concessionnaire (code_postal) VALUES (59000);
INSERT INTO concessionnaire (ville) VALUES ('Lille');

INSERT INTO concessionnaire (id) VALUES (2);
INSERT INTO concessionnaire (num_rue) VALUES (55)
INSERT INTO concessionnaire (rue) VALUES ("Rue royale");
INSERT INTO concessionnaire (code_postal) VALUES (75000);
INSERT INTO concessionnaire (ville) VALUES ('Paris');

INSERT INTO concessionnaire (id) VALUES (3);
INSERT INTO concessionnaire (num_rue) VALUES (420)
INSERT INTO concessionnaire (rue) VALUES ("Rue de la clef");
INSERT INTO concessionnaire (code_postal) VALUES (59120);
INSERT INTO concessionnaire (ville) VALUES ('Loos');

INSERT INTO concessionnaire (id) VALUES (4);
INSERT INTO concessionnaire (num_rue) VALUES (11)
INSERT INTO concessionnaire (rue) VALUES ("Boulevard Vauban");
INSERT INTO concessionnaire (code_postal) VALUES (59200);
INSERT INTO concessionnaire (ville) VALUES ('Tourcoing');

INSERT INTO concessionnaire (id) VALUES (5);
INSERT INTO concessionnaire (num_rue) VALUES (12)
INSERT INTO concessionnaire (rue) VALUES ("Boulevard Louis XIV");
INSERT INTO concessionnaire (code_postal) VALUES (59000);
INSERT INTO concessionnaire (ville) VALUES ('Lille');