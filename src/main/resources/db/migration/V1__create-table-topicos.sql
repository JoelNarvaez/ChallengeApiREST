CREATE TABLE topicos (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     titulo VARCHAR(200) NOT NULL,
     mensaje TEXT NOT NULL,
     fecha_creacion DATETIME NOT NULL,
     status BOOLEAN NOT NULL,
     autor VARCHAR(100) NOT NULL,
     curso VARCHAR(100) NOT NULL
);