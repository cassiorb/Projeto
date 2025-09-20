-- Criação do banco de dados
CREATE DATABASE IF NOT EXISTS taskio;
USE taskio;

-- Tabela de usuários
CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) UNIQUE NOT NULL,
    senha VARCHAR(255) NOT NULL,
    tipo ENUM('supervisor', 'tecnico') NOT NULL
);

-- Tabela de tarefas
CREATE TABLE tarefas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(200) NOT NULL,
    descricao TEXT NOT NULL,
    data_meta VARCHAR(10) NOT NULL,
    responsavel VARCHAR(100) NOT NULL,
    prioridade VARCHAR(10) NOT NULL,
    concluida BOOLEAN DEFAULT FALSE,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES usuarios(id) ON DELETE CASCADE
);

-- Inserção de usuários de teste
INSERT INTO usuarios (email, senha, tipo) VALUES 
('supervisor@empresa.com', '123456', 'supervisor'),
('tecnico@empresa.com', '123456', 'tecnico');



