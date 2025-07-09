CREATE DATABASE EventoPresencialDB;
GO

USE EventoPresencialDB;
GO

CREATE TABLE EventoPresencial (
    EventoID INT IDENTITY(1,1) PRIMARY KEY,
    Nombre NVARCHAR(100) NOT NULL,
    Descripcion NVARCHAR(MAX) NOT NULL,
    FechaEvento DATE NOT NULL,
    Estado NVARCHAR(50) NULL,
    Lugar NVARCHAR(100) NOT NULL,
    TipoLugar NVARCHAR(50) NOT NULL
);
GO

INSERT INTO EventoPresencial (Nombre, Descripcion, FechaEvento, Estado, Lugar, TipoLugar)
VALUES
    ('Festival de Cultura', 'Presentación de danzas folklóricas', '2025-08-10', 'Programado', 'Parque Central', 'Parque'),
    ('Charla de Historia', 'Conferencia sobre historia local', '2025-07-25', 'En curso', 'Sala 101 - Centro Cultural', 'Sala de conferencias'),
    ('Obra de Teatro', 'Obra "La Casa de Bernarda Alba"', '2025-09-15', 'Finalizado', 'Teatro Nacional', 'Teatro');
GO

SELECT * FROM EventoPresencial;
GO
