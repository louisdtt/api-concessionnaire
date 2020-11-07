-- Table client
INSERT INTO client VALUES (1,'Dupont',1);

INSERT INTO client  VALUES (2,'Chandonnet',2);

INSERT INTO client  VALUES (3,'Melanson', 3);

INSERT INTO client  VALUES (4,'Leclair',4);

INSERT INTO client  VALUES (5,'Dagenais',5);

INSERT INTO client  VALUES (6,'Austin',6);

INSERT INTO client VALUES (7,'Neufville',7);

INSERT INTO client VALUES (8,'Bertrand',8);

INSERT INTO client VALUES (9,'Gano',9);

INSERT INTO client VALUES (10,'Lussier',10);

-- Table voiture

INSERT INTO voiture VALUES (1,'208',1);

INSERT INTO voiture VALUES (2,'308',1);

INSERT INTO voiture VALUES (3,'Kangoo',2);

INSERT INTO voiture VALUES (4,'Captur',2);

INSERT INTO voiture VALUES (5,'944',3);

INSERT INTO voiture VALUES (6,'Macan',3);

INSERT INTO voiture VALUES (7,'C1',4);

INSERT INTO voiture VALUES (8,'C3',4);

INSERT INTO voiture VALUES (9,'A1',5);

INSERT INTO voiture VALUES (10,'A2',5);

-- Table marque

INSERT INTO marque VALUES (1,'Peugeot');

INSERT INTO marque VALUES (2,'Renault');

INSERT INTO marque VALUES (3,'Porsche');

INSERT INTO marque VALUES (4,'Citroën');

INSERT INTO marque VALUES (5,'Audi');


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

-- Table concessionnaire

INSERT INTO concessionnaire VALUES (1, 'Automobile', 1);
INSERT INTO concessionnaire VALUES (2, 'Car company', 3);
INSERT INTO concessionnaire VALUES (3, 'Car seller', 3);
INSERT INTO concessionnaire VALUES (4, 'Concession', 4);
INSERT INTO concessionnaire VALUES (5, 'Vroom', 5);

-- Table adresse

INSERT INTO adresse VALUES (1, 8, 'Rue bleue', 59000, 'Lille');
INSERT INTO adresse VALUES (2, 55, 'Rue royale', 75000, 'Paris');
INSERT INTO adresse VALUES (3, 420, 'Rue de la clef', 59120);
INSERT INTO adresse VALUES (4, 11, 'Boulevard Vauban', 59200, 'Tourcoing');
INSERT INTO adresse VALUES (5, 12, 'Boulevard Louis XIV', 59000, 'Lille');