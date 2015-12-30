CREATE TABLE Alumnos (idAlumnos INTEGER,
					nombre varchar(80), 
					apellido varchar(80), 
					email varchar(30)) unique,
					idGrupos INTEGER, 
                    PRIMARY KEY (idAlumnos),
                    FOREIGN KEY (idGrupos) REFERENCES Grupos(idGrupos) ON DELETE CASCADE ON UPDATE NO ACTION,
					);

CREATE TABLE Asignaturas (idAsignaturas INTEGER,
					nombre varchar(30),
                    PRIMARY KEY (idAsignaturas)
                    );

CREATE TABLE Notas (idAlumnos INTEGER,
					idAsignaturas INTEGER,
					1eva INTEGER,
					2eva INTEGER,
					3eva INTEGER,
					final INTEGER,
					FOREIGN KEY (idAlumnos) REFERENCES Alumnos(idAlumnos) ON DELETE CASCADE ON UPDATE CASCADE,
					FOREIGN KEY (idAsignaturas) REFERENCES Asignaturas(idAsignaturas) ON DELETE CASCADE ON UPDATE CASCADE,
					PRIMARY KEY (idAlumnos, idAsignaturas)
					);

CREATE TABLE Grupos (idGrupos INTEGER,
					nombre varchar(30) NOT NULL UNIQUE,
					aula char(3),
					PRIMARY KEY (idGrupos)
					);

CREATE TABLE Delegados (idAlumnos INTEGER,
						idGrupos INTEGER,
						FOREIGN KEY (idAlumnos) REFERENCES Alumnos(idAlumnos) ON DELETE CASCADE ON UPDATE CASCADE,
						FOREIGN KEY (idGrupos) REFERENCES Grupos(idGrupos) ON DELETE CASCADE ON UPDATE CASCADE,
						PRIMARY KEY (idAlumnos, idGrupos)
						)

CREATE TABLE Profesores (idProfesores INTEGER,
						nombre varchar(30),
						apellido varchar(80), 
						email char NOT NULL UNIQUE,
						idAsignaturas INTEGER,
						FOREIGN KEY (idAsignaturas) REFERENCES Asignaturas(idAsignaturas) ON DELETE CASCADE ON UPDATE CASCADE,
						PRIMARY KEY (idProfesores,idAsignaturas)
						);