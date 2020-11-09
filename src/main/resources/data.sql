-- Table client
INSERT INTO client VALUES (1,'Dupont');
INSERT INTO client  VALUES (2,'Chandonnet');
INSERT INTO client  VALUES (3,'Melanson');
INSERT INTO client  VALUES (4,'Leclair');
INSERT INTO client  VALUES (5,'Dagenais');
INSERT INTO client  VALUES (6,'Austin');
INSERT INTO client VALUES (7,'Neufville');
INSERT INTO client VALUES (8,'Bertrand');
INSERT INTO client VALUES (9,'Gano');
INSERT INTO client VALUES (10,'Lussier');


-- Table marque

INSERT INTO marque VALUES (1,'Peugeot');
INSERT INTO marque VALUES (2,'Renault');
INSERT INTO marque VALUES (3,'Porsche');
INSERT INTO marque VALUES (4,'Citroën');
INSERT INTO marque VALUES (5,'Audi');


-- Table voiture

INSERT INTO voiture VALUES (1,'208',3,1);
INSERT INTO voiture VALUES (2,'308',2,1);
INSERT INTO voiture VALUES (3,'Kangoo',7,2);
INSERT INTO voiture VALUES (4,'Captur',1,2);
INSERT INTO voiture VALUES (5,'944',4,3);
INSERT INTO voiture VALUES (6,'Macan',5,3);
INSERT INTO voiture VALUES (7,'C1',9,4);
INSERT INTO voiture VALUES (8,'C3',6,4);
INSERT INTO voiture VALUES (9,'A1',8,5);
INSERT INTO voiture VALUES (10,'A2',10,5);


-- Table adresse

INSERT INTO adresse VALUES (1, 59000, 23, 'Rue bleue', 'Lille');
INSERT INTO adresse VALUES (2, 75000, 3, 'Rue royale', 'Paris');
INSERT INTO adresse VALUES (3, 59120, 80, 'Rue de la clef', 'Tourcoing');
INSERT INTO adresse VALUES (4, 59200, 4, 'Boulevard Vauban', 'Tourcoing');
INSERT INTO adresse VALUES (5, 59000, 6, 'Boulevard Louis XIV', 'Lille');


-- Table concessionnaire

INSERT INTO concessionnaire VALUES (1, 'Automobile', 1);
INSERT INTO concessionnaire VALUES (2, 'Car company', 3);
INSERT INTO concessionnaire VALUES (3, 'Car seller', 3);
INSERT INTO concessionnaire VALUES (4, 'Concession', 4);
INSERT INTO concessionnaire VALUES (5, 'Vroom', 5);


-- Table marque_concessionnaire

INSERT INTO marque_concessionnaire VALUES (1,1);
INSERT INTO marque_concessionnaire VALUES (2,1);
INSERT INTO marque_concessionnaire  VALUES (2,2);
INSERT INTO marque_concessionnaire  VALUES (3,1);
INSERT INTO marque_concessionnaire  VALUES (3,2);
INSERT INTO marque_concessionnaire  VALUES (3,3);
INSERT INTO marque_concessionnaire  VALUES (3,4);
INSERT INTO marque_concessionnaire  VALUES (3,5);
INSERT INTO marque_concessionnaire  VALUES (4,4);
INSERT INTO marque_concessionnaire  VALUES (4,1);
INSERT INTO marque_concessionnaire  VALUES (5,1);