DROP TABLE IF EXISTS Odontologos;
CREATE TABLE Odontologos (
    id LONG AUTO_INCREMENT PRIMARY KEY,
    numero_matricula INT NOT NULL,
    nombre VARCHAR(50) NOT NULL,
    apellido VARCHAR(50) NOT NULL
);

INSERT INTO Odontologos (numero_matricula, nombre, apellido) VALUES (100, 'Pedrito', 'Balasa');

INSERT INTO Odontologos (numero_matricula, nombre, apellido) VALUES (101 , 'Sofia', 'Pedrousa');
